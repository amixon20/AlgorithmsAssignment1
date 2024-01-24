import java.util.Scanner;

public class LongestCommon {

    int lcs(String s, String t, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (s.charAt(m - 1) == t.charAt(n - 1))
            return 1 + lcs(s, t, m - 1, n - 1);
        else
            return Math.max(lcs(s, t, m, n - 1), lcs(s, t, m - 1, n));
    }
    public static void main(String[] args) {
        LongestCommon longest = new LongestCommon();
        Scanner scan = new Scanner(System.in);
        System.out.println("This program determines the length of the longest common subsequence of two strings."
                            + "\n Please enter the first string.");
        String s = scan.nextLine();
        System.out.println("Please enter the second string.");
        String t = scan.nextLine();
        int m = s.length();
        int n = t.length();
        int result = longest.lcs(s, t, m, n);
        System.out.println("Longest Common Subsequence:" + " " + result);
    }
}
