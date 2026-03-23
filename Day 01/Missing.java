import java.util.Scanner;
public class Missing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int sum=n*(n+1)/2;
        
    int num=0;
    for(int i=0;i<arr.length;i++){
        num=num+arr[i];//0+1 1+2 3+3 6+4 10+6 16+7 23+8 31
    }
    int result=sum-num;
    System.out.println(result);
    
}
}