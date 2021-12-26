Solution 1 :

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<N ; i++) {
            al.add(sc.nextInt());
        }
        
        int Q = sc.nextInt();
        
        for(int i=0;i<Q;i++) {
            
            String input = sc.next();
            if(input.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                al.add(x,y);
            } else {
                int z = sc.nextInt();
                al.remove(z);
            }
        }
        
        Iterator itr = al.iterator();
        
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
            
        }
}
