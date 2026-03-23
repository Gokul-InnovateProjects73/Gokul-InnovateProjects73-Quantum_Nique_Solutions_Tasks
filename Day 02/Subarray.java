import java.util.Scanner;
public class Subarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int Sum = 0;
        int num = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int temp = Sum+arr[i];
            if(temp < arr[i]){
                Sum = arr[i];   
            } else {
                Sum = temp;      
            }
            if(num<Sum){
                num = Sum;
            }
        }
        System.out.println(num);
        sc.close();
    }
}