package ex1;

public class CommonMultiple2 {

	public static void main(String[] args) {
		// 2または3の倍数を1から50未満の範囲で表示するプログラム
		int i = 1;
		while ( i < 50) {
			if ((i % 2 == 0) || (i % 3 ==0)) {
				// 倫理和
				System.out.println(i);
			}
			i++; //インクリメント演算子
		}

	}

}
