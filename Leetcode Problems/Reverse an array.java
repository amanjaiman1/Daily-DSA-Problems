package Questions;

public class reverse_array {
    //Simple Reversing.
    static void Reverse(int arr[] , int n){
            int start = 0;
            int end = n-1;

            while (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
    }
    
    //Here some trick - we get a target 'm' through which we have to reverse the array after the 'm' number of size.
    
    // for ex:
    // arr[] = {1,2,3,4,5};
    // getting m = 2;
    
    // so we have to reverse the array after the array size 2 , i.e
    //{4,5};
    
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int i = m+1;
        int j = arr.size() - 1;
        while (i < j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            j--;
            i++;
        }
    }

}

Thanks 😊
