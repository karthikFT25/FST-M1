public class Activity2 {

    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};
        
        // Initialize the sum of all 10's in the array
        int sumOfTens = 0;

        // Loop through the array to find all the numbers that are multiples of 10
        for (int num : numbers) {
            if (num % 10 == 0) {
                sumOfTens += num;
            }
        }

        // Check if the sum of all 10's equals 30
        if (sumOfTens == 30) {
            System.out.println("The sum of all 10's in the array is 30.");
        } else {
            System.out.println("The sum of all 10's in the array is not 30.");
        }
    }
}
