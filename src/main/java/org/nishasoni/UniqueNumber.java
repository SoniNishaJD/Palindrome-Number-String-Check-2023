package org.nishasoni;

public class UniqueNumber {
    public static int findUniqueNumber(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num;  // ^=  means XOR
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9, 5, 3, 8, 9, 7};

        int uniqueNumber = findUniqueNumber(numbers);

        System.out.println("The unique number is: " + uniqueNumber);
    }
}
