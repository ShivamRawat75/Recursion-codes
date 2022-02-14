public class bit {
    public static void main(String[] args) {
        int n=5;
        //int pos=2;
        // int pos=1;
        // int mask=1<<pos;
        // n=n|mask;
        // System.out.println(n);
        int pos=2;
        int mask=1<<pos;
        int notmask=~(mask);
        int new_num=notmask&n;
        System.out.println(new_num);





        // if((mask&n)==0)
        // System.out.println(0);
        // else
        // System.out.println(1);
    }
    
}
