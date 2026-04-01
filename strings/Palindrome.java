// Problem: Check if a string is palindrome
// Approach: Reverse string and compare OR two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)


    import java.util.Scanner;

    public class PalindromeString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Word");
            String input = sc.next();
            String reversed = new StringBuilder(input).reverse().toString();
            if(input.equals(reversed)){
                System.out.println("is Palindrome");
            }else{
                System.out.println("is Non Palindrome");
            }
        }
    }

