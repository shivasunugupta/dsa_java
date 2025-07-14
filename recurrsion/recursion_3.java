import java.util.ArrayList;
import java.util.Stack;

public class recursion_3
{
    //que 1 permutation of a string
//    public static void printPerm(String str,String permutation)
//    {
//         if (str.length() ==0)
//         {
//             System.out.println(permutation);
//             return;
//         }
//        for (int i=0;i<str.length();i++)
//        {
//            char currChar = str.charAt(i);
//            //abc -> bc -> c
//            String newStr = str.substring(0,i) + str.substring(i+1);
//            printPerm(newStr,permutation+currChar);
//        }
//    }


    //que 2 total paths in maze from (0,0) to (n,m)  only right and downwards
//    public static int countPaths(int i,int j,int n,int m)
//    {
//        if (i==n || j==m)
//        {
//            return 0;
//        }
//        if (i==n-1 && j== m-1)
//        {
//            return 1;
//        }
//
//        //move down
//        int downPath = countPaths(i+1,j,n,m);
//
//        //move right
//        int rightPath = countPaths(i,j+1,n,m);
//
//        return downPath + rightPath;
//    }


    //que 3 place tiles of size 1xm in a floor of size nxm
//    public static int placeTiles (int n,int m)
//    {
//        if (n==m)
//        {
//            return 2;
//        }
//        if (n<m)
//        {
//            return 1;
//        }


//        //vertivally
//        int vertPlacement = placeTiles(n-m,m);
//
//        //horizontally
//        int horPlacement = placeTiles(n-1,m);
//
//        return vertPlacement+horPlacement;
//
//    }


    //que 4
//    find the no of ways in which you cav invite n people to your party
//    public static int callGuest (int n)
//    {
//        if (n <= 1)
//        {
//            return 1;
//        }
//
//        //single
//        int ways = callGuest(n - 1);
//
//        //pair
//        int ways2 = callGuest(n - 2) * (n - 1);
//
//        return ways + ways2;
//    }


    //que 5 print all subsets of first n natural numbers
//    public static void printSubset(ArrayList<Integer> subset)
//    {
//        for (int i=0;i<subset.size();i++)
//        {
//            System.out.print(subset.get(i)+" ");
//        }
//        System.out.println();
//    }


//    public static void findSubset(int n,ArrayList<Integer> subset)
//    {
//        if (n==0)
//        {
//            printSubset(subset);
//            return;
//        }
//        //add hoga
//        subset.add(n);
//        findSubset(n-1,subset);
//
//        //add nahi hoga
//        subset.remove(subset.size()-1);
//        findSubset(n-1,subset);
//
//    }

    
//    sorting a stack using recursion
    public static void sortStack(Stack<Integer> stack){
        if( !stack.isEmpty()){
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack,top);
        }
    }
    public static void insertInSortedOrder(Stack<Integer>stack,int element){
        if(stack.isEmpty() || element> stack.peek()){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertInSortedOrder(stack,element);
        stack.push(top);
    }
    public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }



    public static void main(String[] args)
    {
//        String str ="abcd";
//        printPerm(str,"");

//        int n=3,m=3;
//        int totalPath = countPaths(0,0,n,m);
//        System.out.println(totalPath);

//        int n=4,m=2;
//        System.out.println(placeTiles(n,m));

//        int n=5;
//        System.out.println(callGuest(n));

//        int n =4;
//         ArrayList <Integer> subset = new ArrayList<>();
//         findSubset(n,subset);

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack:");
        printStack(stack);

        sortStack(stack);

        System.out.println("\nSorted Stack:");
        printStack(stack);

    }
}
