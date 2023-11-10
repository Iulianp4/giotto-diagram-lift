/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class ANetworkNameIdent extends PNetworkNameIdent
{
    private TIdent _ident_;

    public ANetworkNameIdent()
    {
    }

    public ANetworkNameIdent(
        TIdent _ident_)
    {
        setIdent(_ident_);

    }
    public Object clone()
    {
        return new ANetworkNameIdent(
            (TIdent) cloneNode(_ident_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANetworkNameIdent(this);
    }

    public TIdent getIdent()
    {
        return _ident_;
    }

    public void setIdent(TIdent node)
    {
        if (_ident_ != null)
        {
            _ident_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ident_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_ident_);
    }

    void removeChild(Node child)
    {
        if (_ident_ == child)
        {
            _ident_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_ident_ == oldChild)
        {
            setIdent((TIdent) newChild);
            return;
        }

    }
}