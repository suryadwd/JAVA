import java.util.Scanner;

public class day5 {

  public static int Celing(int[] nums, int target) {

    int low = 0, high = nums.length - 1;

    int ciling = 0;

    while (low <= high) {

      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        return nums[mid];
      }

      else if (nums[mid] < target) {
        low = mid + 1;
        ciling = low;
      }

      else
        high = mid - 1;
      ciling = low;
    }
    return nums[ciling];
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter target: ");
    int t = sc.nextInt();
    System.out.println(Celing(arr, t));

    sc.close();
  }

}
