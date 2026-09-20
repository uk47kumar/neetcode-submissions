class Solution {
    public int maxProfit(int[] arr) {

        // brute force

        /**

        int profit = 0;

        for(int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){

                if(arr[j] - arr[i] > profit){
                    profit = arr[j] - arr[i];
                }

            }
        }

        return profit;

        **/

        // optimize approach

        int maxProfit = 0;
        int minSoFar = arr[0];

        for(int i = 0; i < arr.length; i++){

            minSoFar = Math.min(arr[i], minSoFar);

            int profit = arr[i] - minSoFar;

            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
        

    }
}
