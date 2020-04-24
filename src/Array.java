import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
            Input:
                numbers of array
            Output:
                sum of numbers in the array
                Average of the numbers in the array
            processing steps:
                Declare double variable sum and initialize with 0.
                Declare double variable average and initialize with 0.
                Declare double array variable.
                Prompt the user to give as the size of the array.
                Initialize the array with the value given from user.
                Open for loop
                    prompt the user to enter value in each index of the array.
                    Add the entered values of sum variable.
                stop the loop when the loop get greater than array size
                calculate the ave by dividing sum by the array length
                Display the array,the sum and the average for the user.

         Algorithm:
            for(int x = 0; x < array.length;x++)
            {
            Sum = sum + array[x];
            }
            average = sum / array.length;

         ======================================================================================
         Case 1:
            What size of array do you need? 10
            Please enter value: 1
            Please enter value: 2
            Please enter value: 3
            Please enter value: 4
            Please enter value: 5
            Please enter value: 6
            Please enter value: 7
            Please enter value: 8
            Please enter value: 9
            Please enter value: 10
            [1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0]
            The sum of the values entered: 55.0
            The average is : 5.5
        Case 2:
            What size of array do you need? 3
            Please enter value: 100
            Please enter value: 200
            Please enter value: 300
            [100.0, 200.0, 300.0]
            The sum of the values entered: 600.0
            The average is : 200.0



         */

        int arraySize;
        double userValues;
        double sum = 0;
        double average = 0;
        double [] numbers;
        Scanner in = new Scanner(System.in);

        System.out.print("What size of array do you need? ");
        arraySize = in.nextInt();
        numbers = new double[arraySize]; // creat the array with the size of arraySize.

        // calculate the sum by asking the use to enter values number.length times.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter value: ");
            userValues = in.nextDouble();
            numbers[i] = userValues;
            sum += numbers[i];
        }
        average = sum / numbers.length; // calculate the average by dividing sum by the numbers of value entered.

        System.out.println(Arrays.toString(numbers));
        System.out.println("The sum of the values entered: " + sum);
        System.out.println("The average is : " + average);











    }
}
