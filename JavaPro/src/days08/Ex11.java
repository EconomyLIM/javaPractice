package days08;

import java.nio.channels.NonWritableChannelException;

public class Ex11 {
	public static void main(String[] args) {
		
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 5원, 1원
		// 125760원
		// 50,000원 : 2개
		// 10,000원 : 2개
		// 5000원 : 1개
		// 1000원 : 0개
		// 500원 : 1개
		// 100원 : 2개
		// 50원 : 1개
		// 10원 : 1개
		// 5원 : 0개
		// 1원 : 0개
		
		int money = 125760;
		moneyCnt(money);
	}

	public static void moneyCnt(int money) {
		int cnt [] = new int[10];
		int moneyArr[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		for (int i = 0; i < moneyArr.length; i++) {
			cnt[i] = money/moneyArr[i]; 
			System.out.printf("%d : %d개\n",moneyArr[i], cnt[i]);
			money = money%moneyArr[i]; 
		} //for
		
	} // moneyCnt
}
