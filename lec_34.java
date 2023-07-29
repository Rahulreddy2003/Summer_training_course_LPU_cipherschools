//2.reverse a linked list 

class Solution{
  Node reverseList(Node head)
  {
   Node prev = null;
   Node next = null;
   Node curr = head;
   while(curr!= null)
   {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
   }
   return prev;
  //  head = prev;
  //  return head;

  }
}
