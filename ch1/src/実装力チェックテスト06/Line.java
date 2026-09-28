package 実装力チェックテスト06;

public class Line implements Figure {
	
	private Point p1;
	private Point p2;

	// p1(x,y座標)、p2(x,y座標)全て0で初期化する。
	public Line() {
		this.p1 = new Point(0,0);
		this.p2 = new Point(0,0);
	}
	
	// 引数で受け取ったデータを用いて、 2つのPointオブジェクトを生成。
	// p1フィールドとp2フィールドにそれぞれ代入する
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}
	
	// 以下のようなメッセージを表示する。なお、始点を p1、終点を p2とする。
	// 出力例："[線を描画 ] 始点(0,0)から終点 (100,100)まで"
	public void draw() {
		System.out.println("[線を描画]始点(0,0)から終点(100,100)まで");
	}
	
	// 始点データと終点データを使い、以下の計算式で算出した結果を返す。
	// (( 終点のx座標 - 始点のx座標 ) ^2 + ( 終点のy座標 - 始点のy座標 ) ^2 ) の平方根
	// 累 乗 ...Math.powメソッド
    // 平方根 ...Math.sqrtメソッド
	public double getPerimeter() {
		// 座標を変数に変換する
		int x1 = p1.getX();
		int y1 = p1.getY();
		int x2 = p2.getX();
		int y2 = p2.getY();
		
		// 計算式で算出した計算結果を返す
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(x2 - y2,2));
		return result;
	}
}
