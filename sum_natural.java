public class sum_natural {
    public static void main(String[] args) {
        Nsum(1,6,0);
    }
    public static void Nsum(int i,int n,int sum) {
        if(i==n)
        {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=i;
        Nsum(i+1, n, sum);

        
    }
    
}
