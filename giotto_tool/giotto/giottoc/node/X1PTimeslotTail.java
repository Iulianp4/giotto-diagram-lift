/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PTimeslotTail extends XPTimeslotTail
{
    private XPTimeslotTail _xPTimeslotTail_;
    private PTimeslotTail _pTimeslotTail_;

    public X1PTimeslotTail()
    {
    }

    public X1PTimeslotTail(
        XPTimeslotTail _xPTimeslotTail_,
        PTimeslotTail _pTimeslotTail_)
    {
        setXPTimeslotTail(_xPTimeslotTail_);
        setPTimeslotTail(_pTimeslotTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPTimeslotTail getXPTimeslotTail()
    {
        return _xPTimeslotTail_;
    }

    public void setXPTimeslotTail(XPTimeslotTail node)
    {
        if (_xPTimeslotTail_ != null)
        {
            _xPTimeslotTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPTimeslotTail_ = node;
    }

    public PTimeslotTail getPTimeslotTail()
    {
        return _pTimeslotTail_;
    }

    public void setPTimeslotTail(PTimeslotTail node)
    {
        if (_pTimeslotTail_ != null)
        {
            _pTimeslotTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pTimeslotTail_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPTimeslotTail_ == child)
        {
            _xPTimeslotTail_ = null;
        }

        if (_pTimeslotTail_ == child)
        {
            _pTimeslotTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPTimeslotTail_) +
            toString(_pTimeslotTail_);
    }
}
