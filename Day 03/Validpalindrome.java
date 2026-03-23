import java.util.Scanner;
public class Validpalindrome{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase().replace(" ","");
        String rev="";
        for(int i=str.length()-1;i>=0;i--) {
            rev=rev+str.charAt(i);
        }
        System.out.print(str.equals(rev));
    }
}