package 클래스사용하기;

import 클래스만들기.계좌;

public class 은행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계좌 hong = new 계좌();
		hong.계좌이름="튼튼적금";
		hong.이름="홍길동";
		hong.입금금액 = 1000;
		hong.출금금액=2000;
		hong.입금();
		hong.출금();
		계좌 sim = new 계좌();
		sim.계좌이름="튼튼적금";
		sim.이름="심청이";
		sim.입금금액 = 3000;
		sim.출금금액=30000;
		sim.입금();
		sim.출금();
		계좌 kong = new 계좌();
		kong.계좌이름="튼튼적금";
		kong.이름="콩쥐";
		kong.입금금액 = 30000;
		kong.출금금액=4000;
		kong.입금();
		kong.출금();
		
	}

}
