public class sorting
{
    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = {7, 8, 1, 3, 2,23,17,25,14};


        //bubble sort
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

//using flag for storing boolean value bubble sort is made adaptive and the best time complexity will be O(n)
//        static void bubbleSort(int arr[], int n)
//        {
//            int i, j, temp;
//            boolean swapped;
//            for (i = 0; i < n - 1; i++) {
//                swapped = false;
//                for (j = 0; j < n - i - 1; j++) {
//                    if (arr[j] > arr[j + 1]) {
//
//                        // Swap arr[j] and arr[j+1]
//                        temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                        swapped = true;
//                    }
//                }
//                // If no two elements were
//                // swapped by inner loop, then break
//                if (swapped == false)
//                    break;
//            }
//        }



        // selection sort
//        for(int i=0; i<arr.length-1; i++)
//        {
//            int smallest = i;
//            for(int j=i+1; j<arr.length; j++)
//            {
//                if(arr[j] < arr[smallest])
//                {
//                    smallest = j;
//                }
//            }
//            //swap
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }



        //insertion sort
//        for(int i=1; i<arr.length; i++)
//        {
//            int current = arr[i];
//            int j = i - 1;
//            while(j >= 0 && arr[j] > current)
//            {
//                //Keep swapping
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = current;
//        }


        printArray(arr);
    }


}