public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,1,300,4,7,25,8,-5};
        int l = arr.length;
        int temp = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l-i; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.println(arr[i]);
        }
    }
}
