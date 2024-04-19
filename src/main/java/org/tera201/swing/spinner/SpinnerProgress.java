package org.tera201.swing.spinner;

import javax.swing.*;

public class SpinnerProgress extends JProgressBar {

    private Icon icon;

    private int verticalAlignment = CENTER;
    private int horizontalAlignment = CENTER;

    private int verticalTextPosition = CENTER;
    private int horizontalTextPosition = TRAILING;

    private int iconTextGap = 4;
    private int space = 10;


    public SpinnerProgress() {
        this(null, 10, null);
    }

    public SpinnerProgress(Icon icon) {
        this(icon, 10, null);
    }

    public SpinnerProgress(int space, Integer thickness) {
        init(thickness);
        this.space = space;
    }

    public SpinnerProgress(Icon icon, int space, Integer thickness) {
        init(thickness);
        this.icon = icon;
        this.space = space;
    }


    @Override
    public void updateUI() {
        setUI(new SpinnerProgressUI());
    }

    private void init(Integer thickness) {
        if ((thickness != null)) {
            setUI(new SpinnerProgressUI(thickness));
        } else {
            setUI(new SpinnerProgressUI());
        }
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
        repaint();
        revalidate();
    }

    public int getVerticalAlignment() {
        return verticalAlignment;
    }

    public void setVerticalAlignment(int alignment) {
        if (this.verticalAlignment != alignment) {
            this.verticalAlignment = alignment;
            revalidate();
        }
    }

    public int getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public void setHorizontalAlignment(int alignment) {
        if (this.horizontalAlignment != alignment) {
            this.horizontalAlignment = alignment;
            revalidate();
        }
    }

    public int getVerticalTextPosition() {
        return verticalTextPosition;
    }

    public void setVerticalTextPosition(int textPosition) {
        if (this.verticalTextPosition != textPosition) {
            this.verticalTextPosition = textPosition;
            revalidate();
        }
    }

    public int getHorizontalTextPosition() {
        return horizontalTextPosition;
    }


    public void setHorizontalTextPosition(int textPosition) {
        if (this.horizontalTextPosition != textPosition) {
            this.horizontalTextPosition = textPosition;
            revalidate();
        }
    }

    public int getIconTextGap() {
        return iconTextGap;
    }

    public void setIconTextGap(int iconTextGap) {
        if (this.iconTextGap != iconTextGap) {
            this.iconTextGap = iconTextGap;
            revalidate();
        }
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        if (this.space != space) {
            this.space = space;
            revalidate();
        }
    }
}
