/*
    First and last occurence of character using recursion.......

*/
public class occurence {
    public static int first=-1;
    public static int last=-1;
        
    
    public static void main(String[] args) {
        String st="sdflasjljlajlka";
        occure(st, 0,'a');
    }
    public static void occure(String st,int idx,char element)
    {
        if(idx==st.length())
        {
            System.out.println("first = "+first);
            System.out.println("last = "+last);
            return;

        }
        if(st.charAt(idx)==element)
        {
            if(first==-1)
            {
                first=idx;
                last=idx;
            }
            else
            last=idx;
        }
        occure(st, idx+1, element);
    }
    
}
