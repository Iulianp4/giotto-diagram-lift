/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X2PStatePortTail extends XPStatePortTail
{
    private PStatePortTail _pStatePortTail_;

    public X2PStatePortTail()
    {
    }

    public X2PStatePortTail(
        PStatePortTail _pStatePortTail_)
    {
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
            toString(_pStatePortTail_);
    }
}
