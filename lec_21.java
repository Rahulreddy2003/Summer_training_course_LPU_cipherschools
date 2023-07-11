// Sorting----------------------------
// Selection sort: 
// -->swap the minimum element with the first greatest element from it one by one
import java.util.*;
public class lec_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){ 
                //finding the minimum element
                if(arr[j]<arr[mini]){
                    mini=j;
                }
                //swap it with the first
                int temp=arr[mini];
                arr[mini]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();

    }
}
