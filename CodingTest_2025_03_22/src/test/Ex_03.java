package test;
import java.util.*;
public class Ex_03 {
	/*
	 * 문제
	 * 문자열 str과 정수 n이 주어집니다.
	 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
	 * 
	 * 제한사항
	 * 1 ≤ str의 길이 ≤ 10
	 * 1 ≤ n ≤ 5
	 * 
	 * 입력: string 5
	 * 출력: stringstringstringstringstring
	 */
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.printf(str);
        }
	}
}
