import java.lang.*;
import java.util.*;
import java.io.*;

public class Solution{
    static long solve(long n,long m){
        long ans;
        ans = n*m-1;
        return ans;
    }
    public static void main(String args[])throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s[] = buff.readLine().split(" ");
        long n = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);
        long result = solve(n,m);
        System.out.println(result);
    }
}