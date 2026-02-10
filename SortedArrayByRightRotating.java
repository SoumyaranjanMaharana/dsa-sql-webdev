import java.util.*;

class SortedArrayByRightRotating {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int rotated[] = new int[n];
        int x = n - k;
        for (int i = 0; i < n; i++) {
            rotated[i] = nums[(i + x) % n];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }

    // Main function
    public static void main(String[] args) {
        SortedArrayByRightRotating sol = new SortedArrayByRightRotating();
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        sol.rotate(nums, k);
        // print rotated array
        System.out.println("Rotated array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
