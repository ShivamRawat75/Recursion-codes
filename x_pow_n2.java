
//
//Height of this stack is log n istead of n......!!!!!
//
//



public class x_pow_n2 {
    public static void main(String[] args) {
        int x=2;
        int n=6;
        System.out.println(power(x,n));
    }
    public static int power(int x,int n) {
        if(n==0)
        return 1;
        if(x==0)
        return 0;

        if(n%2==0)
        return power(x,n/2)*power(x,n/2);
        else
        return power(x,n/2)*power(x,n/2)*x;
        
    }
    
}
