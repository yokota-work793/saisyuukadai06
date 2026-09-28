package 実装力チェックテスト06;

public class Rectangle extends Polygon {
	
	protected Point p;
	protected int width;
	protected int height;
	
	// 第1引数と第 2引数で受け取ったデータを用いて、 1つのPointオブジェクトを生成し、 pフィールドに代入する。
	// 第3引数と第 4引数をそれぞれ widthフィールド、 heightフィールドに代入する。
	// スーパークラス内で定義されている angleフィールドに 4を代入する。
	public Rectangle(int x, int y, int width, int height) {
		this.p = new Point(x, y);
		this.width = width;
		this.height = height;
		this.angle = 4;
	}
	
	// 以下のようなメッセージを表示する。
	// 出力例："[長方形(矩形)を描画] 点(0,0)を基準として幅 100、高さ50の長方形"
	public void draw() {
		System.out.println("[長方形(矩形)を描画]点(0,0)を基準として幅100、高さ50の長方形");
	}
	
	// 横幅と縦幅を使い、以下の計算式で算出した結果を返す。
	// ( width + height ) * 2
	public double getPerimeter() {
		double result = (width + height) * 2;
		return result;
	}

}
