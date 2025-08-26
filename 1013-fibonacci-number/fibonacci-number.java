// Recursion

class Solution {
    public int fib(int n) {
        if(n<=1) {
            return n;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}

/* Math Formula

class Solution {
    public int fib(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibN = Math.pow((1 + sqrt5) / 2, n) - Math.pow((1 - sqrt5) / 2, n);
        return (int) Math.round(fibN / sqrt5);
    }
}

*/