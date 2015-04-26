import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Test extends JApplet implements Runnable {
	private int x, w, h;
	private Thread t;

	public void init() {
		x = 0;
		w = getWidth();
		h = getHeight();
		t = new Thread(this);
		t.start();
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setBackground(Color.BLACK);
		g2.setColor(Color.RED);
		g.clearRect(0, 0, w, h);
		g.fillOval(x, 10, 30, 30);
	}

	public void run() {
		while (t != null) {
			try {
				Thread.sleep(10);
				x++;
				x = w <= x ? 0 : x;
				repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
