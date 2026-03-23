 import java.util.*;
public class Square{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int left=0;
        int right=number;
        int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid*mid==number){
                result=mid;
                break;
            }
            else if(mid*mid<number){
                result=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(result);
    }
}