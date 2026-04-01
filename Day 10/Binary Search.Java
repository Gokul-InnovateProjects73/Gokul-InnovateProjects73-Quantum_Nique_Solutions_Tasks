import java.util.*;
public class Binary{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int target=sc.nextInt();
        int left=0,right=n-1;
        int result=-1;
        while(left<=right){
            int mid=left+right/2;
            if(arr[mid]==target){
                result=mid;
                break;
            }
            else if(arr[mid]<target){
                left=mid+1;
                
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(result);
        
    }
}