public class permutation_string {
    public static void print_permu(String str,String permu) {

        if(str.length()==0)
        {
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            print_permu(newStr, permu+curr);

        }
    }
    public static void main(String[] args) {
        String st="abc";
        print_permu(st,"");
    }
    
}
