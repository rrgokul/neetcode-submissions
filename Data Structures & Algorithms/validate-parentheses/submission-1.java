class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        /*
        ([{}{}])
        
        */
        for(char c : chars){
            if(isOpening(c)){
                stack.push(c);
            } else if (isClosing(c)){
                if(stack.isEmpty() || !isMatching(stack.pop(), c)){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }


    }
    public boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isClosing(char c){
        return c == ')' || c == '}' || c == ']';
    }
    public boolean isMatching(char l, char r){
        return (l == '(' && r == ')' )
        || (l == '{' && r == '}')
        || (l == '[' && r == ']');
    }

}
