package test;
import java.util.*;
public class Ex_06 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2)%360;
        System.out.println(sum_angle);
	}

}
