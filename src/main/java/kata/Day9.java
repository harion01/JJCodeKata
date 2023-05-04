package kata;

public class Day9 {

    //recursive method for multiply given argument n * return of self call with n-1
    //bigO = O(n)
    //memory = O(n)
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial( n - 1 );
    }


    //factorial with dynamic programming
    //memoization
    public static int dynamicFactorial(int n){
        int[] memo = new int[n+1];
        memo[0] = 1;
        for(int i = 1; i<=n ; i++){
            memo[i] = i * memo[i-1];
        }
        return memo[n];
    }


}
