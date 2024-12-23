import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
    }

    System.out.println(count(arr));   
    scan.close();
}

public static int count(int[] arr) {
    int dem = 0;

    for(int i =0; i<arr.length; i++){
        for(int j = i; j<arr.length; j++){
            int sum =0;
            for(int m = i; m<=j; m++){
                sum+=arr[m];
            }
            if(sum < 0){
                dem++;
            }
        }
    }

    return dem;
}
    }
