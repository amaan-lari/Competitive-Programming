/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
import java.io.*;

/* 
 * Codechef contest START46
 * Problem Code : GRPASSN
 */
class GRPASSN {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        /*
         * For input using Scanner
         * Scanner sc = new Scanner(System.in);
         * int sc.nextInt();
         * String sc.nextLine();
         * sc.next().charAt(0);
         */
        /*
         * For input using BufferedReader
         * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         * int = Integer.parseInt(br.readLine());
         * String stream[] = br.readLine().split(" ");
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            String[] stream = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(stream[i]);
            }
            Arrays.sort(a);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            int num = a[0];
            ar.add(num);
            for (int i = 0; i < n; i++) {
                if (a[i] != num) {
                    ar.add(a[i]);
                    num = a[i];
                }
            }
            int f = 1;
            for (int i = 0; i < ar.size(); i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (ar.get(i) == a[j]) {
                        cnt++;
                    }
                }
                if (cnt % ar.get(i) != 0 || ar.get(i) > n) {
                    f = 0;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
