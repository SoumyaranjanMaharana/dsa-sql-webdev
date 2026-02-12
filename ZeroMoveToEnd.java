public class ZeroMoveToEnd {
    public static void zeroToEndArray(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        zeroToEndArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
