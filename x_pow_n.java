
public class x_pow_n {
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

        return x*power(x,n-1);
        
    }
    
}
