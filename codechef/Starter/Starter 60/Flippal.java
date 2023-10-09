package Starter 60;

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
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        while (t-- != 0) {
            int n = reader.nextInt();
            String s = reader.nextLine();
            int count1 = 0, count0 = 0, length = s.length();
            for(int i = 0; i < length; i++) {
                if (s.charAt(i) == '1') {
                    count1++;
                } else {
                    count0++;
                }
            }
            if(n % 2 == 0) {
                if (count0 % 2 == 0 && count1 % 2 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                if ((count0 % 2 == 1 && count1 % 2 == 0) || (count0 % 2 == 0 && count1 % 2 == 1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}