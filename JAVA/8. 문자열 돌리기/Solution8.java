import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(Character c : a.toCharArray()){
            System.out.println(c);
        }
        
        sc.close();
    }
}