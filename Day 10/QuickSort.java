import java.util.Scanner;
public class QuickSort{
    public static void quickSort(int arr[], int left, int right){
        if(left>=right)return;
        int pivot=arr[left];
        int i=left;
        int j=right;
        while(i<j){
            while(arr[i]<=pivot&&i<right){
                i++;
            }
            while(arr[j]>pivot&&j>left){
                 j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[left];
        arr[left]=arr[j];
        arr[j]=temp;
        quickSort(arr,left,j-1);
        quickSort(arr,j+1,right);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) 
        arr[i]=sc.nextInt();
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
    }
}
}