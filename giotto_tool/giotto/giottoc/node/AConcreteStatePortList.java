/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class AConcreteStatePortList extends PStatePortList
{
    private PStatePort _statePort_;
    private final LinkedList _statePortTail_ = new TypedLinkedList(new StatePortTail_Cast());

    public AConcreteStatePortList()
    {
    }

    public AConcreteStatePortList(
        PStatePort _statePort_,
        List _statePortTail_)
    {
        setStatePort(_statePort_);

        {
            this._statePortTail_.clear();
            this._statePortTail_.addAll(_statePortTail_);
        }

    }

    public AConcreteStatePortList(
        PStatePort _statePort_,
        XPStatePortTail _statePortTail_)
    {
        setStatePort(_statePort_);

        if (_statePortTail_ != null)
        {
            while (_statePortTail_ instanceof X1PStatePortTail)
            {
                this._statePortTail_.addFirst(((X1PStatePortTail) _statePortTail_).getPStatePortTail());
                _statePortTail_ = ((X1PStatePortTail) _statePortTail_).getXPStatePortTail();
            }
            this._statePortTail_.addFirst(((X2PStatePortTail) _statePortTail_).getPStatePortTail());
        }

    }
    public Object clone()
    {
        return new AConcreteStatePortList(
            (PStatePort) cloneNode(_statePort_),
            cloneList(_statePortTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConcreteStatePortList(this);
    }

    public PStatePort getStatePort()
    {
        return _statePort_;
    }

    public void setStatePort(PStatePort node)
    {
        if (_statePort_ != null)
        {
            _statePort_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _statePort_ = node;
    }

    public LinkedList getStatePortTail()
    {
        return _statePortTail_;
    }

    public void setStatePortTail(List list)
    {
        _statePortTail_.clear();
        _statePortTail_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_statePort_)
            + toString(_statePortTail_);
    }

    void removeChild(Node child)
    {
        if (_statePort_ == child)
        {
            _statePort_ = null;
            return;
        }

        if (_statePortTail_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_statePort_ == oldChild)
        {
            setStatePort((PStatePort) newChild);
            return;
        }

        for (ListIterator i = _statePortTail_.listIterator(); i.hasNext();)
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

    private class StatePortTail_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PStatePortTail node = (PStatePortTail) o;

            if ((node.parent() != null) &&
                (node.parent() != AConcreteStatePortList.this))
            {
                node.parent().removeChild(node);
            }

            if ((node.parent() == null) ||
                (node.parent() != AConcreteStatePortList.this))
            {
                node.parent(AConcreteStatePortList.this);
            }

            return node;
        }
    }
}
