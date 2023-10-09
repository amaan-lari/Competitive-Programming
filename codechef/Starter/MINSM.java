import java.util.*;
import java.io.*;
class MINSM {
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

    // Numbers class to perform number related 
    static class Numbers {
                
        public static boolean isPrime (int n) {
            for(int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static int factor(int n, List<Integer> a) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (a.contains(i)) {
                        return i;
                    }
                }
            }
            return n;
        }

        public static long gcd(long a, long b) {
            // if(a % b == 0) {
            //     return Math.min(a, b);
            // }
            // else {
            //     return gcd(b, a % b);
            // }

            if(b==0){
                return a;
            }
            else{ 
                return gcd(b,a%b);
            }
        }
    }

    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        while (t-- != 0) {
            int n = reader.nextInt();
            List<Integer> A = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                A.add(reader.nextInt());
            } 
            Collections.sort(A);
            
            long Aj = A.get(0);
            for (int i = 0; i < n ; i++) {
                long Ai = A.get(i);
                Aj = Numbers.gcd(Ai, Aj);           
            }
            
            System.out.println(Aj * n);
        }
    }
}