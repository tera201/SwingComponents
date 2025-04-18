package org.tera201.swing.spinner.render;

import java.awt.*;

public interface SpinnerRender {
    public boolean isDisplayStringAble();

    public boolean isPaintComplete();

    public void paintCompleteIndeterminate(Graphics2D g2, Component component, Rectangle rec, float last, float f, float p);

    public void paintIndeterminate(Graphics2D g2, Component component, Rectangle rec, float f);

    public void paintDeterminate(Graphics2D g2, Component component, Rectangle rec, float p);

    public int getInsets();
    public void setColor(Color color1, Color color2, Color color3);
}
