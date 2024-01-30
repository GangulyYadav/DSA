package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("How many numbers you want to enter in the list: ");
        int n = inp.nextInt();

        for( int i = 0; i < n; i++){
            list.add(inp.nextInt());
        }

        revesre(list);
        System.out.println(list);


    }

    static void revesre(ArrayList<Integer> list){
        int start = 0;
        int end = list.size() - 1;

        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}
