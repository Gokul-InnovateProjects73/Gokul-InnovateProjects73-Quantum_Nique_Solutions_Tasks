import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int rev=0;
	    int org=n;
	    while(0<n){
	        int digit=n%10;
	        rev=rev*10+digit;
	        n=n/10;
	        
	    }
	    if(org==rev){
	        System.out.println("True");
	    }
	    else{
		System.out.println("False");
	}
	sc.close();
}
}