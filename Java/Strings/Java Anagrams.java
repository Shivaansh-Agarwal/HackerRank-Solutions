import java.util.Scanner;
public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int al,bl;
        al = a.length();
        bl = b.length();
        int a_count[] = new int[26];
        int b_count[] = new int[26];
        int i,index1,index2;
        char ch1,ch2;
        boolean ans=true;
        if(al!=bl)
            ans = false;
        else if(al==bl){
            for(i=0;i<al;i++){
                ch1 = a.charAt(i);
                index1 = ch1;
                if(index1<97){// UPPERCASE
                    a_count[index1-65] += 1;
                }
                else{// lowercase
                    a_count[index1-97] += 1; 
                }
                ch2 = b.charAt(i);
                index2 = ch2;
                if(index2<97){// UPPERCASE
                    b_count[index2-65] += 1;
                }
                else{// lowercase
                    b_count[index2-97] += 1; 
                }
            }
            for(i=0;i<26;i++){
                if(a_count[i] == b_count[i]){
                    continue;
                }
                else{
                    ans = false;
                    break;
                }
            }
        }
        return(ans);
    }
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
