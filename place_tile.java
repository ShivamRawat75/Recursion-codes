public class place_tile {
    public static int place_tiles(int n,int m) {
        if(m==n)
        return 2;
        if(n<m)
        return 1;
        int vertical_placement=place_tiles(n-m, m);
        int hori_placement=place_tiles(n-1, m);

        return vertical_placement+hori_placement;
        
    }
    public static void main(String[] args) {
        int n=2,m=3;
        System.out.println(place_tiles(n, m));
    }
    
}
