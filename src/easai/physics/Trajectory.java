package easai.physics;
// Trajectory.java  -- Trajectory is a Java application that draws parabolic trajectory of an object that is thrown out.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue May  6 20:30:40 2014
// Keywords: 

// This file is not part of GNU Emacs.

// Trajectory.java is free software; you can redistribute it and/or modify
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
import javax.swing.JFrame;

public class Trajectory extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TrajectoryPanel panel = new TrajectoryPanel();

	Trajectory() {
		getContentPane().add(panel);

		setSize(500, 500);
		setTitle("Trajectory");
		setVisible(true);
	}

	public static void main(String args[]) {
		new Trajectory();
	}
}

// Trajectory.java ends here
