public class MaxBitwiseAndValue {
    static int maxValue(int [] arr){
        int max = -1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]&arr[j])>max){
                    max = arr[i]&arr[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,10,12};
        System.out.println(maxValue(arr));
    }
}
