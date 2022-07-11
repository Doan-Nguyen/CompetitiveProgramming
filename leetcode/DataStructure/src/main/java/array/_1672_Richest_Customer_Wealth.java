package array;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int numbRows = accounts.length;
        int numbCols = accounts[0].length;
        //
        int maxWealth = 0;
        for (int r=0; r < numbRows; r++){
            int customer = 0;
            for (int c=0; c < numbCols; c++){
                customer += accounts[r][c];
            }
            if (customer > maxWealth){
                maxWealth = customer;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args){
        int[][] a = {{1, 2, 3}, {3, 2, 1}};
        int result = maximumWealth(a);
        System.out.println(result);
    }
}
