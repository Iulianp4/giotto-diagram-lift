/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class AQualident extends PQualident
{
    private final LinkedList _ident_ = new TypedLinkedList(new Ident_Cast());

    public AQualident()
    {
    }

    public AQualident(
        List _ident_)
    {
        {
            this._ident_.clear();
            this._ident_.addAll(_ident_);
        }

    }

    public AQualident(
        XTIdent _ident_)
    {
        if (_ident_ != null)
        {
            while (_ident_ instanceof X1TIdent)
            {
                this._ident_.addFirst(((X1TIdent) _ident_).getTIdent());
                _ident_ = ((X1TIdent) _ident_).getXTIdent();
            }
            this._ident_.addFirst(((X2TIdent) _ident_).getTIdent());
        }

    }
    public Object clone()
    {
        return new AQualident(
            cloneList(_ident_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAQualident(this);
    }

    public LinkedList getIdent()
    {
        return _ident_;
    }

    public void setIdent(List list)
    {
        _ident_.clear();
        _ident_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_ident_);
    }

    void removeChild(Node child)
    {
        if (_ident_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for (ListIterator i = _ident_.listIterator(); i.hasNext();)
        {
            if (i.next() == oldChild)
            {
                if (newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Ident_Cast implements Cast
    {
        public Object cast(Object o)
        {
            TIdent node = (TIdent) o;

            if ((node.parent() != null) &&
                (node.parent() != AQualident.this))
            {
                node.parent().removeChild(node);
            }

            if ((node.parent() == null) ||
                (node.parent() != AQualident.this))
            {
                node.parent(AQualident.this);
            }

            return node;
        }
    }
}
