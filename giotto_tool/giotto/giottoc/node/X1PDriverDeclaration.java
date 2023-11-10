/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PDriverDeclaration extends XPDriverDeclaration
{
    private XPDriverDeclaration _xPDriverDeclaration_;
    private PDriverDeclaration _pDriverDeclaration_;

    public X1PDriverDeclaration()
    {
    }

    public X1PDriverDeclaration(
        XPDriverDeclaration _xPDriverDeclaration_,
        PDriverDeclaration _pDriverDeclaration_)
    {
        setXPDriverDeclaration(_xPDriverDeclaration_);
        setPDriverDeclaration(_pDriverDeclaration_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPDriverDeclaration getXPDriverDeclaration()
    {
        return _xPDriverDeclaration_;
    }

    public void setXPDriverDeclaration(XPDriverDeclaration node)
    {
        if (_xPDriverDeclaration_ != null)
        {
            _xPDriverDeclaration_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPDriverDeclaration_ = node;
    }

    public PDriverDeclaration getPDriverDeclaration()
    {
        return _pDriverDeclaration_;
    }

    public void setPDriverDeclaration(PDriverDeclaration node)
    {
        if (_pDriverDeclaration_ != null)
        {
            _pDriverDeclaration_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pDriverDeclaration_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPDriverDeclaration_ == child)
        {
            _xPDriverDeclaration_ = null;
        }

        if (_pDriverDeclaration_ == child)
        {
            _pDriverDeclaration_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPDriverDeclaration_) +
            toString(_pDriverDeclaration_);
    }
}
