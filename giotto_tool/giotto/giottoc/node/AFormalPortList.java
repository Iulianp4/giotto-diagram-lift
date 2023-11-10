/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class AFormalPortList extends PFormalPortList
{
    private final LinkedList _formalPort_ = new TypedLinkedList(new FormalPort_Cast());

    public AFormalPortList()
    {
    }

    public AFormalPortList(
        List _formalPort_)
    {
        {
            this._formalPort_.clear();
            this._formalPort_.addAll(_formalPort_);
        }

    }

    public AFormalPortList(
        XPFormalPort _formalPort_)
    {
        if (_formalPort_ != null)
        {
            while (_formalPort_ instanceof X1PFormalPort)
            {
                this._formalPort_.addFirst(((X1PFormalPort) _formalPort_).getPFormalPort());
                _formalPort_ = ((X1PFormalPort) _formalPort_).getXPFormalPort();
            }
            this._formalPort_.addFirst(((X2PFormalPort) _formalPort_).getPFormalPort());
        }

    }
    public Object clone()
    {
        return new AFormalPortList(
            cloneList(_formalPort_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormalPortList(this);
    }

    public LinkedList getFormalPort()
    {
        return _formalPort_;
    }

    public void setFormalPort(List list)
    {
        _formalPort_.clear();
        _formalPort_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_formalPort_);
    }

    void removeChild(Node child)
    {
        if (_formalPort_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for (ListIterator i = _formalPort_.listIterator(); i.hasNext();)
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

    private class FormalPort_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PFormalPort node = (PFormalPort) o;

            if ((node.parent() != null) &&
                (node.parent() != AFormalPortList.this))
            {
                node.parent().removeChild(node);
            }

            if ((node.parent() == null) ||
                (node.parent() != AFormalPortList.this))
            {
                node.parent(AFormalPortList.this);
            }

            return node;
        }
    }
}
