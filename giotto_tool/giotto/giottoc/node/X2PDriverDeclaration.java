/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;


public final class X2PDriverDeclaration extends XPDriverDeclaration
{
    private PDriverDeclaration _pDriverDeclaration_;

    public X2PDriverDeclaration()
    {
    }

    public X2PDriverDeclaration(
        PDriverDeclaration _pDriverDeclaration_)
    {
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
            toString(_pDriverDeclaration_);
    }
}
