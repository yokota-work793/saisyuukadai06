package 実装力チェックテスト06;

public class Point {
	
	private int x;
	private int y;
	
	// x座標、y座標ともに 0で初期化する。
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	// x座標、y座標を受け取りその値で初期化するコンストラクタの定義
	// 第1引数で渡された値を xフィールドに代入する。
	// 第2引数で渡された値を yフィールドに代入する。
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// xフィールドの値を返すメソッド
	public int getX() {
		return x;
	}
	
	// 引数で渡された値をxフィールドにセットするメソッド
	public void setX(int x) {
		this.x = x;
	}
	
	// yフィールドの値を返すメソッド
	public int getY() {
		return y;
	}
	
	// 引数で渡された値をyフィールドにセットするメソッド
	public void setY(int y) {
		this.y = y;
	}
}
