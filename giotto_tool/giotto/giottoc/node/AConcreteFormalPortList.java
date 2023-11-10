/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class AConcreteFormalPortList extends PFormalPortList
{
    private PFormalPort _formalPort_;
    private final LinkedList _formalPortTail_ = new TypedLinkedList(new FormalPortTail_Cast());

    public AConcreteFormalPortList()
    {
    }

    public AConcreteFormalPortList(
        PFormalPort _formalPort_,
        List _formalPortTail_)
    {
        setFormalPort(_formalPort_);

        {
            this._formalPortTail_.clear();
            this._formalPortTail_.addAll(_formalPortTail_);
        }

    }

    public AConcreteFormalPortList(
        PFormalPort _formalPort_,
        XPFormalPortTail _formalPortTail_)
    {
        setFormalPort(_formalPort_);

        if (_formalPortTail_ != null)
        {
            while (_formalPortTail_ instanceof X1PFormalPortTail)
            {
                this._formalPortTail_.addFirst(((X1PFormalPortTail) _formalPortTail_).getPFormalPortTail());
                _formalPortTail_ = ((X1PFormalPortTail) _formalPortTail_).getXPFormalPortTail();
            }
            this._formalPortTail_.addFirst(((X2PFormalPortTail) _formalPortTail_).getPFormalPortTail());
        }

    }
    public Object clone()
    {
        return new AConcreteFormalPortList(
            (PFormalPort) cloneNode(_formalPort_),
            cloneList(_formalPortTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConcreteFormalPortList(this);
    }

    public PFormalPort getFormalPort()
    {
        return _formalPort_;
    }

    public void setFormalPort(PFormalPort node)
    {
        if (_formalPort_ != null)
        {
            _formalPort_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _formalPort_ = node;
    }

    public LinkedList getFormalPortTail()
    {
        return _formalPortTail_;
    }

    public void setFormalPortTail(List list)
    {
        _formalPortTail_.clear();
        _formalPortTail_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_formalPort_)
            + toString(_formalPortTail_);
    }

    void removeChild(Node child)
    {
        if (_formalPort_ == child)
        {
            _formalPort_ = null;
            return;
        }

        if (_formalPortTail_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_formalPort_ == oldChild)
        {
            setFormalPort((PFormalPort) newChild);
            return;
        }

        for (ListIterator i = _formalPortTail_.listIterator(); i.hasNext();)
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

    private class FormalPortTail_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PFormalPortTail node = (PFormalPortTail) o;

            if ((node.parent() != null) &&
                (node.parent() != AConcreteFormalPortList.this))
            {
                node.parent().removeChild(node);
            }

            if ((node.parent() == null) ||
                (node.parent() != AConcreteFormalPortList.this))
            {
                node.parent(AConcreteFormalPortList.this);
            }

            return node;
        }
    }
}
