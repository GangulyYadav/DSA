package LeetCode;
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target,arr));
    }


        static int findInMountainArray(int target, int[] mountainArr) {

            int peak = findPeak(mountainArr);


            if(binarySearch(mountainArr,target,0,peak,true) == -1){
                return binarySearch(mountainArr,target,peak+1,mountainArr.length-1,false);
            }else if(binarySearch(mountainArr,target,peak+1,mountainArr.length-1,false) == -1){
                return binarySearch(mountainArr,target,0,peak,true);
            }else{
                return binarySearch(mountainArr,target,0,peak,true);
            }


        }

        static int findPeak(int[] mountainArr) {
            int start = 0;
            int end = mountainArr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (mountainArr[mid] > mountainArr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }

            return start;
        }

        static int binarySearch(int[] mountainArr, int target, int start, int end, boolean isAscending) {

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target == mountainArr[mid])
                    return mid;

                if (isAscending) {

                    if (target > mountainArr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    if (target < mountainArr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }

                }

            }

            return -1;
        }


}
