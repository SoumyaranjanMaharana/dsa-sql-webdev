public class FIndMissingNumber {
    public static int findMissingNumber(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                n--;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5};
        System.out.println(findMissingNumber(arr));

    }
}
