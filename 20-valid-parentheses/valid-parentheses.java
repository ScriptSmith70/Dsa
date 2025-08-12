class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();        
    }
}


/*
class Solution {
    public boolean isValid(String s) {
        int top=-1;
        char[] stack = new char[s.length()];
        if(s.length()%2!=0)return false;
        for(char c:s.toCharArray()){
            if (c == '(') stack[++top]=')';
            else if(c=='[') stack[++top]=']';
            else if(c=='{') stack[++top]='}';
            else if(top == -1||stack[top--]!=c)return false;
        }
        return top==-1;



        /*if(x.length()%2==1)
        return false;
        if(x.charAt(0)==')'||x.charAt(0)=='}'||x.charAt(0)==']')
        return false;
        Stack<Character>s=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='('||x.charAt(i)=='{'||x.charAt(i)=='[')
            s.push(x.charAt(i));
            else if(s.size()>0&&s.peek()=='('&&x.charAt(i)==')')
            s.pop();
            else if(s.size()>0&&s.peek()=='{'&&x.charAt(i)=='}')
            s.pop();
            else if(s.size()>0&&s.peek()=='['&&x.charAt(i)==']')
            s.pop();
            else
            return false;
        }
        if(s.size()==0)
        return true;
        else
        return false;
    }
}
*/