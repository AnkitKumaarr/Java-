public class RichestCutsomerWealthLC1472 {
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int add = additionColumn(accounts, i, 0, 0);
            if (max < add) {
                max = add;
            }
        }
        return max;
    }

    static int additionColumn(int[][] accounts, int i, int k, int add) {
        if (accounts[i].length == k) {
            return add;
        }
        add += accounts[i][k];
        return additionColumn(accounts, i, k + 1, add);
    }
    static int maximumWealthLoop(int[][] accounts) {
        int max = 0;        
        for (int i = 0; i < accounts.length; i++) {
            int add =0;
            for (int j = 0; j < accounts[i].length; j++) {
                add += accounts[i][j];
            }
            if (max < add) {
                max = add;
            } 
        }
        return max;
    }

    public static void main(String[] args) {
        int accounts[][] = {
                { 1, 5 },
                { 7, 3 },
                { 3, 8 }
        };
        int ans = maximumWealthLoop(accounts);
        System.out.println(ans);
    }
}
