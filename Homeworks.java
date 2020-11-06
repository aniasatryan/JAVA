public class Homeworks {
    public static void main(String[] args) {
       //task 1: Create an array and fill it with 2 number
        double[] arr1 = {12.4,55.647};
        //or
        int[] arr2 = new int[2];
        arr2[0] = 10;
        arr2[1] = 155;

        System.out.println();

        //task 2: Create an array and fill it with numbers from 1:1000;
        int[] arr3 = new int[1000];
        for(int i = 0; i < 1000; i++){
            arr3[i] = i + 1;
            System.out.println(arr3[i]);
        }

        System.out.println();
        //task 3: Create an array and fill it with odd numbers from -20:20;
        int[] oddArr = new int[20];
        int q = 0;
        for(int i = -19; i < 20; i += 2){
            oddArr[q] = i;
            System.out.println(oddArr[q]);
            q ++;
        }
        System.out.println();

        //task 4: Create an array and fill it. Print all elements which can be divided by 5;
        int[] arr4 = new int[]{1,2,45,7,6,98,100,0,15,50,500,46,77,99};
        int len = arr4.length;
        for(int i = 0; i <= len; i++){
            if(arr4[i] % 5 == 0){
                System.out.println(arr4[i]);
            }
        }
        System.out.println();

        //task 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23;
        double[] arr5 = new double[]{-15.4,100.03,20.587,24.10,467.5};
        for(int i = 0; i < arr5.length; i++){
            if((arr5[i] >= 24.12) && (arr5[i] <= 467.23)){
                System.out.println(arr5[i]);
            }
        }
        System.out.println();

        //task 6: Create an array and fill it. Print count of elements which can be divided by 2;
        int[] arr6 = new int[]{2,4,5,7,8,9,10,58,94,101,100};
        int count = 0;
        for(int i = 0; i < arr6.length; i++){
            if(arr6[i] % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);
        System.out.println();

        //task 7: Given an integer, 0 < N < 21, print its first 10 multiples. Each multiple N x i (where 0 < i < 11)
        //should be printed on a new line in the form: N x i = result;

        int N = 3;
        for(int i = 1; i < 11; i++){
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        System.out.println();

    }
}
