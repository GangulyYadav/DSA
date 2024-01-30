package Practice;

import java.util.Arrays;
import java.util.Scanner;
public class StringArray {
    public static void main(String args[]){
        String[] arr = new String[5];
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = inp.next();
        }

        System.out.println(Arrays.toString(arr));

    }
}
