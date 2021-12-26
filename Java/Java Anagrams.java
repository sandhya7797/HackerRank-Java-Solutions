Solution 1 :

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        char[] aa = a.toUpperCase().toCharArray();
        char[] bb = b.toUpperCase().toCharArray();
        
        java.util.Arrays.sort(aa);
        java.util.Arrays.sort(bb);
        
        String a1 = new String(aa);
        String b1 = new String(bb);
        
        if(a1.equals(b1)) {
            return true;
        } else {
            return false;
        }
        
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
