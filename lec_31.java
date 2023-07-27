package linkedlists;

 class Main{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null ;
    }
}

public class MyLL{
    
    static void print(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head = new Node(5);
        Node second = new Node(6);
        head.next = second;
        Node third = new Node(7);
        second.next = third;
        Node fourth = new Node(8);
        third.next = fourth;
        Node fifth = new Node(9);
        fourth.next = fifth;
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp);
        
        print(head);
        print(head);
    }
}
