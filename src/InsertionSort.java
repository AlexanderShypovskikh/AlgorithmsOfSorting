import java.util.Arrays;

/**
 * Created by Alexander Shypovskikh on 03.07.2016.
 */
public class InsertionSort {
    public static void main(String[] args) {
    int[] array = new int[2000];
    long timeStart = System.currentTimeMillis();
    System.out.println(Arrays.toString(insertionSort(initArray(array))));
    long timeStop = System.currentTimeMillis();
    System.out.println("lead time = "+(timeStop - timeStart)+"ms");
}

    public static int[] initArray(int[] array){
        for(int i = 0; i < 2000; i++){
            array[i] = (i+2)*(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] insertionSort(int[] array){
        int j;
        int buff;
        for(int i = 1; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            buff = array[i];
            j = i-1;
            while((j >= 0) && (array[j] > buff)){
                array[j+1] = array[j];
                j--;
            }
           array[j+1] = buff;
        }
        return array;
    }

}
