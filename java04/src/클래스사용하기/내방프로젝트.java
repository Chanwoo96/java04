package 클래스사용하기;

import 클래스만들기.강아지;
import 클래스만들기.전화기;

public class 내방프로젝트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		전화기 p1 = new 전화기();
		System.out.println(p1);
		p1.size=11;
		p1.speaker="바나나사";
		
		p1.통화하다();
		p1.사진찍다();
		
		전화기 p2 = new 전화기();
		p2.size=6;
		p2.speaker="jbl";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		p2.사진찍다();
		p2.통화하다();
		
		강아지 dog = new 강아지();
		dog.견종="말라뮤트";
		dog.색상="검정색";
		System.out.println(dog.견종);
		System.out.println(dog.색상);
		dog.물기();
		dog.짖기();
		
	}

}
