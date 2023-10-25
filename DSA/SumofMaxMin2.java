public class SumofMaxMin2 {
     
    // Function to find minimum element
static int getMin(int arr[], int n)
{
    int res = arr[0];
    for (int i = 1; i < n; i++)
        res = Math.min(res, arr[i]);
    return res;
}
 
// Function to find maximum element
static int getMax(int arr[], int n)
{
    int res = arr[0];
    for (int i = 1; i < n; i++)
        res = Math.max(res, arr[i]);
    return res;
}
 
// Function to get Sum
static int findSum(int arr[], int n)
{
    int min = getMin(arr, n);
    int max = getMax(arr, n);
 
    return min + max;
}
 
// Function to get product
static int findProduct(int arr[], int n)
{
    int min = getMin(arr, n);
    int max = getMax(arr, n);
 
    return min * max;
}
 
// Driver Code
     
    public static void main (String[] args) {
    int arr[] = { 12, 1234, 45, 67, 1 };
    int n = arr.length;
 
    // Sum of min and max element
        System.out.println ("Sum = " + findSum(arr, n));
 
    // Product of min and max element
        System.out.println( "Product = " + findProduct(arr, n));
 
         
         
    }
}
