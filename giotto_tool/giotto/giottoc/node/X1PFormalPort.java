/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PFormalPort extends XPFormalPort
{
    private XPFormalPort _xPFormalPort_;
    private PFormalPort _pFormalPort_;

    public X1PFormalPort()
    {
    }

    public X1PFormalPort(
        XPFormalPort _xPFormalPort_,
        PFormalPort _pFormalPort_)
    {
        setXPFormalPort(_xPFormalPort_);
        setPFormalPort(_pFormalPort_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPFormalPort getXPFormalPort()
    {
        return _xPFormalPort_;
    }

    public void setXPFormalPort(XPFormalPort node)
    {
        if (_xPFormalPort_ != null)
        {
            _xPFormalPort_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPFormalPort_ = node;
    }

    public PFormalPort getPFormalPort()
    {
        return _pFormalPort_;
    }

    public void setPFormalPort(PFormalPort node)
    {
        if (_pFormalPort_ != null)
        {
            _pFormalPort_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pFormalPort_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPFormalPort_ == child)
        {
            _xPFormalPort_ = null;
        }

        if (_pFormalPort_ == child)
        {
            _pFormalPort_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPFormalPort_) +
            toString(_pFormalPort_);
    }
}