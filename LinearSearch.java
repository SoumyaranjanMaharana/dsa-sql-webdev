public class LinearSearch {
    public static int searchArray(int arr[],int target){
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                result=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int target=40;
        System.out.println(searchArray(arr, target));
    }
}
