import javax.lang.model.util.ElementScanner14;

public class Sorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,6,7,8,9};
        System.out.println(is_sorted(arr,0));
    }
    public static boolean is_sorted(int arr[],int idx) {
        if(idx==arr.length-1)
        return true;

        if(arr[idx]<arr[idx+1])
        return is_sorted(arr, idx+1);
        else 
        return false;
        
    }
    
}
