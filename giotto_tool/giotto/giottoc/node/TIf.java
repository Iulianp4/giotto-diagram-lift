/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class TIf extends Token
{
    public TIf()
    {
        super.setText("if");
    }

    public TIf(int line, int pos)
    {
        super.setText("if");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TIf(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIf(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TIf text.");
    }
}
