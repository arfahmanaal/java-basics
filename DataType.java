import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i=4;
        double d=4.0;
        String s="HackerRank ";
        
        Scanner sc=new Scanner(System.in);
        int intVar=sc.nextInt();
        double doubleVar=sc.nextDouble();
        sc.nextLine();
        String stringVar=sc.nextLine();
        System.out.println(i+intVar);
        System.out.printf("%.1f\n",d+doubleVar);
        System.out.println(s+stringVar);
        sc.close();
}
}
