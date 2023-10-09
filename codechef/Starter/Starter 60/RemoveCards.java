package Starter 60;

import java.util.*;
import java.io.*;
class RemoveCards {
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
            int[] ar = new int[n];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = reader.nextInt();
            }
            Arrays.sort(ar);
            int item = ar[0], freq = 0, max = 0;
            for(int i = 0; i < ar.length; i++) {
                if(ar[i] == item) {
                    freq++;
                }
                else {
                    if(freq > max) {
                        max = freq;
                    }
                    item = ar[i];
                    freq = 1;
                }
            }
            if(freq > max) {
                max = freq;
            }
            System.out.println(n - max);
        }
    }
}