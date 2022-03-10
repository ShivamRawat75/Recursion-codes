import java.util.HashSet;

public class permutation_string {
    

    public static void print_permu(String str,String permu,HashSet<String>A) {

        if(str.length()==0)
        {
            A.add(permu);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            print_permu(newStr, permu+curr,A);

        }
    }
    public static void main(String[] args) {
        HashSet<String>A=new HashSet<String>();
        String st="aatt";
        print_permu(st,"",A);
        //for(int i:A)
        
            System.out.println(A);
        
    }
    
}
