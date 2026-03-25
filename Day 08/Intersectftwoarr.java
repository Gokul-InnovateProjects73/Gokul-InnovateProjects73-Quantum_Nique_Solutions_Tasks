import java.util.*;
public class Intersectftwoarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int arr2[]=new int[num];
        for(int i=0;i<num;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<num;j++){
                if(arr1[i]==arr2[j]){
                    if(!res.contains(arr1[i])){
                        res.add(arr1[i]);
                    }
                }
            }
        }

        System.out.println(res);
    }
}