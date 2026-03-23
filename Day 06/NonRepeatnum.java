import java.util.*;
public class NonRepeatnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int num1=-1;
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                num1=arr[i];
                break;
            }
        }
        System.out.println(num1);
    }
}