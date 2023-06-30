public class PalindromicBinaryRepresentation {
    static int solve(int a){
        int count=0;
        int n=1;
        while(count!=a){
            if(isPalindrome(n)){
                count++;
            }
            n++;
        }
        return n-1;
    }

    static boolean isPalindrome(int n){
        String s1 = toBinary(n);
        //reversing the string
        StringBuilder s2 = new StringBuilder(s1);
        s2 = s2.reverse();
        return s1.equals(s2.toString());
    }

    static String toBinary(int n)
    {  
        String ans = "";
        while(n > 0){
            ans = (Integer.toString(n&1)) + ans;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 1;
        System.out.println(solve(a));
    }
}