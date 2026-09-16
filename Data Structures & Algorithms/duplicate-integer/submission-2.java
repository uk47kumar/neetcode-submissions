class Solution {
    public boolean hasDuplicate(int[] arr) {

        // brute force

        /**

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){

                if(arr[i] == arr[j]){
                    return true;
                }

            }

        }

        return false;

        **/

        // optimize approach

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr){

            if(set.contains(num)){
                return true;
            }

            set.add(num);
        }
        
        return false;
    }
}