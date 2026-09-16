class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            int index = ch - 'a';
            freq[index] = freq[index] + 1;
        }

        for(char ch: t.toCharArray()){
            int index = ch - 'a';
            freq[index] = freq[index] - 1;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                return false;
            }
        }

        return true;

    }
}
