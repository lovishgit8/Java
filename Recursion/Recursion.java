package Recursion;

public class Recursion {

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static void printDec(int n) {
        if(n == 1) {
            System.out.print(n +" ");
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fct = n * fnm1;
        return fct;
    }

    public static int sumOfN(int n) {
        if(n == 1) {
            return 1;
        }
        int nMinus1 = sumOfN(n-1);
        int nSum = n + nMinus1;
        return nSum;
    }

    public static void fibonacciSeries () {

    }

    public static boolean sortedArray (int arr[], int i) {
        if(i == arr.length - 1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return sortedArray(arr, i+1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr [i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance() {
        return -1;
    }

    public static int pow(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int xnm1=  pow(x, n-1);
        int pow = x * xnm1;
        return pow;
    }


    public static void main(String Args[]) {
        int result = pow(2, 6);
        System.out.print(result);
    }
}
