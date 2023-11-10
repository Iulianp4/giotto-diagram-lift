/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class AActualPort extends PActualPort
{
    private TIdent _portName_;

    public AActualPort()
    {
    }

    public AActualPort(
        TIdent _portName_)
    {
        setPortName(_portName_);

    }
    public Object clone()
    {
        return new AActualPort(
            (TIdent) cloneNode(_portName_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAActualPort(this);
    }

    public TIdent getPortName()
    {
        return _portName_;
    }

    public void setPortName(TIdent node)
    {
        if (_portName_ != null)
        {
            _portName_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _portName_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_portName_);
    }

    void removeChild(Node child)
    {
        if (_portName_ == child)
        {
            _portName_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_portName_ == oldChild)
        {
            setPortName((TIdent) newChild);
            return;
        }

    }
}
