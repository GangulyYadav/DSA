public class ReachestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i< accounts.length; i++){
            int colSum =  0;
            for(int j=0; j<accounts[i].length; j++){
                colSum+=accounts[i][j];
            }
            if(max<colSum){
                max = colSum;
            }

        }
        return max;
    }
}
