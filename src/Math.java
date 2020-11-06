public class Math {
    public static void main(String[] args) {
        System.out.println("Arithmetics");
        int a = 25, b = 100, c = 15;
        int sum = a + b;
        System.out.println("Sum of nums = " + sum);

        int mult = a * b;
        System.out.println(mult);

        int sub = b - a;
        System.out.println("sub of nums = " + sub);

        int div1 = b / a;
        System.out.println(div1);
        int div2 = b /c;
        System.out.println(div2);
        int mod1 = b % a;
        System.out.println(mod1);
        int mod2 = b % c;
        System.out.println(mod2);

        int x = 1;
        System.out.println(x++);
        System.out.println(x);
        int y = 1;
        System.out.println(++y);
        System.out.println(y);
        System.out.println();

        System.out.println("Relational");
        System.out.println( a == b );
        System.out.println( a != b );
        System.out.println( a > c );
        System.out.println( b < a );
        System.out.println( b >= a );
        System.out.println( b <= c );
        System.out.println();

        System.out.println("Logical");
        System.out.println(a > c && b < c);
        System.out.println(a > c || b < c);
        System.out.println(a > c && !(b < c));
        System.out.println();

        System.out.println("Bitwise");
        int m = 60, n = 13; // 60 = 111100; 13 =1101
        System.out.println("bitwise and = " + (m & n)); // 0000 1100
        System.out.println("bitwise or = " + (m | n)); // 0011 1101
        System.out.println("bitwise XOR = " + (m ^ n)); // 0011 0001
        System.out.println("zero fill right shift with 2 = " + (m >>> 2)); // 0000 1111
        System.out.println("zero fill right shift with 3 = " + (m >>> 3)); // 0000 0111
        System.out.println("zero fill right shift with 1 = " + (m >>> 1)); // 0001 1110
        System.out.println("bitwise compliment = " + (~m)); // 1100 0011
        System.out.println("left shift with 2 = " + (m << 2)); // 1111 0000
        System.out.println("left shift with 1 = " + (m << 1)); // 0111 1000
        System.out.println("right shift with 2 = " + (m >> 2)); // 0000 1111
        System.out.println("right shift with 1 = " + (m >> 1)); // 0001 1110
        System.out.println();

        System.out.println("Arrays");
        //array init
        int[] arr1 = new int[5]; //the size of array is 5
       // System.out.println(arr1);
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr2.length);
        System.out.println();

        System.out.println("if/else");
        if (b < a )
            System.out.println("yeey");
        else
            System.out.println("meh");

        if (b > a){
            a++;
            System.out.println("cool");
            System.out.println(a);
        }

        int k = a < 5 ? 80: 180;
        System.out.println(k);

        System.out.println();

        System.out.println("switch");
        int h = 2;
        switch (h){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");

        }
        System.out.println();

        System.out.println("while");
        int a1 = 5, b1 = 10;
        while (a1 < b1) {
            System.out.print("* ");
            a1 ++;
        }
        System.out.println();

        System.out.println("for");
        for (int i = 0; i < 5; i ++) {
            System.out.println(i);
        }
        System.out.println();
        }
    }
