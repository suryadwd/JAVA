import java.util.Stack;
// class Main{
//   public static void main(String[] args) {
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     System.out.println(s.peek());
//     System.out.println(s.pop());
//     System.out.println(s.peek());
//   }
// }

// class Main{

//   public static String revStack(Stack<String> s){
//     Stack<String> rev = new Stack<>();
//     while(s.size() != 0){
//       rev.push(s.pop());
//     }
//     return rev.toString();  
//   }

//   public static void main(String[] args) {
//     Stack<String> s = new Stack<>();
//     s.push("a");
//     s.push("b");
//     s.push("c");
//     System.out.println(s);
//     revStack(s);
//     System.out.println(s);
//   }
// }


// class Main{

//   public static Stack<Integer> revStack(Stack<Integer> s){
//     Stack<Integer> rev_Stack = new Stack<>();
//     while(s.size() != 0){
//       rev_Stack.push(s.pop());
//     }
//     return rev_Stack;
//   }

//   public static Stack<Integer> copy(Stack<Integer> s){
//     // Stack<Integer> temp = new Stack<>(); //reverse
//     // while (!s.isEmpty()) {
//     //   temp.push(s.pop());
//     // }
//     Stack<Integer> temp = revStack(s);
//     Stack<Integer> copy = new Stack<>(); //reverse reverse
//     while(!temp.isEmpty())copy.push(temp.pop());
//     return copy;
//   }

//   public static void main(String[] args) {
//     Stack<Integer> org_stack = new Stack<>();
//     org_stack.push(1);
//     org_stack.push(2);
//     org_stack.push(3);
//     org_stack.push(4);
//     org_stack.push(5);

//     // System.out.println(revStack(org_stack));
//     System.out.println(copy(org_stack));
//   }
// }

// class Main{

//   public static void main(String[] args) {
    
//     Stack<Integer> stack = new Stack<>();
//     stack.push(1);
//     stack.push(2);
//     stack.push(3);
//     stack.push(4);
//     stack.push(5);
//     System.out.println(stack);
//     Stack<Integer> temp  = new Stack<>();
//     while(stack.size() > 0) temp.push(stack.pop());
//     // System.out.println(temp);
//     int pos = 3, i = 0;
//     int val = 69;

//     while(temp.size() != 0){
//       if(i == pos) {
//         stack.push(val);
//       }
//       else stack.push(temp.pop());
//       i++;
//     }
  
//     System.out.println(stack);
//   }
// }

// class Main{

//   public static void recusion(Stack<Integer> s){
//     if(s.isEmpty()) return;
//     int top = s.pop();
//     recusion(s);
//     System.out.print(top+" ");
//     s.push(top);
//   }

//   public static void main(String[] args) {
    
//     Stack<Integer> stack = new Stack<>();
//     stack.push(1);
//     stack.push(2);
//     stack.push(3);
//     stack.push(4);
//     stack.push(5);
//     System.out.println(stack);
//     recusion(stack);
//   }
// }

// class Main{

// public static class StackMe{
  int s, idx = 0;
  int arr[];
  StackMe(int size){
  this.s = size;
  arr = new int[s];
  }
  void push(int x){
    if(idx >= s){
    System.out.println("Stack overflow");
    return;
    }
    else arr[idx++] = x;
  }

  int pop(){
    if(idx < 0){
    System.out.println("Stack inflow");
    return -1; 
    }
    else {
      int val = arr[idx - 1];     // 1 2 3 4 5 idx = 6;
      idx--; 
      return val;
    }
  }

  int peek(){
    if(isEmpty()){ 
    System.out.println("stack is empty");
    return -1;
  }
    return arr[idx - 1];
  }

  int size(){return idx;}              // 1 2 3 4 5

  boolean isEmpty(){return idx == 0;}

  boolean isFull(){return idx == s;}

  void print(){
  for(int i = 0; i < idx; i++) {
    System.out.print(arr[i] + " ");
  }
  System.out.println();
}


}



  public static void main(String[] args) {
    StackMe stack = new StackMe(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
   
  }

}



class Main{

  class Node{
  int val;
  Node next;
  Node(int val){
    this.val = val;
  }
}

  class Stack{
    
  }

}