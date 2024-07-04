import java.util.*;


public class pair {
    public static void main(String[] args) {
        int[] inputs = {1, 2, 3, 4, 5};
        
        System.out.println("Pairs of Two:");
        int[][] pairsOfTwo = pairArrayElements(inputs, 2);
        for (int[] pair : pairsOfTwo) {
            System.out.println(Arrays.toString(pair));
        }


        System.out.println("\nPairs of Three:");
        int[][] pairsOfThree = pairArrayElements(inputs, 3);
        for (int[] pair : pairsOfThree) {
            System.out.println(Arrays.toString(pair));
        }
    }


    public static int[][] pairArrayElements(int[] array, int pairSize) {
        int length = array.length;
        int pairCount = (length + pairSize - 1) / pairSize;
        int[][] pairs = new int[pairCount][pairSize];


        for (int i = 0; i < length; i += pairSize) {
            for (int j = 0; j < pairSize; j++) {
                if (i + j < length) {
                    pairs[i / pairSize][j] = array[i + j];
                } else {
                    pairs[i / pairSize][j] = 0; 
                }
            }
        }


        return pairs;
    }
}