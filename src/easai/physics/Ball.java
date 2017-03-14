package easai.physics;
// Ball.java  -- Ball class for Trajectory.java

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue May  6 20:27:56 2014
// Keywords: 

// This file is not part of GNU Emacs.

// Ball.java is free software; you can redistribute it and/or modify
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
import java.awt.Point;

public class Ball {
	Point pos = new Point(0, 0);
	Color c = Color.blue;
	int sizeX = 40;
	int sizeY = 40;
	int scaleX = 30;
	int scaleY = 5;

	Ball() {
	}

	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(pos.x, pos.y, sizeX, sizeY);
	}

	public void move(int t) {
		pos.x = t * scaleX;
		pos.y = (t - 7) * (t - 7) * scaleY;
	}
}