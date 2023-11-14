// PrimeNumberChecker.java

public class Main {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int numToCheck = 2;
        if (isPrime(numToCheck)) {
            System.out.println(numToCheck + " là số nguyên tố.");
        } else {
            System.out.println(numToCheck + " không là số nguyên tố.");
        }


        int anotherNum = 12;
        if (isPrime(anotherNum)) {
            System.out.println(anotherNum + " là số nguyên tố.");
        } else {
            System.out.println(anotherNum + " không là số nguyên tố.");
        }
    }
}


