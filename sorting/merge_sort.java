public class merge_sort
{
    public static void conquer(int arr[],int si ,int mid,int ei)
    {
        int merger[] = new int [ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x =0;

        while(idx1 <= mid && idx2<=ei)
        {
            if (arr[idx1]<= arr[idx2])
            {
                merger[x++] = arr[idx1++];
            }
            else
            {
                merger[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid)
        {
            merger[x++] = arr[idx1++];
        }

        while(idx2<=ei)
        {
            merger[x++] =arr[idx2++] ;
        }

        for (int i=0,j=si;i<merger.length;i++,j++)
        {
            arr[j]=merger[i];
        }
    }
    public static void divide(int arr[],int si,int ei)
    {
        if (si>= ei)
        {
            return;
        }
        int mid= si +(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1 ,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args)
    {
        int arr[]={6,9,23,15,7,11,8,33,45,72,14,5,20,18};
        int n=arr.length;

        divide(arr,0,n-1);
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}







//public class JavaApplication17
//{
//    private static void mergeSort(int[] array, int left, int right)
//    {
//        if (left >= right)
//        {
//            return;
//        }
//        int mid = (left + right) / 2;
//        mergeSort(array, left, mid);
//        mergeSort(array, mid + 1, right);
//        merge(array, left, mid, right);
//    }
//
//    private static void merge(int[] array, int left, int mid, int right)
//    {
//        int[] temp = new int[right - left + 1];
//        int i = left, j = mid + 1, k = 0;
//        while (i <= mid && j <= right)
//        {
//            if (array[i] <= array[j])
//            {
//                temp[k++] = array[i++];
//            }
//            else
//            {
//                temp[k++] = array[j++];
//            }
//        }
//        while (i <= mid)
//        {
//            temp[k++] = array[i++];
//        }
//        while (j <= right)
//        {
//            temp[k++] = array[j++];
//        }
//        for (i = 0; i < temp.length; i++)
//        {
//            array[left + i] = temp[i];
//        }
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter size of array");
//        int n=sc.nextInt();
//        int[] array = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            array[i]=sc.nextInt();
//        }
//        mergeSort(array, 0, array.length - 1);
//        for (int num : array)
//        {
//            System.out.print(num + " ");
//        }
//    }
//}
