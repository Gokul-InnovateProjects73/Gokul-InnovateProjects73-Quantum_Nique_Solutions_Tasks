import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data=d;
        next=null;
    }
}
public class MiddleLL{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++) {
            int var=sc.nextInt();
            Node node=new Node(var);
            if(head==null) {
                head=tail=node;
            } else {
                tail.next=node; 
                tail=node;
            }
        }
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}

