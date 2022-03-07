import java.util.ArrayList;
import java.util.List;

public class print_subset {
    public static void find(int n,ArrayList<Integer>subset) {
        if(n==6)
        {
            print_subset(subset);
            return;
        }
        subset.add(n);
        find(n+1, subset);

        subset.remove(subset.size()-1);
        find(n+1, subset);
        
    }
    public static void print_subset(ArrayList<Integer>subset) {
        for(int i:subset)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int n=1;
        ArrayList<Integer>arr=new ArrayList<>();
        arr.clear();
        find(n,arr);
    }
    
}
