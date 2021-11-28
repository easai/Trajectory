package easai.physics;
// TrajectoryPanel.java  -- TrajectoryPane is a part of Trajectory.java application.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue May  6 20:31:05 2014
// Keywords: 

// This file is not part of GNU Emacs.

// TrajectoryPanel.java is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2, or (at your option)
// any later version.

// This software is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program; see the file COPYING.  If not, write to the
// Free Software Foundation, Inc., 59 Temple Place - Suite 330,
// Boston, MA 02111-1307, USA.

// Commentary:
//
//
//

// Code:
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TrajectoryPanel extends JPanel implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread thread = new Thread(this);
	Ball ball = new Ball();
	int t;

	TrajectoryPanel() {
		thread.start();
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(new Color(0xff, 0xff, 0xff, 0x50));
		g.fillRect(0, 0, getWidth(), getHeight());
		ball.paint(g);
	}

	@Override
	public void run() {
		Thread me = Thread.currentThread();
		while (me == thread) {
			if (30 < t)
				t = 0;
			t++;
			ball.move(t);
			repaint();
			try {
				Thread.sleep(150);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}