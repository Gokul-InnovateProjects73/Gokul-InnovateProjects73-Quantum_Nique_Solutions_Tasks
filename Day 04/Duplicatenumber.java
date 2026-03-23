import java.util.Scanner;
import java.util.HashSet;

public class Duplicatenumber{
	public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>s=new HashSet<>();
        HashSet<Integer>dupe=new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.contains(arr[i])){
                dupe.add(arr[i]);
            }
            else{
                s.add(arr[i]);
            }
        }
		System.out.println("duplicate:"+dupe);
	}
}
