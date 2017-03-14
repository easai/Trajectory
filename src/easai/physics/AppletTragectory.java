package easai.physics;

import javax.swing.JApplet;

public class AppletTragectory extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TrajectoryPanel panel = new TrajectoryPanel();

	public void init() {
		add(panel);
	}

}
