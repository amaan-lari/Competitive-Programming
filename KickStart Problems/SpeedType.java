import java.util.*;

public class SpeedType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 1;
        while (a <= t ) {
            if (a==1) {
                sc.nextLine();
            }
            String I = sc.nextLine();
            String P = sc.nextLine();
            int cnt = 0;
            int li = I.length();
            int lp = P.length();
            System.out.print("Case #"+a+": ");
            if (li < lp) {
                for (int i = 0; i < li; i++) {
                    if (P.charAt(i) != I.charAt(i)) {
                        P = P.substring(0, i) + P.substring(i + 1)+P.substring(i, i+1);
                        i--;
                        cnt++;
                        if (cnt >= lp) {
                            break;
                        }
                    }
                }
                if (P.substring(0,li).equals(I)) {
                    if (P.length()!=I.length()) {
                        cnt = P.length() - I.length();
                    }
                    System.out.println(cnt);
                } else {
                    System.out.println("IMPOSSIBLE");
                }
            } else {
                System.out.println("IMPOSSIBLE");
            }
            a++;
        }
        sc.close();
    }
    // static void solve() {
    // Scanner sc = new Scanner(System.in);
    // String I = sc.nextLine();
    // String P = sc.nextLine();
    // int cnt = 0;
    // int li = I.length();
    // int lp = P.length();
    // if (li < lp) {
    // for (int i = 0; i < li; i++) {
    // if (P.charAt(i) != I.charAt(i)) {
    // P = P.substring(0, i) + P.substring(i+1);
    // i--;
    // cnt++;
    // }
    // }
    // if (P.equals(I)) {
    // System.out.println(cnt);
    // } else {
    // System.out.println("IMPOSSIBLE");
    // }
    // } else {
    // System.out.println("IMPOSSIBLE");
    // }
    // sc.close();
    // }
}
