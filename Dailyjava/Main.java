// // package Dailyjava;


// // class Node{
// //   int data;
// //   Node next;

// //   Node(int v){
// //     this.data = v;
// //     this.next = null;
// //   }

// // }

// // class SLL{
// //   Node head;
// //   Node tail;
// //   int size;

// //   SLL(){
// //     this.head = null;
// //     this.tail = null;
// //     size = 0;
// //   }

// //   void insertAtEnd(int value){
// //     Node temp = new Node(value);
// //     if(head == null) head = tail = temp;
// //     else{
// //       tail.next=temp;
// //     tail = temp;
// //     size++;
// //     }
// //   }

// //   void printN(){
// //     Node temp = head;
// //     while(temp != null){
// //       System.out.print(temp.data+" ");
// //       temp = temp.next;
// //     }
// //     System.out.println();
// //   }

// //   void printRec(Node head){
// //     Node temp = head;
// //     if(temp == null) return;
// //     System.out.print(temp.data+" ");
// //     printRec(temp.next);
// //   }

// //   void insertAtHead(int value){
// //     Node temp = new Node(value);
// //     if(head == null) head = tail = temp;
// //     else{
// //       temp.next = head;
// //       head = temp;
// //     }
// //     size++;
// //   }

// //   void insertAtAny(int idx, int value){
// //     Node add = new Node(value);
// //     Node temp = head;
// //     int pos = 1;
// //     while(pos < idx){
// //       temp = temp.next;
// //       pos++;
// //     }
// //     add.next = temp.next;
// //     temp.next = add;
// //   }

// //   void get(int idx){
// //     Node temp = head;
// //     int pos = 1;
// //     while(pos != idx){
// //       temp = temp.next;
// //       pos++;
// //     }
// //     System.out.println(temp.data);
// //   }

// //   void set(int idx, int value){
// //     Node temp = head;
// //     int pos = 1;
// //     while (pos != idx) {
// //       temp = temp.next;
// //       pos++;
// //     }
// //     temp.data = value;
// //     System.out.println(temp.data);
// //   }

// //   void deleteAtHead(){
// //     head = head.next;
// //   }

// //   void delete(int idx){
// //       Node temp = head;
// //       if (idx == 1) deleteAtHead();
// //       int pos = 1;
// //       while(pos < idx){
// //         temp = temp.next;
// //         pos++;
// //       }
// //       if(temp.next == tail) tail = temp;
// //       temp.next = temp.next.next;
// //   }

// //   void middleEle(Node head){
// //     Node slow = head;
// //     Node fast = head;
// //     while(fast != null && fast.next != null){
// //       slow = slow.next;
// //       fast = fast.next.next;
// //     }
// //     System.out.println("Middle node"+slow.data);
// //   }

// // }



// // public class Main {
// //     public static void main(String[] args) {
// //       SLL ll = new SLL();
// //       ll.insertAtEnd(1);
// //       ll.insertAtEnd(2);
// //       ll.insertAtEnd(3);
// //       ll.insertAtEnd(4);
// //       ll.insertAtEnd(5);

// //       // ll.printN();
// //       // ll.insertAtHead(9);
// //       // ll.insertAtHead(8);
// //       // ll.insertAtHead(7);
// //       // ll.insertAtAny(3,69);
// //       // ll.printN();
// //       // ll.get(4);
// //       // ll.set(4,0);
// //       // ll.printN();
// //       // ll.deleteAtHead();
// //       // ll.insertAtAny(3,69);
// //       // ll.printN();
// //       // ll.delete(4);

// //       // ll.printN();
      

// //     }
// // }


// // // leetcode 83 -> completed

// // // class Solution {
// // //     public ListNode deleteDuplicates(ListNode head) {
// // //         ListNode slow = head;
// // //         ListNode fast = head;

// // //         while(fast != null && fast.next != null){
// // //             fast = fast.next;
// // //             if(slow.val == fast.val){
// // //                if(fast.next != null){
// // //                  while(fast.next != null && fast.val == slow.val){
// // //                     fast = fast.next;
// // //                     slow.next = slow.next.next;
// // //                  }
// // //                }else{
// // //                 slow.next = null;
// // //                }
// // //             }
// // //             slow = slow.next;
// // //         }
// // //             return head;
// // //     }
// // // }

// // 	public static void selectionSort(int arr[], int n) {
// // 		for(int i = 0; i < n; i++){
// // 			int minIdx = i;
// // 			// abhi ke value ko mana ke sanse lowest hai aur uske agle me search kiya
// // 			// koi aurr choti value ko agar mili to minIndx me daal diya
// // 			// apni i to already starting me hai minIdx me ab uske baad wala chota index le liya 
// // 			// aurr swap kiya i ko age badha diya a  fir vahisame cheze hoti rahege
// // 			for(int j = i + 1; j < n; j++){
// // 				if(arr[minIdx] > arr[j]){
// // 					minIdx = j;
// // 				}
// // 			}
// // 				int temp = arr[minIdx];
// // 				arr[minIdx] = arr[i];
// // 				arr[i] = temp;
// // 		}
// // 	}



// // LEARNING DIFFERENT TYPES OF SHORTING

// class Main{
    
//     public static void bubleSort(int []arr){
//         for(int i = 0; i < arr.length ; i++){
//             for(int j = 0; j < arr.length - i - 1; j++){
//                 if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 }
//             }
//         }
//     }
    
//     public static void selectionSort(int []arr){
//         for(int i = 0; i < arr.length; i++){
//             int minIdx = i;
//             for(int j = i; j < arr.length; j++){
//                 if(arr[minIdx] > arr[j]){
//                     minIdx = j;
//                 }
//             }
//             int temp = arr[minIdx];
//             arr[minIdx] = arr[i];
//             arr[i] = temp;
//         }
//     }
    
//     public static void insertionSort(int []arr){
//         for(int i = 1; i < arr.length; i++){
//             int j = i;
//             while(j - 1 >= 0 && arr[j-1] > arr[j]){
//                 int temp = arr[j - 1];
//                 arr[j - 1] = arr[j];
//                 arr[j] = temp;
//                 j--;
//             }
//         }
//     }
    
//     public static void merge(int []arr, int start, int mid, int end){
//         int left = start;
//         int right = mid + 1;
//         int idx = 0;
//         int temp[] = new int[end - start + 1];
        
//         while(left <= mid && right <= end){
//             if(arr[left]<=arr[right]) temp[idx++] = arr[left++];
//             else temp[idx++] = arr[right++];
//         }
        
//         while(left <= mid){
//              temp[idx++] = arr[left++];
//         }
        
//         while(right <= end){
//              temp[idx++] = arr[right++];
//         }
        
//         idx = 0;
        
//           for (int i = 0; i < temp.length; i++) {
//             arr[start + i] = temp[i];
//     }
//     }
    
//     public static void mergeSort(int [] arr, int start, int end){
//         if (start == end) return;
//         int mid = start + (end-start)/2;
//         mergeSort(arr,start,mid);
//         mergeSort(arr,mid+1,end);
//         merge(arr, start, mid, end);
//     }
    
//     public static void main(String args[]){
//         int arr[] = {1,56,2,67,78,6};
//         // bubleSort(arr);
//         // selectionSort(arr);
//         // insertionSort(arr);
//         // mergeSort(arr,0,5);
//         for(int x : arr)System.out.print(x+" ");
//     }
    
// }

public class Main
{
    
   public static void fibo(int n){
    //   n = 3  0 1 1 2 3
    int f = 0;
    int s = 1;
    
    if( n == 0) return;
    if( n == 1) return;
        System.out.print(f + " "+ s+ " ");
    for(int i = 2; i < n; i++){
        int ans =  f + s;
        System.out.print(ans + " ");
        f = s;
        s = ans;
    }
    
   }
    
	public static void main(String[] args) {
		fibo(7);
	}
}

import java.util.HashMap;
public class Solution {
    public static String read(int n, int []book, int target){

        // for(int i = 0; i < book.length; i++){
        //     for(int j = i+1; j < book.length; j++){
        //         if(target == (book[i] + book[j])) return "YES";
        //     }
        // }
        // return "NO";

        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < book.length; i++){
            int remaining = target - book[i];
            if(map.containsKey(remaining)) return "YES";
            map.put(book[i], i);
        }
        return "NO";
        

    }
}

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int occursOnce(int[] a, int n) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int x : a) map.put(x, map.getOrDefault(x, 0) + 1);
        // for (Map.Entry<Integer, Integer> entry : map.entrySet())if (entry.getValue() == 1) return entry.getKey();
        // return -1;

        // i have to use the xor here 

    }
}
