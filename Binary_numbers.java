import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        String binary=Integer.toBinaryString(n);
        String[] ones=binary.split("0");
        int maxConsecutiveOnes=0;
        for(String sequence: ones){
            maxConsecutiveOnes=Math.max(maxConsecutiveOnes,sequence.length());
        }
        System.out.println(maxConsecutiveOnes);
    }
}
