import java.util.*;
public class FirstRepeat{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        HashSet<Integer> see=new HashSet<>();
        int ans=-1;
        for(int value:arr){
            if(see.contains(value)){
                ans=value;
                break;
            }
            see.add(value);
        }
        System.out.println(ans);
    }
}