package LeetCode.daily_challenge._456;

import java.util.*;
import java.io.*;
public class Main {
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
        LeetCode.daily_challenge._456.Main.FastReader reader = new LeetCode.daily_challenge._456.Main.FastReader();
        int n = reader.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = reader.nextInt();
        }
        System.out.println(solution(ar));
    }

    public static boolean solution(int[] nums) {
        int n = nums.length;
        Stack<Integer> numStack = new Stack<>();
        int min = nums[0];

        for (int i = 1; i < n; i++) {

            while (!numStack.empty() && nums[i] >= numStack.peek())
                numStack.pop();
            if (!numStack.empty() && nums[i] < numStack.peek() && min < nums[i])
                return true;

            numStack.push(nums[i]);
            min = Math.min(min, nums[i]);
        }
        return false;
    }
}
