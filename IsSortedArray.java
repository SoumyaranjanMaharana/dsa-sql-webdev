/*Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
*/

// 1.Brute-force
// public class IsSortedArray {
//     public static boolean isSorted(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]<arr[i-1]){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static boolean check(int arr[]){
//         int n=arr.length;
//         for(int x=0;x<arr.length;x++){
//             int rotated[]=new int[n];
//             for(int i=0;i<n;i++){
//                 rotated[i]=arr[(i+x)%n];
//             }
//             if(isSorted(rotated)){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[]={3,4,5,1,2};
//         System.err.println(check(arr));

//     }
// }

//2.Optimized
public class IsSortedArray {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        System.out.println(check(nums));
    }
}