package 클래스사용하기;

import 클래스만들기.계산기;

public class 내가계 {

	public static void main(String[] args) {
		//자바는 입력값이 다르면 메서드 이름이 동일해도 된다.
		계산기 add = new 계산기();
		int result = add.add(100,200);
		double result2= add.add(100, 22.2);
		계산기 mul = new 계산기();
		int result5=mul.multi(3000, 4);
		System.out.println(result5);
		
		double result6=mul.div(result5, 4);
		System.out.println("1인당 "+result6+"원씩 내야합니다.");
	}

}
