/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PHostTail extends XPHostTail
{
    private XPHostTail _xPHostTail_;
    private PHostTail _pHostTail_;

    public X1PHostTail()
    {
    }

    public X1PHostTail(
        XPHostTail _xPHostTail_,
        PHostTail _pHostTail_)
    {
        setXPHostTail(_xPHostTail_);
        setPHostTail(_pHostTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPHostTail getXPHostTail()
    {
        return _xPHostTail_;
    }

    public void setXPHostTail(XPHostTail node)
    {
        if (_xPHostTail_ != null)
        {
            _xPHostTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPHostTail_ = node;
    }

    public PHostTail getPHostTail()
    {
        return _pHostTail_;
    }

    public void setPHostTail(PHostTail node)
    {
        if (_pHostTail_ != null)
        {
            _pHostTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pHostTail_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPHostTail_ == child)
        {
            _xPHostTail_ = null;
        }

        if (_pHostTail_ == child)
        {
            _pHostTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPHostTail_) +
            toString(_pHostTail_);
    }
}
