import java.util.*;
import java.io.*;
public class _144A {
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
        for(int i = 0; i < n; i++)
            ar[i] = reader.nextInt();
        int max = ar[0];
        int min = ar[0];
        int pmin = 0, pmax = 0;
        for(int i = 0; i < n; i++)
        {
            if (ar[i] <= min) {
                min = ar[i];
                pmin = i;
            }
            if (ar[i] > max) {
                max = ar[i];
                pmax = i;
            }
        }
        int ans = pmax > pmin ? pmax + (n - pmin - 2) : pmax + (n - pmin - 1);
        System.out.println(ans);

    }
}