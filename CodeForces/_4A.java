import java.io.*;

/**
 * #4A - Watermelon 
 * brute force, math
 */
public class _4A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int w = Integer.parseInt(br.readLine());
            if (w % 2 == 0 && w != 2) 
                System.out.println("YES");
              else
                System.out.println("NO");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}