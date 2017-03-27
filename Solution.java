import java.util.Scanner;/*
Массив из строчек в обратном порядке !!!!!!!&&&&&&&7777777???????????
;pojupo9upupoupouipoipouio
klll
lkkk
lohjlhjoij
no nono  no
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] array = new String[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            array[i]= scan.next();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length-1-i]);

        }
    }
}