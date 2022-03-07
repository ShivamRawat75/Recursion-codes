public class maze_path {
    public static int count_path(int i,int j,int n,int m) {
        if(i==n||j==m)
        return 1;
        if(i==n&&j==m)
        return 0;
        int down_path=count_path(i+1, j, n, m);
        int right_path=count_path(i, j+1, n, m);

        return down_path+right_path;
        
    }
    public static void main(String[] args) {
        int i=0,j=0,n=2,m=2;
        System.out.println(count_path(i, j, n, m));

    }
    
}
