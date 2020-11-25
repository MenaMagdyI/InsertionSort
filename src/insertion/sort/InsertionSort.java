package insertion.sort;

/**
 *
 * @author Mina
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newelement = arr[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newelement; i--) {

                arr[i] = arr[i - 1];

            }
            arr[i] = newelement;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }

}
