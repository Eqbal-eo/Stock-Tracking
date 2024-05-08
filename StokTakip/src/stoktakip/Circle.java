/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stoktakip;

import java.awt.Graphics;

/**
 *
 * @author ikbal
 */
public class Circle {
     int x;
  int y;
  int radius;

  public Circle(int x, int y, int radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public void draw(Graphics g) {
    g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
  }
}
