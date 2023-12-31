/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X2PModeSwitch extends XPModeSwitch
{
    private PModeSwitch _pModeSwitch_;

    public X2PModeSwitch()
    {
    }

    public X2PModeSwitch(
        PModeSwitch _pModeSwitch_)
    {
        setPModeSwitch(_pModeSwitch_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PModeSwitch getPModeSwitch()
    {
        return _pModeSwitch_;
    }

    public void setPModeSwitch(PModeSwitch node)
    {
        if (_pModeSwitch_ != null)
        {
            _pModeSwitch_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pModeSwitch_ = node;
    }

    void removeChild(Node child)
    {
        if (_pModeSwitch_ == child)
        {
            _pModeSwitch_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pModeSwitch_);
    }
}
