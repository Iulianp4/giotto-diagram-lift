/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PHardwareDeclarationTail extends XPHardwareDeclarationTail
{
    private XPHardwareDeclarationTail _xPHardwareDeclarationTail_;
    private PHardwareDeclarationTail _pHardwareDeclarationTail_;

    public X1PHardwareDeclarationTail()
    {
    }

    public X1PHardwareDeclarationTail(
        XPHardwareDeclarationTail _xPHardwareDeclarationTail_,
        PHardwareDeclarationTail _pHardwareDeclarationTail_)
    {
        setXPHardwareDeclarationTail(_xPHardwareDeclarationTail_);
        setPHardwareDeclarationTail(_pHardwareDeclarationTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPHardwareDeclarationTail getXPHardwareDeclarationTail()
    {
        return _xPHardwareDeclarationTail_;
    }

    public void setXPHardwareDeclarationTail(XPHardwareDeclarationTail node)
    {
        if (_xPHardwareDeclarationTail_ != null)
        {
            _xPHardwareDeclarationTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPHardwareDeclarationTail_ = node;
    }

    public PHardwareDeclarationTail getPHardwareDeclarationTail()
    {
        return _pHardwareDeclarationTail_;
    }

    public void setPHardwareDeclarationTail(PHardwareDeclarationTail node)
    {
        if (_pHardwareDeclarationTail_ != null)
        {
            _pHardwareDeclarationTail_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pHardwareDeclarationTail_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPHardwareDeclarationTail_ == child)
        {
            _xPHardwareDeclarationTail_ = null;
        }

        if (_pHardwareDeclarationTail_ == child)
        {
            _pHardwareDeclarationTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPHardwareDeclarationTail_) +
            toString(_pHardwareDeclarationTail_);
    }
}
