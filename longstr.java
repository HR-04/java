import java.util.Scanner;

public class LongStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        char[] X = str1.toCharArray();
        char[] Y = str2.toCharArray();

        int result = longestCommonsequence(X, Y);

        System.out.println("LENGTH OF LCS: " + result);
    }

    public static int longestCommonsequence(char[] X, char[] Y) {
        int A = X.length;
        int B = Y.length;
        int[][] L = new int[A + 1][B + 1];

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        return L[A][B];
    }
}
