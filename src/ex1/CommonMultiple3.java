package ex1;

public class CommonMultiple3 {

	public static void main(String[] args) {
		// 2と3の公倍数以外の数を1から20未満の範囲で表示するプログラム
		int i = 1;
		while ( i < 20) {
			if (!((i % 2 == 0) && (i % 3 ==0))) {
				// 倫理和
				System.out.println(i);
			}
			i++; //インクリメント演算子
		}

	}

}
