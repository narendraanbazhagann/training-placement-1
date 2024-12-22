import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(year,month-1,day);

        System.out.println(calendar.getTime());

        int res = calendar.get(calendar.DAY_OF_WEEK);

        switch (res) {
            case 1:{return "SUNDAY";}
            case 2:{return "MONDAY";}
            case 3:{return "TUESDAY";}
            case 4:{return "WEDNESDAY";}
            case 5:{return "THURSDAY";}
            case 6:{return "FRIDAY";}
            case 7:{return "SATURDAY";}
            default:{return "nachobc";}
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
