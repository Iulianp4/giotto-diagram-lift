/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class TPush extends Token
{
    public TPush()
    {
        super.setText("push");
    }

    public TPush(int line, int pos)
    {
        super.setText("push");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TPush(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPush(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPush text.");
    }
}