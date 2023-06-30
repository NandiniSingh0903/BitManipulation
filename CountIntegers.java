public class CountIntegers {
    static int countIntegers(int n){
        int count=0;
        for(int i=0;i<=n;i++){
            if((i&n)==i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countIntegers(n));
    }
}
