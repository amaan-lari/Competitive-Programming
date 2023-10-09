package Starter 60;

import java.util.*;
import java.io.*;
class ArrPal {
    // For fast input output
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        { try {br = new BufferedReader(
            new FileReader("input.txt"));
            PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(out);}
        catch(Exception e) { br = new BufferedReader(new InputStreamReader(System.in));}
        }
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {st = new StringTokenizer(br.readLine());}
                catch (IOException e) {
                    e.printStackTrace();}
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() {return Double.parseDouble(next()); }
        String nextLine()
        {
            String str = "";
            try {
            str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        while (t-- != 0) {
            int n = reader.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                ar.add(reader.nextInt());
            }
            int mid = n % 2 == 0 ? n / 2 - 1 : n / 2 ;
            int[] left = new int[n/2];
            int[] right = new int[n/2];
            boolean flag = true;
            for (int i = 0; i <= mid; i++) {
                if(!(ar.get(i) == ar.get(n - i - 1))) {
                    flag = false;
                    break;
                }
            }

            for (int i = 0, j = mid; i < right.length; i++) {
                right[i] = ar.get(j++) + 0;
            }

            for (int i = 0, j = 0; i < right.length; i++) {
                left[i] = ar.get(j++) + 0;
            }
            if(flag) {
                System.out.println(0);
            }
            else if(isSortedArray(right, n/2) && isSortedArray(left, n/2)) {
                System.out.println(right[right.length - 1] - left[0]);
            } else {
                System.out.println(-1);
            }
        }
    }
    static boolean isSortedArray(int[] array, int n){
        if(n == 1 || n == 0) return true;
        return array[n-2] <= array[n-1] && isSortedArray(array, n-1);
    }
}