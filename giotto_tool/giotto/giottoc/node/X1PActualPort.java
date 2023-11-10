/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PActualPort extends XPActualPort
{
    private XPActualPort _xPActualPort_;
    private PActualPort _pActualPort_;

    public X1PActualPort()
    {
    }

    public X1PActualPort(
        XPActualPort _xPActualPort_,
        PActualPort _pActualPort_)
    {
        setXPActualPort(_xPActualPort_);
        setPActualPort(_pActualPort_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPActualPort getXPActualPort()
    {
        return _xPActualPort_;
    }

    public void setXPActualPort(XPActualPort node)
    {
        if (_xPActualPort_ != null)
        {
            _xPActualPort_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPActualPort_ = node;
    }

    public PActualPort getPActualPort()
    {
        return _pActualPort_;
    }

    public void setPActualPort(PActualPort node)
    {
        if (_pActualPort_ != null)
        {
            _pActualPort_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pActualPort_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPActualPort_ == child)
        {
            _xPActualPort_ = null;
        }

        if (_pActualPort_ == child)
        {
            _pActualPort_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPActualPort_) +
            toString(_pActualPort_);
    }
}
