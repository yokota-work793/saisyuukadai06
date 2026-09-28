package 実装力チェックテスト06;

public abstract class Polygon extends Shape {
	
	protected int angle;
	
	// 図形描画機能の定義
	public abstract void draw();
	
	// 長さ測定機能の定義
	public abstract double getPerimeter();
	
	// angleフィールドを使い、内角の和を算出する
	// 例）n角形の場合 (n - 2) * 180
	public int getInternalAngle() {
		return (angle - 2) * 180;
	}

}
