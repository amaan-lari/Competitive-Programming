import java.io.*;
/**
 * #71A	Way Too Long Words
 * strings
 */
public class _71A {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String s = br.readLine();
            int length = s.length();
            if (length>10) {
                s = "" + s.charAt(0) + (length-2) + s.charAt(length-1);
            }
            System.out.println(s);
        }
    }
}