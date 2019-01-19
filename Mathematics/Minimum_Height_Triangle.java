# Minimum Height Triangle
import java.io.*;
import java.util.*;
import java.lang.Math;
public class Solution{
    public static void main(String args[])throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s[] = buff.readLine().split(" ");
        double b = Double.parseDouble(s[0]);
        double a = Double.parseDouble(s[1]);
        int h = (int)Math.ceil(2*(a/b));
        System.out.println(h);
    }
}