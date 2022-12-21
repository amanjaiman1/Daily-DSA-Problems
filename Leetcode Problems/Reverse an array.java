package Questions;

public class reverse_array {
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

    public static void main(String[] args) {
        int arr[] = {2,9,8,6,5,20};
        int n = arr.length;

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();




        System.out.println("After Reverse");
        Reverse(arr, n);

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
