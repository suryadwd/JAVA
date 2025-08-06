881. Boats to Save People

import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int cnt = 0;
        while( i <= j){
            cnt++;
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }else{
                j--;
            }
        }
        return cnt;
    }
}


1833. Maximum Ice Cream Bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0, j = costs.length - 1;
        int cnt = 0;
        while(i <= j){
            if(costs[i] <= coins){
                cnt ++;
                coins = coins -  costs[i];
            }
            i++;
        }
        return cnt;
    }
}

991. Broken Calculator

class Solution {
    public int brokenCalc(int startValue, int target) {
//isko reverse kr do to - -> + * -> / ho jayega  hm log target ko startvalur ke pas le jayege aur      try krege krne ka
        int cnt  = 0;
        while(target > startValue){
            cnt++;
            if(target % 2 == 0)target = target / 2;
            else target = target + 1;
        }
        return cnt + (startValue - target);
    }
}

2038. Remove Colored Pieces if Both Neighbors are the Same Color

class Solution {
    public boolean winnerOfGame(String colors) {
        char arr[] = colors.toCharArray();
        int n = 1, acount = 0, bcount = 0;

        boolean flag = false;
        while(n < arr.length-1){
            if(arr[n] == 'A' && arr[n - 1] == 'A' && arr[n + 1] ==  'A') {
                acount++;
            }
             if(arr[n] == 'B' && arr[n - 1] == 'B' && arr[n + 1] ==  'B') {
                bcount++;
            }
            n++;
        }
        return acount > bcount;
    }
}

104. Maximum Depth of Binary Tree

class Solution {
    public int maxDepth(TreeNode root) {
        // List<Integer> list = new ArrayList<>();
        if(root == null) return 0;
        int depth  = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode data = queue.poll();

                // list.add(data.val);
                if(data.left != null) queue.offer(data.left);
                if(data.right !=  null) queue.offer(data.right);
            }
             depth++;
        }
        return depth;
    }
}

103. Binary Tree Zigzag Level Order Traversal

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true; 

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>(); 

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (leftToRight) list.addLast(node.val); 
                else list.addFirst(node.val);            

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(list);
            leftToRight = !leftToRight; 
        }

        return result;
    }
}

102. Binary Tree Level Order Traversal



class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
             result.add(list);
        }
        return result;
    }
}


145. Binary Tree Postorder Traversal


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root == null) return;
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}

144. Binary Tree Preorder Traversal

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}

gfg Size of Binary Tree

class Solution {
    public static int getSize(Node node) {
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int totalNodes = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node data = queue.poll();
                totalNodes++;
                list.add(data.data);
                if(data.left != null) queue.offer(data.left);
                if(data.right != null) queue.offer(data.right);
            }
        }
        return totalNodes;
    }
}


Tree Traversals coding ninjas

import java.util.*;

public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        List<Integer> preOrderList = new ArrayList<>();
        List<Integer> postOrderList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        inorder(root, inorderList);
        preOrder(root, preOrderList);
        postOrder(root, postOrderList);
        list.add(inorderList);
        list.add(preOrderList);
        list.add(postOrderList);
        return list;
    }
    public static void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    public static void preOrder(TreeNode root, List<Integer> list ){
        if(root == null) return;
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
    public static void postOrder(TreeNode root, List<Integer> list ){
        if(root == null) return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.data);
    }
}

Count Leaves in Binary Tree

class Solution {
    int countLeaves(Node node) {
        Queue<Node> queue = new LinkedList<>();
        int leaves = 0;
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i  < size; i++){
                Node n = queue.poll();
                if(n.left == null && n.right == null)leaves++;
                if(n.left != null) queue.offer(n.left);
                if(n.right != null) queue.offer(n.right);
            }
        }
        return leaves;
    }
}

gfg Count Non-Leaf Nodes in Tree

class Solution {
    int countNonLeafNodes(Node root) {
       Queue<Node> queue = new LinkedList<>();
       queue.offer(root);
       int count = 0;
       while(!queue.isEmpty()){
           int size = queue.size();
           for(int i = 0; i < size; i++){
               Node n = queue.poll();
               if(n.left != null || n.right!= null) count++;
               if(n.left != null) queue.offer(n.left);
               if(n.right != null) queue.offer(n.right);
           }
       }
        return count;
    }
}

gfg Sum of Binary Tree

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node data = queue.poll();
                sum = sum + data.data;
                if(data.left != null) queue.offer(data.left);
                if(data.right != null) queue.offer(data.right);
            }
        }
        return sum;
    }
}

max element  in tree

public static int maxValue(Node root){
        int max = Integer.MIN_VALUE;
        int maxi = 0;
        Queue<Node> q = new LinkedList<>();
        if(root == null) return -1;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node x = q.poll();
                maxi = Math.max(x.val, max);
                max = x.val;
                if(x.left != null) q.offer(x.left);
                if(x.right != null) q.offer(x.right);
            }
        }
            return maxi;
    }
}


gfg Nodes at Odd Levels


class Solution {
    public ArrayList<Integer> nodesAtOddLevels(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        if(root == null) return list;
        boolean oddlvl = true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node n = q.poll();
                if(oddlvl){
                list.add(n.data);
               }
               if(n.left != null) q.offer(n.left);
               if(n.right != null) q.offer(n.right);
            }
            oddlvl = !oddlvl;
        }
        return list;
    }
}

gfg Largest value in each level

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
        int maxi = Integer.MIN_VALUE;
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node n = q.poll();
                maxi = Math.max(n.data, maxi);
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }
                list.add(maxi);
        }
        return list;
    }
}

700. Search in a Binary Search Tree


class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;
        else if(val < root.val) return searchBST(root.left, val);
        else return  searchBST(root.right, val);
    }
}

gfg minmimum lelement in bst

class Solution {
    int minValue(Node root) {
    while (root.left != null) {
        root = root.left;
    }
    return root.data;
    }
}

ggf median 

class Tree {
    public static float findMedian(Node root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int size = arr.size();
        if(size % 2 != 0) {
            return arr.get(size / 2);
        }else{
            return (float)(arr.get(size / 2 - 1) + arr.get(size / 2)) / 2;
        }
    }
    public static void inorder(Node root, List<Integer>arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}

gfg Ceil in BST

class Tree {
    int findCeil(Node root, int key) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) >= key)
            return arr.get(i);
        }
        return -1;
    }
    
    public static void inorder(Node root, List<Integer>arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}

gfg floor in bst

// User function Template for Java

class Solution {
    public static int floor(Node root, int x) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int size = arr.size();
        for(int i = size - 1; i >= 0; i--){
        if(arr.get(i) <= x) return arr.get(i);
        }
        return -1;
    }
    public static void inorder(Node root, List<Integer> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}

gfg Find Common Nodes in two BSTs

class Solution {
    // Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> common = new ArrayList<>();
        
        inorder(r1, list1);
        inorder(r2, list2);
        int i = 0, j = 0;
          while (i < list1.size() && j < list2.size()) {
            int val1 = list1.get(i);
            int val2 = list2.get(j);
            if (val1 == val2) {
                common.add(val1);
                i++;
                j++;
            } else if (val1 < val2) {
                i++;
            } else {
                j++;
            }
        }

        return common;
    }
        
    
    public static void inorder(Node root, ArrayList<Integer> list){
        if(root == null) return ;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}


215 leetcode kth largest elemet 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.offer(num);
        }
        for(minHeap.size() > k) minHeap.poll();
        return minHeap.peek();
    }
}


gfg hright of heap 

class Solution {
    static int heapHeight(int n, int arr[]) {
        if(n == 1) return 1;
        int ans = 0;
        while(n > 1){
            ans ++;
            n = n / 2;
        }
        return ans;
    }
}

leetcode 704  binary search

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}

leetcode 704  binary search using recursion

class Solution {
    public int search(int[] nums, int target) {
       return rec(nums, target, 0, nums.length - 1);
    }

    public static int  rec(int nums[], int target, int left, int right){
        while(left <= right){
        int mid = left + (right - left)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return rec(nums, target, left, mid - 1);
        else return rec(nums,target, mid + 1, right);
        }
        return -1;
    }
}


leetcode 7 reverse number

class Solution {
    public static int helper(int x, int rev){
        if(x == 0) return rev;
        if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) return 0;
        rev = rev*10 + x % 10;
        return helper(x/10, rev);
    }
    public int reverse(int x) {
        return helper(x, 0);
    }
}

gfg conunt numer of zero in Array

// User function Template for Java

class Solution {
    
    public int helper(int arr[], int count, int itr){
        if(itr >= arr.length) return count;
        if(arr[itr] == 0) count++;
        return helper(arr, count, itr +1);
    }
    
    int countZeroes(int[] arr) {
        return helper(arr, 0, 0);
    }
}


