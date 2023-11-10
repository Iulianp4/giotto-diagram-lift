/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class TFrom extends Token
{
    public TFrom()
    {
        super.setText("from");
    }

    public TFrom(int line, int pos)
    {
        super.setText("from");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TFrom(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFrom(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TFrom text.");
    }
}
