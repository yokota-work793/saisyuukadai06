package 実装力チェックテスト06;

public class Circle extends Shape {
	
	private Point center;
	private int radius;
	
	// center(x,y座標)、半径全て 0で初期化する
	public Circle() {
		this.center = new Point(0, 0);
		this.radius = 0;
	}
	
	// 引数x,yで受け取ったデータを用いて、 1つのPointオブジェクトを生成し、 centerフィールドに代入する。
	// 引数rもradiusフィールドに代入する。
	public Circle(int x, int y, int r) {
		this.center = new Point(x, y);
		this.radius = r;
	}
	
	// 以下のようなメッセージを表示する。
	// 出力例："[円を描画 ] 中心点(100,100)から半径 20"
	public void draw() {
		System.out.println("[円を描画]中心点(100,100)から半径20");
	}
	
	// 半径を使い、以下の計算式で算出した結果を返す
	// 半径 * 2 * 円周率
	// 円周率 ...Math.PIフィールド
	public double getPerimeter() {
		double result = radius * 2 * Math.PI;
		
		return result;
	}

}
