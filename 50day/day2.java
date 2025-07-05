class Main{
    
    public static int[] NextGreaterElement(int arr[]) {
    int res[] = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        boolean found = false;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] > arr[i]) {
                res[i] = arr[j];  
                found = true;
                break;            
            }
        }
        if (!found) res[i] = -1;   
        }

    return res;
}

    
    public static void main(String[] args){
    int arr[] = {1, 3, 2, 4};
    for (int x : NextGreaterElement(arr)) {
        System.out.print(x + " ");
    }
    }
}