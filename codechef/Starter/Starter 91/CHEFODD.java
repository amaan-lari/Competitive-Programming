import java.util.*;
import java.io.*;
public class CHEFODD {
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
            int k = reader.nextInt();
            int no_of_odds = n % 2 == 0? n/2 : n/2 + 1;
            int even_partition = no_of_odds / 2;
            int x = no_of_odds;
            while (even_partition >= 0) {
                x = no_of_odds - (even_partition * 2);
                even_partition--;
                if (x % k == 0)
                    break;
            }
            if(x % k == 0)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}