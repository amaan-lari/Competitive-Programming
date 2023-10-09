package LeetCode;

import java.util.*;
import java.io.*;
public class TwoSum {
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
        int n = reader.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = reader.nextInt();
        }
        int target = reader.nextInt();
        int[] indices = twoSum(ar, target);

        System.out.println(indices[0] + " " + indices[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for( int i = 0, j = i + 1; i < nums.length; i++) {
            if(j < nums.length) {
                int sum = nums[i] + nums[j];
                System.out.printf("Sum of ar[%d] and ar[%d] is %d\n",i, j, sum);
                if (sum == target){
                    int[] indices = {i, j};
                    return indices;
                }
                else {
                    j++;
                    i--;
                }
            }
            else {
                j = 0;
            }
        }
        int[] ar = {-1, -1};
        return (ar);
    }
}