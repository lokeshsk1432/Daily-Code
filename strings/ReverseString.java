// Problem: Reverse a String
// Input: User input string
// Output: Reversed string
// Approach: Traverse string from end to start
// Time Complexity: O(n)

import java.util.Scanner;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Reversing");
        String input = sc.nextLine();
        String reversed = "";
        for(int i=input.length()-1; i>=0; i--){
          reversed = reversed + input.charAt(i);
        }
        System.out.println("After Reversing");
        System.out.println(reversed);
    }
}
