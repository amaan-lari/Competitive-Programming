/**
 * PlusOne
 */
import java.util.*;
import java.io.*;
public class PlusOne {
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
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (reader.st.hasMoreElements()) {
            arrayList.add(reader.nextInt());
        }
        int[] digits = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            digits[i] = arrayList.get(i);
        }
        
        arrayList.removeAll(arrayList);
        digits = plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        int[] sum_digits = new int[digits.length + 1];
        int sum = digits[digits.length - 1], carry = 1;
        for (int i = digits.length; i > 0; i--) {
            sum = digits[i - 1] + carry;
            if(sum > 9) {
                carry = sum / 10;
                digits[i] = sum % 10;
            }
            else {
                digits[i] = sum;
                carry = 0;
            }
        }
        
    }
}