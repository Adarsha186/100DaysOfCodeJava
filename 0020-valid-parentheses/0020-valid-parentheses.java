class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{'||c=='['||c=='('){
                st.push(c);
            }
            else if(c=='}'||c==']'||c==')'){
                if(st.isEmpty()){return false;}
                char x=st.pop();
                switch(c){
                    case '}':
                        if(x=='['||x=='('){
                            return false;
                        }
                        break;
                    case ']':
                        if(x=='{'||x=='('){
                            return false;
                        }
                        break;
                    case ')':
                        if(x=='{'||x=='['){
                            return false;
                        }
                        break;
                
                }
                //st.pop();
            }
        }
        return (st.isEmpty());
    }   
}