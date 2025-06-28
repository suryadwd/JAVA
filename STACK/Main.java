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

class Main{

  public static void main(String[] args) {
    
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack);
    Stack<Integer> temp  = new Stack<>();
    while(stack.size() > 0) temp.push(stack.pop());
    // System.out.println(temp);
    int pos = 3, i = 0;
    int val = 69;

    while(temp.size() != 0){
      if(i == pos) {
        stack.push(val);
      }
      else stack.push(temp.pop());
      i++;
    }
  
    System.out.println(stack);
  }
}