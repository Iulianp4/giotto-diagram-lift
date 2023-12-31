/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class AActualScopedParameterTail extends PActualScopedParameterTail
{
    private TComma _comma_;
    private PActualScopedParameter _actualScopedParameter_;

    public AActualScopedParameterTail()
    {
    }

    public AActualScopedParameterTail(
        TComma _comma_,
        PActualScopedParameter _actualScopedParameter_)
    {
        setComma(_comma_);

        setActualScopedParameter(_actualScopedParameter_);

    }
    public Object clone()
    {
        return new AActualScopedParameterTail(
            (TComma) cloneNode(_comma_),
            (PActualScopedParameter) cloneNode(_actualScopedParameter_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAActualScopedParameterTail(this);
    }

    public TComma getComma()
    {
        return _comma_;
    }

    public void setComma(TComma node)
    {
        if (_comma_ != null)
        {
            _comma_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comma_ = node;
    }

    public PActualScopedParameter getActualScopedParameter()
    {
        return _actualScopedParameter_;
    }

    public void setActualScopedParameter(PActualScopedParameter node)
    {
        if (_actualScopedParameter_ != null)
        {
            _actualScopedParameter_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _actualScopedParameter_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_comma_)
            + toString(_actualScopedParameter_);
    }

    void removeChild(Node child)
    {
        if (_comma_ == child)
        {
            _comma_ = null;
            return;
        }

        if (_actualScopedParameter_ == child)
        {
            _actualScopedParameter_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if (_actualScopedParameter_ == oldChild)
        {
            setActualScopedParameter((PActualScopedParameter) newChild);
            return;
        }

    }
}
