package Practice;

public class Day1LinearSearch{
    public static void main(String args[]){
        int[] nums = {32,12,34,54,76,96,21};
        int target = 960;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i < arr.length; i++){ 
            int element = arr[i];
            if(element == target){ 
                return i;
            }
        }

        return -1;
    }
}