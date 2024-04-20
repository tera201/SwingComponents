package org.tera201.swing.spinner;

import javax.swing.*;
import java.awt.*;

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
        init(thickness, null, null, null);
        this.space = space;
    }

    public SpinnerProgress(int space, Integer thickness, Color determinate, Color indeterminate, Color completeIndeterminate) {
        init(thickness, determinate, indeterminate, completeIndeterminate);
        this.space = space;
    }

    public SpinnerProgress(Icon icon, int space, Integer thickness) {
        init(thickness, null, null, null);
        this.icon = icon;
        this.space = space;
    }

    public SpinnerProgress(Icon icon, int space, Integer thickness, Color determinate, Color indeterminate, Color completeIndeterminate) {
        init(thickness, determinate, indeterminate, completeIndeterminate);
        this.icon = icon;
        this.space = space;
    }


    @Override
    public void updateUI() {
        setUI(new SpinnerProgressUI());
    }

    private void init(Integer thickness, Color determinate, Color indeterminate, Color completeIndeterminate) {
        if ((thickness != null)) {
            SpinnerProgressUI spinnerProgressUI = new SpinnerProgressUI(thickness, determinate, indeterminate, completeIndeterminate);
            setUI(spinnerProgressUI);
        } else {
            SpinnerProgressUI spinnerProgressUI = new SpinnerProgressUI(determinate, indeterminate, completeIndeterminate);
            setUI(spinnerProgressUI);
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
