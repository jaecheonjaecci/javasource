package exam;

import java.util.Scanner;

public class NumMuitiple {

	public static void main(String[] args) {
		//변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num
		//의 값을 뺀 나머지를 구하시오
		//ex)num이 24라면 크면서도 가장 가까운 10의 배수는 30임
		//num = 18,20
		
	//	int num = 81;
	//	System.out.println((10-(num%10))*10); //90
Scanner k = new Scanner(System.in);

	System.out.print("숫자를 입력하세요!");
	int num = k.nextInt();
	
	System.out.println((num/10+1)*10);
	}
}
