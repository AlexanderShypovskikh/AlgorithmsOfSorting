import java.util.Arrays;

/**
 * Created by Alexander Shypovskikh on 03.07.2016.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[2000];
        long timeStart = System.currentTimeMillis();
        System.out.println("Sorted Array: "+ Arrays.toString(mergeSort(initArray(array), 0, array.length)));
        long timeStop = System.currentTimeMillis();
        System.out.println("lead time = " + (timeStop - timeStart) + "ms");
    }

    public static int[] initArray(int[] array) {
        for (int i = 0; i < 2000; i++) {
            array[i] = (i + 2) * (int) (Math.random() * 100);
        }
        System.out.println("Input Array: "+Arrays.toString(array));
        return array;
    }

    public static int[] mergeSort(int[] array, int from, int len){
        if (len == 0) {
            return new int[0];
        } else if (len == 1) {
            return new int[]{array[from]};
        } else if (len == 2) {
            if (array[from] < array[from + 1]) {
                return new int[]{array[from], array[from + 1]};
            } else {
                return new int[]{array[from + 1], array[from]};
            }
        } else {
            int[] left = mergeSort(array, from, len / 2);
            int[] right = mergeSort(array, from + (len / 2), len - (len / 2));
            return mergeArray(left, right);
        }
    }
    public static int[] mergeArray(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int[] result = new int[left.length + right.length];
        while ((i + j) < result.length) {
            if ((i < left.length) && (j < right.length)) {
                if (left[i] < right[j]) {
                    result[i + j] = left[i++];
                } else if (left[i] >= right[j]) {
                    result[i + j] = right[j++];
                }
            } else {
                if (i < left.length) result[i + j] = left[i++];
                else if (j < right.length) result[i + j] = right[j++];
            }

        }
        return result;
    }

}
