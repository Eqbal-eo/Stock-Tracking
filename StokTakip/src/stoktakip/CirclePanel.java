/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stoktakip;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ikbal
 */
public class CirclePanel extends JPanel {
  private Circle circle;

  public CirclePanel(Circle circle) {
    this.circle = circle;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    circle.draw(g);
  }
}
