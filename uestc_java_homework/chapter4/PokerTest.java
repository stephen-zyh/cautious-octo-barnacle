package chapter4;

public class PokerTest {

	public static void main(String[] args) {

		Poker poker = new Poker();
		poker.shuffle(); // 洗牌
		Poker.Card c1 = poker.getCard(0); // 发第一张牌

		Poker.Card c2 = poker.new Card("红心", 1); // 自己创建一张牌

		System.out.println(c1); // 洗牌后的第一张
		System.out.println(c2); // 打印: 红心A

	}

}
