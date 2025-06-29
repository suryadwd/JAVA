class Main {

  public static void swap(int arr[], int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void SelectioSsort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int minIdx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }
      swap(arr, i, minIdx);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 6, 3, 7, 2, 8, 0, 9, 5 };
    for(int x : arr) System.out.print(x+" ");
    System.out.println();
    SelectioSsort(arr);
    for(int x : arr) System.out.print(x+" ");
  }

}
