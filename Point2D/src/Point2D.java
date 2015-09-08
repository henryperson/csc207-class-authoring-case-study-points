
public class Point2D {
	public int x;
	public int y;
	
	public Point2D (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D () {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D add(int dx, int dy) {
		return new Point2D(dx+this.x, dy+this.y);
	}
	
	public void translate(Point2D point) {
		this.x += point.x;
		this.y += point.y;
	}

	public int distance(int x, int y) {
		int xDis = x - this.x;
		int yDis = y - this.y;
		return (int) Math.sqrt(Math.pow(xDis, 2) + Math.pow(yDis, 2));
	}
	
	public String toString() {
		return "\"(" + this.x + ", " + this.y + ")\"";
	}
	
	public static void main(String[] args) {
		

	} 

}