class Solution {
    public boolean isAnagram(String s, String t) {

        // brute force for only lower case

    /**
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
    **/

        // optimize approach for any type of letter or symbol

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for (char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) - 1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch) != 0){
                return false;
            }
        }

        return true;

    }
}
