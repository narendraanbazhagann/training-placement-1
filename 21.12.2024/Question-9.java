import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a; // Initialize sum with 'a'
            for (int x = 0; x < n; x++) {
              sum += (Math.pow(2, x) * b); // Add the term for the current iteration
              System.out.print(sum + " "); // Print the current sum
        }
        System.out.println(); // Move to the next line after one test case
    }
        }
    }
