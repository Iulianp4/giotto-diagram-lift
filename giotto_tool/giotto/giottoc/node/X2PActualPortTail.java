/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X2PActualPortTail extends XPActualPortTail
{
    private PActualPortTail _pActualPortTail_;

    public X2PActualPortTail()
    {
    }

    public X2PActualPortTail(
        PActualPortTail _pActualPortTail_)
    {
        setPActualPortTail(_pActualPortTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PActualPortTail getPActualPortTail()
    {
        return _pActualPortTail_;
    }

    public void setPActualPortTail(PActualPortTail node)
    {
        if (_pActualPortTail_ != null)
        {
            _pActualPortTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pActualPortTail_ = node;
    }

    void removeChild(Node child)
    {
        if (_pActualPortTail_ == child)
        {
            _pActualPortTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pActualPortTail_);
    }
}
