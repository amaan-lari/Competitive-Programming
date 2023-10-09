import java.util.*;
import java.io.*;
import java.lang.reflect.Method;
class DOMINANT2 {
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
            ArrayList<Integer> ar = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                ar.add(reader.nextInt());
                set.add(ar.get(i));
            }
            ArrayList<Integer> freqList = new ArrayList<>();
        
            Iterator it = set.iterator();
            while (it.hasNext()) {
                freqList.add(Collections.frequency(ar, it.next()));
            }
            Collections.sort(freqList);
            if(freqList.size() != 1 && freqList.get(freqList.size()-1) == 
               freqList.get(freqList.size()-2)) {

                System.out.println("No");
            }
            else 
                System.out.println("Yes");
        }
    }
}