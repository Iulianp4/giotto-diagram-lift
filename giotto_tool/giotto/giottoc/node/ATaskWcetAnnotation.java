/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class ATaskWcetAnnotation extends PTaskWcetAnnotation
{
    private TLBracket _lBracket_;
    private TWcet _wcet_;
    private TNumber _time_;
    private TRBracket _rBracket_;

    public ATaskWcetAnnotation()
    {
    }

    public ATaskWcetAnnotation(
        TLBracket _lBracket_,
        TWcet _wcet_,
        TNumber _time_,
        TRBracket _rBracket_)
    {
        setLBracket(_lBracket_);

        setWcet(_wcet_);

        setTime(_time_);

        setRBracket(_rBracket_);

    }
    public Object clone()
    {
        return new ATaskWcetAnnotation(
            (TLBracket) cloneNode(_lBracket_),
            (TWcet) cloneNode(_wcet_),
            (TNumber) cloneNode(_time_),
            (TRBracket) cloneNode(_rBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATaskWcetAnnotation(this);
    }

    public TLBracket getLBracket()
    {
        return _lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if (_lBracket_ != null)
        {
            _lBracket_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBracket_ = node;
    }

    public TWcet getWcet()
    {
        return _wcet_;
    }

    public void setWcet(TWcet node)
    {
        if (_wcet_ != null)
        {
            _wcet_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _wcet_ = node;
    }

    public TNumber getTime()
    {
        return _time_;
    }

    public void setTime(TNumber node)
    {
        if (_time_ != null)
        {
            _time_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _time_ = node;
    }

    public TRBracket getRBracket()
    {
        return _rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if (_rBracket_ != null)
        {
            _rBracket_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBracket_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lBracket_)
            + toString(_wcet_)
            + toString(_time_)
            + toString(_rBracket_);
    }

    void removeChild(Node child)
    {
        if (_lBracket_ == child)
        {
            _lBracket_ = null;
            return;
        }

        if (_wcet_ == child)
        {
            _wcet_ = null;
            return;
        }

        if (_time_ == child)
        {
            _time_ = null;
            return;
        }

        if (_rBracket_ == child)
        {
            _rBracket_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if (_wcet_ == oldChild)
        {
            setWcet((TWcet) newChild);
            return;
        }

        if (_time_ == oldChild)
        {
            setTime((TNumber) newChild);
            return;
        }

        if (_rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

    }
}
