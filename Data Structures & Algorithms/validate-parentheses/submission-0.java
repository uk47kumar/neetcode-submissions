class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(isOpening(ch)){
                stack.push(ch);
            } else {

                if(stack.isEmpty()){
                    return false;
                } else if(!isMatching(stack.peek(), ch)){
                    return false;
                } else {
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();
    }

    public static boolean isOpening(char a){
        return 
        a == '(' ||
        a == '{' ||
        a == '[';
    }

    public static boolean isMatching(char a, char b){
        return 
        (a == '(' && b == ')') ||
        (a == '{' && b == '}') ||
        (a == '[' && b == ']');
    }
}
