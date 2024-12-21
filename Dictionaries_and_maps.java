import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Map<String,String> phoneBook=new HashMap<>();
        for(int i=0;i<n;i++){
            String name=sc.next();
            String phoneNumber=sc.next();
            sc.nextLine();
            phoneBook.put(name, phoneNumber);
        }
        while(sc.hasNext()){
            String query=sc.nextLine().trim();
            if(phoneBook.containsKey(query)){
                System.out.println(query + "="+phoneBook.get(query));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
