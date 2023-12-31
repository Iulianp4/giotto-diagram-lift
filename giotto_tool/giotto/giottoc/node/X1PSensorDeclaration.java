/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X1PSensorDeclaration extends XPSensorDeclaration
{
    private XPSensorDeclaration _xPSensorDeclaration_;
    private PSensorDeclaration _pSensorDeclaration_;

    public X1PSensorDeclaration()
    {
    }

    public X1PSensorDeclaration(
        XPSensorDeclaration _xPSensorDeclaration_,
        PSensorDeclaration _pSensorDeclaration_)
    {
        setXPSensorDeclaration(_xPSensorDeclaration_);
        setPSensorDeclaration(_pSensorDeclaration_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPSensorDeclaration getXPSensorDeclaration()
    {
        return _xPSensorDeclaration_;
    }

    public void setXPSensorDeclaration(XPSensorDeclaration node)
    {
        if (_xPSensorDeclaration_ != null)
        {
            _xPSensorDeclaration_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPSensorDeclaration_ = node;
    }

    public PSensorDeclaration getPSensorDeclaration()
    {
        return _pSensorDeclaration_;
    }

    public void setPSensorDeclaration(PSensorDeclaration node)
    {
        if (_pSensorDeclaration_ != null)
        {
            _pSensorDeclaration_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pSensorDeclaration_ = node;
    }

    void removeChild(Node child)
    {
        if (_xPSensorDeclaration_ == child)
        {
            _xPSensorDeclaration_ = null;
        }

        if (_pSensorDeclaration_ == child)
        {
            _pSensorDeclaration_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPSensorDeclaration_) +
            toString(_pSensorDeclaration_);
    }
}
