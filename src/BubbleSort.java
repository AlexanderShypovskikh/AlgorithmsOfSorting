import java.util.Arrays;

/**
 * Created by Alexander Shypovskikh on 03.07.2016.
 */
public class BubbleSort {
    public static void main(String[] args) {
            int[] array = new int[2000];
        long timeStart = System.currentTimeMillis();
            System.out.println(Arrays.toString(bubleSort(initArray(array))));
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

        public static int[] bubleSort(int[] array){
            for(int i = 0; i < array.length -1; i++){
                System.out.println(Arrays.toString(array));
                for(int j = i+1; j < array.length; j++){
                    if(array[i] > array[j]){
                        int buff = array[i];
                        array[i] = array[j];
                        array[j] = buff;
                    }
                }

            }
            return array;
        }

    }
