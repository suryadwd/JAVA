package LINKEDLIST;

// day 1 july 


class Main{
    
    static class Node{
        int val;
        Node next;
        Node(int data){
            this.val = data;
            next = null;
        }
    }
    
    static class LinkedList{
        
        Node head;
        Node tail;
        int size;
        LinkedList(){
           this.head = null;
           this.tail = null;
           size = 0;
        }
        
       public void insertAtHead(int val){
          Node temp = new Node(val);
          if(head == null) head = tail = temp;
          else{
              temp.next = head;
              head = temp;
          }
          size++;
       }
       
       public void insertAtTail(int val){
           Node temp = new Node(val);
           if(head == null) head = tail = temp;
           else{
               tail.next = temp;
               tail = temp;
           }
           size++;
       }
       
       public void insertAtAny(int val, int pos){
           if(pos == 0) {
               insertAtHead(val);
               return;
           }
           
        Node add = new Node(val)   ;
        int cnt = 0;
        Node temp = head;
        while(cnt < pos - 1){
            temp = temp.next;
            cnt++;
        }
        
        add.next = temp.next;
        temp.next = add;
        
        // to maintain  the end position
         if (add.next == null) tail = add;
         size++;
       }
       
       public void deleteAtHead(){
           head = head.next;
           size--;
       }
       
       public void delete(int pos){
           if(pos == 0){
               deleteAtHead();
               return;
           }
           int cnt = 0;
           Node temp = head;
           while(cnt < pos - 1){
               temp = temp.next;
               cnt++;
           }
           if(temp.next == tail) tail = temp;
           temp.next = temp.next.next; 
           size--;
       }
       
       public void update(int pos, int newVal){
           if (pos < 0 || pos >= size) return; 
           int cnt = 0;
           Node temp = head;
           while(cnt < pos){
               cnt++;
               temp = temp.next;
           }
           temp.val = newVal;
       }
       
       public void print(){
           Node temp = head;
           while(temp != null){
               System.out.print(temp.val+" ");
               temp = temp.next;
           }
           System.out.println();
       }
    }    
    
    public static void main(String[] args){
        LinkedList test = new LinkedList();
        test.insertAtHead(1);
        test.insertAtHead(2);
        test.insertAtHead(3);
        test.insertAtTail(9);
        test.insertAtTail(8);
        test.print();
        test.update(2,100);
        test.print();
    }
}


// new 


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;

        while(curr != null){
            forw = curr.next; // assign forward to the next
            curr.next = prev; // assign null to current
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}