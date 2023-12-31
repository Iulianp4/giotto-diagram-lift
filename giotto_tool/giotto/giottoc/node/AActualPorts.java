/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class AActualPorts extends PActualPorts
{
    private TLPar _lPar_;
    private PActualPortList _actualPortList_;
    private TRPar _rPar_;

    public AActualPorts()
    {
    }

    public AActualPorts(
        TLPar _lPar_,
        PActualPortList _actualPortList_,
        TRPar _rPar_)
    {
        setLPar(_lPar_);

        setActualPortList(_actualPortList_);

        setRPar(_rPar_);

    }
    public Object clone()
    {
        return new AActualPorts(
            (TLPar) cloneNode(_lPar_),
            (PActualPortList) cloneNode(_actualPortList_),
            (TRPar) cloneNode(_rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAActualPorts(this);
    }

    public TLPar getLPar()
    {
        return _lPar_;
    }

    public void setLPar(TLPar node)
    {
        if (_lPar_ != null)
        {
            _lPar_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lPar_ = node;
    }

    public PActualPortList getActualPortList()
    {
        return _actualPortList_;
    }

    public void setActualPortList(PActualPortList node)
    {
        if (_actualPortList_ != null)
        {
            _actualPortList_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _actualPortList_ = node;
    }

    public TRPar getRPar()
    {
        return _rPar_;
    }

    public void setRPar(TRPar node)
    {
        if (_rPar_ != null)
        {
            _rPar_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rPar_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lPar_)
            + toString(_actualPortList_)
            + toString(_rPar_);
    }

    void removeChild(Node child)
    {
        if (_lPar_ == child)
        {
            _lPar_ = null;
            return;
        }

        if (_actualPortList_ == child)
        {
            _actualPortList_ = null;
            return;
        }

        if (_rPar_ == child)
        {
            _rPar_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if (_actualPortList_ == oldChild)
        {
            setActualPortList((PActualPortList) newChild);
            return;
        }

        if (_rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

    }
}
