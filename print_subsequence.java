public class print_subsequence {
    public static void subsequence(String st,int i,String newStr) {
        if(i==st.length())
        {
            System.out.println(newStr);
            return;

        }
        char curr=st.charAt(i);
        subsequence(st, i+1, newStr+curr);
        subsequence(st, i+1, newStr);
        
    }
    public static void main(String[] args) {
        String st="abc";
        subsequence(st, 0,"");
    }
    
}
