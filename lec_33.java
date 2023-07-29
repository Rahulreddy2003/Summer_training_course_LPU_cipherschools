
//insertion continued lecture 33 
class Solution{
  public static boolean detectLoop(Node head){
    Node slow = head;
    Node fast = head;
    while(fast !=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow==fast)return true;

    }
    return false;
  }
}
class Node{
    int data;
    Node next;
    Node (int data)
    {
        this.data = data;
        this.next = null;
    }
    static void print(Node head)
    {
        while(head!= null)//here it is correct to use head as 
        //this head is a separate reference variable pointing to the same object
        {
            System.out.println(head.data+" ");
            head = head .next();
        }
        System.out.println();
    }

}
static insertAtHead( Node head ,int data)
{
Node temp = new Node(data);
temp.next = head;
head = temp;
return head;

}
static insertAtEnd( Node head ,int data)
{
    //craete new node
Node temp = new Node(data);
Node last = head;
while(last.next != null)
{
    last = last .next;
}
//last element found
//point the next of last to the next

last.next = temp;
head = temp;
return head;
}
public class MyLl{
    public static void main(String args[])
    {
        Node head = new Node(5);
        Node second = new Node(6);
        head.next = second;
        Node third = new Node(7);
        second.next = third;
        Node fourth = new Node(8);
        third .next =fourth;
        Node fifth = new Node(9);
        fourth .next = fifth;
        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.nextdata);
        // System.out.println(head.next.next.next.data);
        // System.out.println(head.next.next.next.next.data);

      Node temp = head;
      while(head!= null)
      {
        System.out.println(head.data);
        temp = temp.next;
      }
        //System.out.println(head.next.next.next.next.next.data);//null.data ->wrong
        temp = head;
        while(head!= null)
      {
        System.out.println(head.data);
        temp = temp.next;
        print(head);
        print(head);

        head = insertAtHead(head,4);
        print(head);
        head = insertAtEnd(head,10);
        print(head);

        Node head2= insertAtEnd(null,1);
        print(head2);
      }
    }
