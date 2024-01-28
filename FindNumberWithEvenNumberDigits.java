public class FindNumberWithEvenNumberDigits {
    public static void main(String[] args) {
         int[] nums = {12,345,2,6,7896};
//         int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums) {
        int evenCount=0;
        for(int i = 0; i< nums.length; i++){
            int n=nums[i];
            int count=0;

            while(n>0){
                n = n/10;
                count++;
            }

            if(count%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
