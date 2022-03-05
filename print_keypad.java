public class print_keypad {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void print_combination(String str,int idx,String combination) {
        if(idx==str.length())
        {
            System.out.println(combination);
            return;
        }
        char curr=str.charAt(idx);
        String map=keypad[curr-'0'];
        for(int i=0;i<map.length();i++)
        {
            print_combination(str, idx+1, combination+map.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        String st="23";
        print_combination(st,0,"");
    }
    
}
