/*
        reverse string using recursion

*/
public class revers_string {
    public static void main(String[] args) {
        String st="abcd";
        int l=st.length()-1;
        reverse(st,l);
    }
    public static void reverse(String st,int idx)
    {
        if(idx==0)
        {
            System.out.print(st.charAt(idx));
            return;
        }
        System.out.print(st.charAt(idx));
        reverse(st, idx-1);
    }
    
}
