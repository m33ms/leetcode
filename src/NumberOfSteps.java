/*
1342. Number of Steps to Reduce a Number to Zero
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2,
otherwise, you have to subtract 1 from it.

Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.
 */

public class NumberOfSteps {

    //using recursion to solve
    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    //helper function
    static int helper(int num, int counter) {
        if(num==0) { return counter;}

        if(num%2==0) {
            return helper(num/2, counter +1);
        } else
            return helper(num-1, counter + 1);
    }

    public static void main(String[] args) {
        int num = 14;
        int num2 = 123;
        System.out.println(numberOfSteps(num));
        System.out.println(numberOfSteps(num2));
    }
}
