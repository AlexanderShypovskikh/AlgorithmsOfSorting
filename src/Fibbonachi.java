import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Al on 05.07.2016.
 */
public class Fibbonachi {
    public static void main(String[] args) {
        countFibbonachiSequence(5);
        //System.out.println(countFibbonachiSequence(5));
    }
     public  static long countFibbonachiSequence(int countOfElements){
        if(countOfElements == 0) {
            return 0;

        }
        else if(countOfElements == 1){
             return (1 + countFibbonachiSequence(0));
         }
        else {
            long sum = countFibbonachiSequence(countOfElements-1) +  countFibbonachiSequence(countOfElements -2);
            return sum;
            }
        }

}
