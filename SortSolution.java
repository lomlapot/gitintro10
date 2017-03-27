import java.util.Arrays;
/**
 * Created by Anton on 25.02.2017.
 */
public class SortSolution{
            public static void main(String[] args) {
            int[]array={1,3,6,4,22,8,6,9,12};
                for (int i = 0; i <array.length ; i++) {
                    System.out.print(array[i]+"  ");
                }
                System.out.println();
                Arrays.sort(array);
                for (int i = 0; i <array.length ; i++) {
                    System.out.print(array[i]+"  ");
                }
        }
}
