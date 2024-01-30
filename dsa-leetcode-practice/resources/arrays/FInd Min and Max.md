### Array: Find Max Min ( ** Interview Question)

In this problem, you are given an array of integers, and the task is to write a method that finds
the maximum and minimum numbers in the array.

The method should return these two numbers as an array with the maximum number at the first index
and the minimum number at the second index.

Method Signature

public static int[] findMaxMin(int[] myList)

This method accepts an integer array myList as the input and returns an integer array of size two.

Example

Let's illustrate the problem using an example:

Input: myList = [5, 3, 8, 1, 6, 9]

Output: [9, 1]

The function should iterate through the array to find the maximum and minimum numbers. In this case,
the maximum number is 9, and the minimum number is 1. Hence, the method should return [9, 1].

Additional Notes

The main method provides some test cases to check the solution's correctness. It is important to
note that the method should work correctly with negative numbers and zeros. Also, if the array
contains duplicate numbers, the function should still be able to correctly identify the maximum and
minimum numbers.

### Pseudo Code:

Initialize two variables, maximum and minimum, to the first element of the input array myList. These
will keep track of the maximum and minimum values in the array respectively.

Iterate over the array myList using a for-each loop, with num representing each element in myList.

Inside the loop:

3.1. Check if num is greater than the current maximum. If true, update maximum with the value of
num.

3.2. Check if num is less than the current minimum. If true, update minimum with the value of num.

After the loop ends, return a new array containing maximum and minimum as its elements. The maximum
value will be the first element and the minimum value will be the second element in the returned
array.

### Solution

    public static int[] findMaxMin(int[] myList) {
        int maximum = myList[0];
        int minimum = myList[0];
        for (int num : myList) {
            if (num > maximum) {
                maximum = num;
            } else if (num < minimum) {
                minimum = num;
            }
        }
        return new int[] {maximum, minimum};
    }

The findMaxMin function is designed to find both the maximum and minimum value in an array of
integers, myList, and return these two values in a new array.

Here's how it works:

The function starts by initializing two variables, maximum and minimum, to the first element of the
input array myList[0]. These two variables are used to keep track of the highest and lowest values
found in the array as it's traversed.

Next, the function uses an enhanced for loop (also known as a "for-each" loop) to traverse through
the myList array. In this loop, num is a temporary variable that takes on the value of each element
in myList, one by one from start to end.

Inside the for loop, there are two if statements:

The first if statement checks if the current element (num) is greater than the current maximum. If
it is, then num becomes the new maximum. This way, maximum always holds the highest value
encountered so far in the array.

The second if statement, which is the else if, checks if the current element (num) is less than the
current minimum. If it is, then num becomes the new minimum. This ensures that minimum always holds
the smallest value encountered so far in the array.

After the for loop has finished traversing the array, maximum and minimum will hold the highest and
lowest values found in the myList array, respectively.

Finally, the function returns a new array containing the maximum and minimum values. This is done
using the syntax new int[] {maximum, minimum}, which creates an anonymous array with two elements.

So for example, if myList was [5, 2, 10, 8, 6], the function would return [10, 2], because 10 is the
maximum value in the array and 2 is the minimum value.

Code with inline comments:

    public static int[] findMaxMin(int[] myList) {
        // Start with the first element as the initial maximum
        int maximum = myList[0];
        // Also start with the first element as the initial minimum
        int minimum = myList[0];
    
        // Traverse the list one number at a time
        for (int num : myList) {
            // If current number is greater than the known maximum...
            if (num > maximum) {
                // ...update maximum to this new value
                maximum = num;
            }
            // If current number is less than the known minimum...
            else if (num < minimum) {
                // ...update minimum to this new value
                minimum = num;
            }
        }
        
        // Return an array of two elements: maximum and minimum
    return new int[] {maximum, minimum};

}


