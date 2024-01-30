### Array: Find Longest String ( ** Interview Question)

Write a method that, given an array of strings, finds and returns the longest string in the array.

If there are multiple strings with the same maximum length, return the first one encountered.

Method Signature

public static String findLongestString(String[] stringList)

This method takes an array of strings stringList as input and returns a string.

Input

An array of strings stringList

Output

Returns a string that is the longest string in the input array. If multiple strings have the same
length, it returns the first string encountered.

Example

For example, if the input array is {"apple", "banana", "kiwi", "pear"}, the method should return "
banana" since "banana" is the longest string in the array.

Additional Notes

The implementation needs to consider the case where the string is empty "" as in test case 5. In
this case, the empty string has the least length. If all the strings in the array are of the same
length, the method will return the first string in the array.

Please ensure your solution handles these cases correctly.

### Hint

## Pseudo Code:

Initialize a variable longestString as an empty string. This variable will keep track of the longest
string in the input array stringList.

Iterate over the array stringList using a for-each loop, with str representing each element in
stringList.

Inside the loop:

3.1. Check if the length of str is greater than the length of the current longestString. If true,
update longestString with the value of str.

After the loop ends, return longestString. This string will be the longest string found in the input
array.

### Solution

    public static String findLongestString(String[] stringList) {
        String longestString = "";
        for (String str : stringList) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }

The findLongestString method is designed to find and return the longest string in an array of
strings, stringList.

Here's a step-by-step explanation of how it works:

The method begins by initializing a variable called longestString as an empty string (""). This
variable is used to keep track of the longest string that the method has come across as it goes
through the array.

Next, the method uses a for-each loop to go through each string (str) in the array. A for-each loop
is a simpler style of loop that goes through each item in a collection or array, without needing a
counter.

Inside the loop, it checks if the length of the current string (str.length()) is greater than the
length of the currently longest string (longestString.length()).

If the current string is longer, it replaces longestString with the current string (str). In this
way, the longestString variable always contains the longest string that the method has encountered
so far.

Once the loop has gone through all the strings in the array, the method returns longestString which
now contains the longest string in the array.

So, the findLongestString method basically compares the length of each string in the array to find
the longest one and returns that string.

Code with inline comments:

    public static String findLongestString(String[] stringList) {
    // Initialize an empty string to keep track of the longest string
    String longestString = "";

    // Loop through each string in the input list
    for (String str : stringList) {
        // Check if the current string is longer than the longest one found so far
        if (str.length() > longestString.length()) {
            // If it is, update longestString to be this string
            longestString = str;
        }
    }
    
    // After checking all strings, return the longest one
    return longestString;

}


