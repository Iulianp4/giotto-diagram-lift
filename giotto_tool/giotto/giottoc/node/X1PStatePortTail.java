/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PStatePortTail extends XPStatePortTail
{
    private XPStatePortTail _xPStatePortTail_;
    private PStatePortTail _pStatePortTail_;

    public X1PStatePortTail()
    {
    }

    public X1PStatePortTail(
        XPStatePortTail _xPStatePortTail_,
        PStatePortTail _pStatePortTail_)
    {
        setXPStatePortTail(_xPStatePortTail_);
        setPStatePortTail(_pStatePortTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPStatePortTail getXPStatePortTail()
    {
        return _xPStatePortTail_;
    }

    public void setXPStatePortTail(XPStatePortTail node)
    {
        if (_xPStatePortTail_ != null)
        {
            _xPStatePortTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPStatePortTail_ = node;
    }

    public PStatePortTail getPStatePortTail()
    {
        return _pStatePortTail_;
    }

    public void setPStatePortTail(PStatePortTail node)
    {
        if (_pStatePortTail_ != null)
        {
            _pStatePortTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pStatePortTail_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPStatePortTail_ == child)
        {
            _xPStatePortTail_ = null;
        }

        if (_pStatePortTail_ == child)
        {
            _pStatePortTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPStatePortTail_) +
            toString(_pStatePortTail_);
    }
}
