/*  

    remove duplicate character from string using recursion....
*/

public class remove_duplicat {
    public static boolean map[]=new boolean[26];

    public static void remove(String str,int i,String newStr) {
        if(str.length()==i){
            System.out.print(newStr);
            return;
        }
        char curr=str.charAt(i);
        if(map[curr-'a'])
            remove(str, i+1, newStr);
        else
        {
            newStr+=curr;
            map[curr-'a']=true;
            remove(str, i+1, newStr);
        }
        
    }
    public static void main(String[] args) {
        String st="asdfgfdsa";
        remove(st, 0,"");
    }
    
}
