class Solution {
    public int[] twoSum(int[] arr, int target) {

        // brute force

        /**
        
        int[] ans = new int[2];

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){

                if((arr[i] + arr[j]) == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;

        **/

        // better solution

        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            int complement = target - arr[i];

            if(map.containsKey(complement)){

                ans[0] = map.get(complement);
                ans[1] = i;

                return ans;
            }

            map.put(arr[i], i);

        }

        return ans;
        
    }
}
