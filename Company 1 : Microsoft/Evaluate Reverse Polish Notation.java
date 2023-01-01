class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String a = tokens[i];
                if(a.equals("+")){
                    st.push(st.pop() + st.pop());
                } 
                else if(a.equals("-")){
                    st.push(-1*st.pop() + st.pop());
                }
                else if(a.equals("*")){
                    st.push(st.pop() * st.pop());
                }
                else if(a.equals("/")){
                    int x = st.pop();
                    int y = st.pop();
                    st.push(y/x);
                }
                else{
                    st.push(Integer.valueOf(a));
                }
	        }
	    return st.pop();
	}    
}
