/*
Print number using recursion....

*/


public class number {
    public static void main(String[] args) {
        int n=5;
        print_num(n);
    }
    public static void print_num(int n)
    {
        if(n==0)
        return;
        System.out.println(n);
        print_num(n-1);
    }
    
}
