// Using Sliding Window
import java.util.HashSet;
import java.util.Scanner;
public class Longestsubstring
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    HashSet<Character>set=new HashSet<>();
	    int left=0;
	    int maxlen=0;
	    for(int right=0;right<str.length();right++){
	        while(set.contains(str.charAt(right))){
	            set.remove(str.charAt(left));
	            left++;
	        
	    }
	    set.add(str.charAt(right));
	    maxlen=Math.max(maxlen,right-left+1);
	}
		System.out.println(maxlen);
	}
}
 
    
