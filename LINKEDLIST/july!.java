
day 1 july 

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
        
        LinkedList(){
           this.head = null;
           this.tail = null;
        }
        
       public void insertAtHead(int val){
          Node temp = new Node(val);
          if(head == null) head = tail = temp;
          else{
              temp.next = head;
              head = temp;
          }
       }
       
       public void insertAtTail(int val){
           Node temp = new Node(val);
           if(head == null) head = tail = temp;
           else{
               tail.next = temp;
               tail = temp;
           }
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
        test.print();
        test.insertAtTail(9);
        test.insertAtTail(8);
        test.print();
        test.insertAtAny(666,2);
        test.print();
    }
}