package LINKEDLIST;



public class day12 {

  static void display(node head){
    if(head == null) return;
    System.out.println(head.data+" ");
    display(head.next);
}

  public static void main(String[] args) {
    
    node a = new node(10);
    node b = new node(20);
    node c = new node(30);
    node d = new node(40);

    a.next = b;
    b.next = c;
    c.next = d;
    
    display(a);

  }
  static class node{
    int data;
    node next;
  
    node(int v){
      this.data = v;
      this.next = null;
    }
  
  } 
}
