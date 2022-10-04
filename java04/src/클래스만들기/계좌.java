package 클래스만들기;

public class 계좌 {
	public String 이름;
	public String 계좌이름;
	public int 입금금액;
	public int 출금금액;

	public void 입금() {
		System.out.println(이름 + " 님이 " + 계좌이름 + "에 " + 입금금액 + "원을 입금하셨습니다.");
	}

	public void 출금() {
		System.out.println(이름 + " 님이 " + 계좌이름 + "에서 " + 출금금액 + "원을 출금하셨습니다.");
	}

}
