import java.util.*;
public class Twosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int Right=n-1;
        while(left<Right){
            int res=arr[left]+arr[Right];
            if(res==target){
                System.out.println((left)+" "+(Right));
                return;
            }else if(res<target){
                left++;
            }else{
                Right--;
            }
        }
    }
}