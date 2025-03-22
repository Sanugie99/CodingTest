package test;
import java.util.*;
public class Ex_04 {
	/*
	 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는
	 * 대문자로 변환해서 출력하는 코드를 작성해 보세요.
	 * 
	 * 제한사항
	 * 1 ≤ str의 길이 ≤ 20
	 * str은 알파벳으로 이루어진 문자열입니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String swap = "";
        
        for(int i = 0; i < a.length(); i++) {
        	b = a.charAt(i); //charAt() : 문자열에서 문자 하나만 가져오는 함수
        	if(Character.isUpperCase(b)) { //Character.isUpperCase() : 대문자인지 확인
        		swap += Character.toLowerCase(b); //Character.toLowerCase(b); : 소문자로 변환
        	} else {
        		swap += Character.toUpperCase(b); //Character.toUpperCase(b); : 대문자로 변환
        	}
        }
        
        System.out.println(swap);
        

	}

}
