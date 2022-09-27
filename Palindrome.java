import java.io.*;
import java.util.*;

public class Palindrome {

        public static void main(String[] args) {
            //input
            Scanner sc=new Scanner(System.in);
            //A=sc.next where it means input is taken in String format
            String A=sc.next();
            StringBuilder sb = new StringBuilder(A);
            sb.reverse();
            String B = sb.toString();
            //here in the condition it checks wheather the input string and the reverse of the input strings is equal
            /* if the condition is true  it prints "It is a palindrome"
             if the condition is false   it prints "It is not a palindrome"
             */
            if (B.equals(A)){
                System.out.println("It is a palindrome");
            }
            else{
                System.out.println("It is not a palindrome");
            }
        }

    }

