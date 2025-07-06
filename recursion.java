import javax.swing.*;

public class recursion
    //calling of function by itself is called recursion
{
    //que 1
//    static int factorial(int n)
//    {
//        if (n==0 || n==1)
//        {
//            return 1;
//        }
//
//        else
////        {
////            return n * factorial(n-1);
////        }
//        // another way
//        {
//            int product=1;
//            for (int i=1;i<=n;i++)
//            {
//                product *= i;
//            }
//            return product;
//        }
//
//    }
//

    //que 2
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n); //reverse  --jaate time
        printNumbers(n - 1);
        printNumbers(n - 2);
        printNumbers(n - 3);

//        System.out.println(n);  //in order --aate time
    }

    //que 3
//    public static void printNumbers(int n)
//    {
//        if(n == 6)
//        {
//            return;
//        }
//        System.out.println(n);
//        printNumbers(n+1);
//    }

    //que 4 print no of sum
//    public static void printsum(int i ,int n,int sum)
//    {
//        if (i==n)
//        {
//            sum +=i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printsum(i+1,n,sum);
//        System.out.println(i);
//    }

    //que 5 calculate factorial
//    public static void printfact(int n,int fact)
//    {
//        if(n == 0) {
//            System.out.println(fact);
//            return;
//        }
//        fact *= n;
//        printfact(n-1, fact);
//    }

//    static int fact(int num){
//        if (num ==1){
//            return num;
//        }
//        int i = fact(num-1);
//        return i*num;
//    }

    //que 6
//    public static void printFibonacci(int a, int b, int n)
//    {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(a);
//        printFibonacci(b, a + b, n - 1);
//    }


    //que 7
//    public static int printPower(int x, int n)
//    {
//        if(n == 0)
//        {
//            return 1;
//        }
//        if(x == 0)
//        {
//            return 0;
//        }
//        int x_ = printPower(x, n-1);
//        int xn = x * x_;
//        return xn;
//    }

    //que 8
//    public static int printPower(int x, int n)
//    {
//        if(n == 0)
//        {
//            return 1;
//        }
//        if(n % 2 == 0)
//        {
//            return printPower(x, n/2) * printPower(x, n/2);
//        }
//        else
//        {
//            return x * printPower(x, n/2) * printPower(x, n/2);
//        }
//    }

    //que 9 table
//    static void printTable(int x, int n) {
//        if (n == 0) {
//            return;
//        }
//        if (x == 0) {
//            return;
//        }
//        printTable(x, n - 1);
//        System.out.println(x * n);
//    }

//    static String printTable2(int x, int n) {
//        if (n == 0) {
//            return " ";
//        }
//        if (x == 0) {
//            return " ";
//        }
//        String st1= printTable2(x, n - 1);
//        String st2  = " "+(x*n) ;
//        return st1+st2;
//    }

//    static String [] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//    static void convert (int num){
//        if(num ==0){
//            return;
//        }
//        convert(num / 10);
//        int digit = num% 10;
//        System.out.print(arr[digit]+" ");
//        if(digit == 1)

//    static void gentoAll(String result,int depth){
//        if(depth ==0){
//            System.out.println(result);
//            return;
//        }
//        for(char c ='A';c<= 'Z';c++){
//            if(c=='A' || c=='E' || c== 'I' || c=='O'|| c=='U'){
//                gentoAll(result +c,depth-1);
//            }
//
//        }
//    }

    static void fillArray(int arr[], int val ,int index){
        if(index == arr.length){
            return;
        }
        arr[index] = val;
        fillArray(arr,val+1,index+1);
        arr[index] = val * val;
    }





        static boolean palindrome(int i, String s){
            if(i>=s.length()/2) return true;
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            return palindrome(i+1,s);
        }


















    public static void main(String[] args){
     // que 1
//        int x =6;
//        System.out.println(factorial(x));

     // que 2
//        int n=5;
//        printNumbers(5);

        //que 3
//        int n=1;
//        printNumbers(5);

        //que 4
//        printsum(1,7,0 );

        //que 5
//        printfact(7,1);
//        System.out.println(fact(5));

        //que 6
//        printFibonacci(0,1,9);

        //que 7
//        int x = 9, n = 8;
//        int output = printPower(x, n);
//        System.out.println(output);

        //que 8
//        int x = 2, n = 5;
//        int output = printPower(x, n);
//        System.out.println(output);

//        System.out.println(printTable2(5,10));

//        convert(88);



//        palindrome
//count even and odd between a range
        //count even and odd in a number
        //convert binary into decimal
        //

//        int arr[] = new int[5];
//        fillArray(arr,1,0);
//        for (int i =0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        String s = "madam";
        System.out.println(palindrome(0,s));

    }

}
