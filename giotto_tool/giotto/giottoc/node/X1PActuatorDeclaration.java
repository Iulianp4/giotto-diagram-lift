/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PActuatorDeclaration extends XPActuatorDeclaration
{
    private XPActuatorDeclaration _xPActuatorDeclaration_;
    private PActuatorDeclaration _pActuatorDeclaration_;

    public X1PActuatorDeclaration()
    {
    }

    public X1PActuatorDeclaration(
        XPActuatorDeclaration _xPActuatorDeclaration_,
        PActuatorDeclaration _pActuatorDeclaration_)
    {
        setXPActuatorDeclaration(_xPActuatorDeclaration_);
        setPActuatorDeclaration(_pActuatorDeclaration_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPActuatorDeclaration getXPActuatorDeclaration()
    {
        return _xPActuatorDeclaration_;
    }

    public void setXPActuatorDeclaration(XPActuatorDeclaration node)
    {
        if (_xPActuatorDeclaration_ != null)
        {
            _xPActuatorDeclaration_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPActuatorDeclaration_ = node;
    }

    public PActuatorDeclaration getPActuatorDeclaration()
    {
        return _pActuatorDeclaration_;
    }

    public void setPActuatorDeclaration(PActuatorDeclaration node)
    {
        if (_pActuatorDeclaration_ != null)
        {
            _pActuatorDeclaration_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pActuatorDeclaration_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPActuatorDeclaration_ == child)
        {
            _xPActuatorDeclaration_ = null;
        }

        if (_pActuatorDeclaration_ == child)
        {
            _pActuatorDeclaration_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPActuatorDeclaration_) +
            toString(_pActuatorDeclaration_);
    }
}