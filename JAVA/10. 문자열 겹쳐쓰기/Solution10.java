import java.util.Scanner;

public class Solution10 {
    

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_String = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        sc.close();

        String answer = solution(my_String, overwrite_string, s);
        
        System.out.println(answer);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        System.out.println(my_string.toCharArray(2));

        String answer = "";
        return answer;
    }
}