package recursion;

class TwoPointerStudy
{

    public static int isPairSum(int A[], int N, int X)
    {
        int i = 0;
        int j = N - 1;
 
        while (i < j) {
            if (A[i] + A[j] == X)
                return 1;

            else if (A[i] + A[j] < X)
                i++;
            else
                j--;
        }
        return 0;
    }
   
    public static void main(String[] args)
    {
        int arr[] = { 3, 5, 9, 2, 8, 10, 11 };
         
        int val = 17;
        int arrSize = arr.length;

        System.out.println(isPairSum(arr, arrSize, val));
    }
}
