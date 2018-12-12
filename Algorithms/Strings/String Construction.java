import java.io.*;
import java.util.*;

class Solution{
    static void stringConstruction(String s){
        int count[] = new int[26];
        int i,index,ans=0,ascii;
        char ch;
        for(i=0;i<s.length();i++){
            ch = s.charAt(i);
            ascii = ch; //Converting ch into ascii equivalent
            index = ascii - 97;
            count[index] += 1;
            //System.out.println(ch);
            //System.out.println(count[index]);
        }
        for(i=0;i<26;i++){
            if(count[i]==0){
                continue;
            }
            else if(count[i]!=0){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int i,n;
        String str;
        n = scan.nextInt();
        for(i=0;i<n;i++){
            str = scan.next();
            stringConstruction(str);
        }
    }
}

