import java.util.Scanner;
class stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String a = scanner.next();
            String b = scanner.next();
            System.out.println(morganAndString(a, b));
        }
    }


    public static String morganAndString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) < b.charAt(j)) {
                result.append(a.charAt(i));
                i++;
            } else if (a.charAt(i) > b.charAt(j)) {
                result.append(b.charAt(j));
                j++;
            } else {
                int k = i, index = j;
                while (k < a.length() && index < b.length() && a.charAt(k) == b.charAt(index)) {
                    k++;
                    index++;
                }
                if (k == a.length()) {
                    result.append(b.charAt(j));
                    j++;
                } else if (index == b.length()) {
                    result.append(a.charAt(i));
                    i++;
                } else if (a.charAt(k) < b.charAt(index)) {
                    result.append(a.charAt(i));
                    i++;
                } else {
                    result.append(b.charAt(j));
                    j++;
                }
            }
        }
        while (i < a.length()) {
            result.append(a.charAt(i));
            i++;
        }
        while (j < b.length()) {
            result.append(b.charAt(j));
            j++;
        }
        return result.toString();
    }
}
