/*
    Print natural number upto n using recursion....

*/
public class natural {
    public static void main(String[] args) {
        int n=5;
        printSum(1,n,0);
    }
    public static void printSum(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
}
