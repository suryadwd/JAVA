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

  public static void bubleSort(int arr[]){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr.length - i - 1; j++){
        if(arr[j] > arr[j+1]) swap(arr, j, j+1);
      }
    }
  }
 
  public static void insertionSort(int arr[]){
    for(int i = 1; i < arr.length; i++){
      int j = i;
      while(j - 1 >= 0 && arr[j-1]>arr[j]){
        swap(arr,j-1,j);
        j--;
      }
    }
  }

  public static void merge(int[] arr, int start, int mid, int end) {
    int temp []=  new int[end - start + 1];
    int left = start, right = mid+1, idx = 0;

    while(left <= mid && right <= end){
      if(arr[left] <= arr[right]) temp[idx++] = arr[left++];
      else temp[idx++] = arr[right++];
    }

    while(left <= mid) temp[idx++] = arr[left++];
    while( right <= end) temp[idx++] = arr[right++];

    idx = 0;
    for (int i = 0; i < temp.length; i++) arr[start + i] = temp[i];
    

  }

  public static void mergeSort(int arr[], int start, int end){
    if(start >= end) return;
    int mid = start + (end - start)/2;
    mergeSort(arr, start, mid);           // left part
    mergeSort(arr, mid+1, end);           // right part
    merge(arr, start, mid, end);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 6, 3, 7, 2, 8, 0, 9, 5 };
    for(int x : arr) System.out.print(x+" ");
    System.out.println();
    // SelectioSsort(arr);
    // bubleSort(arr);
    // insertionSort(arr);
    mergeSort(arr, 0, arr.length - 1);
    for(int x : arr) System.out.print(x+" ");
  }

}
