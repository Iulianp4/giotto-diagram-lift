/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class TModule extends Token
{
    public TModule()
    {
        super.setText("module");
    }

    public TModule(int line, int pos)
    {
        super.setText("module");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TModule(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTModule(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TModule text.");
    }
}
