/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class ATypeDeclaration extends PTypeDeclaration
{
    private TIdent _typeName_;
    private TIs _is_;
    private PQualident _externalTypeName_;
    private TSemicolon _semicolon_;

    public ATypeDeclaration()
    {
    }

    public ATypeDeclaration(
        TIdent _typeName_,
        TIs _is_,
        PQualident _externalTypeName_,
        TSemicolon _semicolon_)
    {
        setTypeName(_typeName_);

        setIs(_is_);

        setExternalTypeName(_externalTypeName_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ATypeDeclaration(
            (TIdent) cloneNode(_typeName_),
            (TIs) cloneNode(_is_),
            (PQualident) cloneNode(_externalTypeName_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypeDeclaration(this);
    }

    public TIdent getTypeName()
    {
        return _typeName_;
    }

    public void setTypeName(TIdent node)
    {
        if (_typeName_ != null)
        {
            _typeName_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _typeName_ = node;
    }

    public TIs getIs()
    {
        return _is_;
    }

    public void setIs(TIs node)
    {
        if (_is_ != null)
        {
            _is_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _is_ = node;
    }

    public PQualident getExternalTypeName()
    {
        return _externalTypeName_;
    }

    public void setExternalTypeName(PQualident node)
    {
        if (_externalTypeName_ != null)
        {
            _externalTypeName_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _externalTypeName_ = node;
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

    public String toString()
    {
        return ""
            + toString(_typeName_)
            + toString(_is_)
            + toString(_externalTypeName_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if (_typeName_ == child)
        {
            _typeName_ = null;
            return;
        }

        if (_is_ == child)
        {
            _is_ = null;
            return;
        }

        if (_externalTypeName_ == child)
        {
            _externalTypeName_ = null;
            return;
        }

        if (_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_typeName_ == oldChild)
        {
            setTypeName((TIdent) newChild);
            return;
        }

        if (_is_ == oldChild)
        {
            setIs((TIs) newChild);
            return;
        }

        if (_externalTypeName_ == oldChild)
        {
            setExternalTypeName((PQualident) newChild);
            return;
        }

        if (_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
