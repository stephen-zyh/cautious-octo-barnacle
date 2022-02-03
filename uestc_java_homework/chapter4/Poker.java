package chapter4;

public class Poker {
	// 内部类Card
	public class Card {
		private String suite; // 花色
		private int face; // 点数

		public Card(String suite, int face) {
			this.suite = suite;
			this.face = face;
		}

		@Override
		public String toString() {
			String faceStr = "";
			switch (face) {
			case 1:
				faceStr = "A";
				break;
			case 11:
				faceStr = "J";
				break;
			case 12:
				faceStr = "Q";
				break;
			case 13:
				faceStr = "K";
				break;
			default:
				faceStr = String.valueOf(face);
			}
			return suite + faceStr;
		}
	}

	// Poker类 成员
	private static String[] suites = { "黑桃", "红桃", "梅花", "方块" };
	private static int[] faces = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private Card[] cards;

	// 构造器
	public Poker() {
		// 构造52个Card对象 存放在cards 数组中
		cards = new Card[52];
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				cards[i * 13 + j] = new Card(suites[i], faces[j]);
			}
		}
	}

	// 洗牌 （随机乱序）
	public void shuffle() {
		int len = cards.length;
		for (int i = 0; i < len; i++) {
			int index = (int) (Math.random() * len);
			Card temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}

	// 获取一个Card 对象
	public Card getCard(int index) {
		return cards[index];
	}

}