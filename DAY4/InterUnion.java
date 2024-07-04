public class interunion {
    public static void main(String[] args) {
        int[] a1 = {2, 7, 5, 9};
        int[] a2 = {8, 4, 2, 6};

        
        System.out.print("Union: ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        for (int i = 0; i < a2.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < a1.length; j++) {
                if (a2[i] == a1[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(a2[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Intersection: ");
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    System.out.print(a1[i] + " ");
                }
            }
        }
        System.out.println();
    }
}