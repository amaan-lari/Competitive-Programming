import java.util.*;
import java.io.*;
public class _231A {
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
        int count = 0;
        while (n-- != 0) {
            int ar[] = new int[3];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = reader.nextInt();
            }
            int friendCount = 0;
            for (int i : ar) {
                if (i == 1) {
                    friendCount++;
                }
            }
            if (friendCount >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}