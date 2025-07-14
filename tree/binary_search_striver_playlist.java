public class binary_search_striver_playlist {
    //to find square root using bs
    public static int sqrt(int x){
        if(x<2){
            return x;
        }
        int left = 1,right = x,ans=0;

        while(left <= right){
            int mid = left +(right - left )/2;
            if( mid*mid == x){
                return mid;
            } else if(mid*mid <x){
                ans = mid;
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return ans;
    }

    //nth root of an integer
    public static long power(long mid, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= mid;
            if (result > Long.MAX_VALUE) break;
        }
        return result;
    }
    public static int nthRoot(int n,int x){
        int left = 1,right = x;

        while(left <= right){
            int mid = left +(right - left )/2;
            long midPow = power (mid,n);
            if (midPow == x) {
                return mid; // exact root found
            } else if (midPow < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        System.out.println(sqrt(35));

    }
}
