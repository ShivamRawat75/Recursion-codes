/*
Tower of hanoi problem....

*/
public class hanoi {
    public static void main(String[] args) {
        int n=10;
        tower(n,"S","H","D");
    }
    public static void tower(int n,String src,String help,String dest)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        tower(n-1, src, dest, help);

        System.out.println("transfer disk "+ n +" from "+src+" to "+dest);

        tower(n-1,help,src, dest);
    }
    
}
