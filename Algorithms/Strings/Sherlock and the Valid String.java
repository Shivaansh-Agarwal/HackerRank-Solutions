import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        int count[] = new int[26];
        char ch;
        int index,temp,c=0,c1=0;
        int i;
        String ans="NO";
        for(i=0;i<s.length();i++){
            ch = s.charAt(i);
            index = ch;
            index = index - 97;
            count[index] += 1;
            if(count[index]==1){
                c += 1; //No of unique characters
            }
        }
        temp = count[0];    //used for storing number of a's
        for(i=1;i<26;i++){
            if(temp==count[i]){
                c1 += 1;
            }
        }
        if(c1+1>=c-1){
            ans = "YES";
        }
        else{
            ans = "NO";
        }
        return(ans);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
