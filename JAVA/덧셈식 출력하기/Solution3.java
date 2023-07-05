import java.util.Scanner;
/*
 * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
 * 
 * a + b = c
 * 
 * 제한사항 : 1 ≤ a, b ≤ 100
 * 
 * 입력 #1 : 4 5
 * 
 * 출력 #1 : 4 + 5 = 9
 * 
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        while(true){
            if(!(1 <= a)){
                System.out.println("a는 1이상이여야 합니다. 다시 입력해주세요!");
                a = sc.nextInt();
            }else{
                break;
            }
        }

        int b = sc.nextInt();
        while(true){
            if(!(b <= 100)){
                System.out.println("b는 100이하여야 합니다. 다시 입력해주세요!");
                b = sc.nextInt();
            }else{
                break;
            }
        }
        
        System.out.println(a +" + " + b +" = "+(a+b));

        sc.close();
    }
}