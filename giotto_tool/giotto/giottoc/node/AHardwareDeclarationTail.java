/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class AHardwareDeclarationTail extends PHardwareDeclarationTail
{
    private TSemicolon _semicolon_;
    private PHardwareDeclaration _hardwareDeclaration_;

    public AHardwareDeclarationTail()
    {
    }

    public AHardwareDeclarationTail(
        TSemicolon _semicolon_,
        PHardwareDeclaration _hardwareDeclaration_)
    {
        setSemicolon(_semicolon_);

        setHardwareDeclaration(_hardwareDeclaration_);

    }
    public Object clone()
    {
        return new AHardwareDeclarationTail(
            (TSemicolon) cloneNode(_semicolon_),
            (PHardwareDeclaration) cloneNode(_hardwareDeclaration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHardwareDeclarationTail(this);
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if (_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public PHardwareDeclaration getHardwareDeclaration()
    {
        return _hardwareDeclaration_;
    }

    public void setHardwareDeclaration(PHardwareDeclaration node)
    {
        if (_hardwareDeclaration_ != null)
        {
            _hardwareDeclaration_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _hardwareDeclaration_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_semicolon_)
            + toString(_hardwareDeclaration_);
    }

    void removeChild(Node child)
    {
        if (_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

        if (_hardwareDeclaration_ == child)
        {
            _hardwareDeclaration_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        if (_hardwareDeclaration_ == oldChild)
        {
            setHardwareDeclaration((PHardwareDeclaration) newChild);
            return;
        }

    }
}
