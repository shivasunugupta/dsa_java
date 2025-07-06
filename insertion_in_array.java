public class insertion_in_array {
    static int insertSorted(int arr[], int n, int key, int capacity)
    {
        if (n >= capacity)
            return n;
        arr[n] = key;
        return (n + 1);
    }

    public static void main(String[] args)
    {
        int arr[] = { 12, 34, 10, 6, 40 };
        int n = arr.length;
        int key = 40;
        int capacity = 20;

        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = insertSorted(arr, n, key, capacity);

        System.out.print("\n After Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}




//insertion at any position
/*package whatever //do not write package name here */
//import java.io.*;
//
//// Java Program to Insert an element
//// at a specific position in an Array
//class GFG {
//    static void insertElement(int arr[], int n, int x,
//                              int pos)
//    {
//        // shift elements to the right
//        // which are on the right side of pos
//        for (int i = n - 1; i >= pos; i--)
//            arr[i + 1] = arr[i];
//        arr[pos] = x;
//    }
//    public static void main(String[] args)
//    {
//        int arr[] = new int[15];
//        arr[0] = 2;
//        arr[1] = 4;
//        arr[2] = 1;
//        arr[3] = 8;
//        arr[4] = 5;
//        int n = 5;
//        int x = 10, pos = 2;
//
//        System.out.print("Before Insertion: ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//
//        // Inserting key at specific position
//        insertElement(arr, n, x, pos);
//        n += 1;
//
//        System.out.print("\n\nAfter Insertion: ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//    }
//}

