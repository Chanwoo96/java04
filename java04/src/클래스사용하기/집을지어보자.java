package 클래스사용하기;

import 클래스만들기.벽돌틀;

public class 집을지어보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		벽돌틀 벽돌 = new 벽돌틀();
		벽돌.쌓다();
		벽돌.x=50;
		벽돌.y=50;
		System.out.println(벽돌.x);
		벽돌틀 벽돌2 = new 벽돌틀();
		벽돌2.쌓다();
	}
	

}
