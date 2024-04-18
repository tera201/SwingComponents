package org.tera201.chart.data;

import java.util.List;

public interface ChartDataInfo2D<R, C> {

    public Number getMinValue();

    public Number getMaxValues();

    public List<R> getRowKeys();

    public List<C> getColumnKeys();
}
