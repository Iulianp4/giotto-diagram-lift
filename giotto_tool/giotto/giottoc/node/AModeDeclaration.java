/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class AModeDeclaration extends PModeDeclaration
{
    private TMode _mode_;
    private TIdent _modeName_;
    private PActualPorts _modePorts_;
    private TPeriod _period_;
    private TNumber _modePeriod_;
    private PNetworkTimeslotAnnotation _modeAnnotation_;
    private TLBrace _lBrace_;
    private final LinkedList _actuatorUpdateList_ = new TypedLinkedList(new ActuatorUpdateList_Cast());
    private PModeConnectionAnnotation _modeConnectionAnnotation_;
    private final LinkedList _modeSwitchList_ = new TypedLinkedList(new ModeSwitchList_Cast());
    private final LinkedList _taskInvocationList_ = new TypedLinkedList(new TaskInvocationList_Cast());
    private TRBrace _rBrace_;

    public AModeDeclaration()
    {
    }

    public AModeDeclaration(
        TMode _mode_,
        TIdent _modeName_,
        PActualPorts _modePorts_,
        TPeriod _period_,
        TNumber _modePeriod_,
        PNetworkTimeslotAnnotation _modeAnnotation_,
        TLBrace _lBrace_,
        List _actuatorUpdateList_,
        PModeConnectionAnnotation _modeConnectionAnnotation_,
        List _modeSwitchList_,
        List _taskInvocationList_,
        TRBrace _rBrace_)
    {
        setMode(_mode_);

        setModeName(_modeName_);

        setModePorts(_modePorts_);

        setPeriod(_period_);

        setModePeriod(_modePeriod_);

        setModeAnnotation(_modeAnnotation_);

        setLBrace(_lBrace_);

        {
            this._actuatorUpdateList_.clear();
            this._actuatorUpdateList_.addAll(_actuatorUpdateList_);
        }

        setModeConnectionAnnotation(_modeConnectionAnnotation_);

        {
            this._modeSwitchList_.clear();
            this._modeSwitchList_.addAll(_modeSwitchList_);
        }

        {
            this._taskInvocationList_.clear();
            this._taskInvocationList_.addAll(_taskInvocationList_);
        }

        setRBrace(_rBrace_);

    }

    public AModeDeclaration(
        TMode _mode_,
        TIdent _modeName_,
        PActualPorts _modePorts_,
        TPeriod _period_,
        TNumber _modePeriod_,
        PNetworkTimeslotAnnotation _modeAnnotation_,
        TLBrace _lBrace_,
        XPActuatorUpdate _actuatorUpdateList_,
        PModeConnectionAnnotation _modeConnectionAnnotation_,
        XPModeSwitch _modeSwitchList_,
        XPTaskInvocation _taskInvocationList_,
        TRBrace _rBrace_)
    {
        setMode(_mode_);

        setModeName(_modeName_);

        setModePorts(_modePorts_);

        setPeriod(_period_);

        setModePeriod(_modePeriod_);

        setModeAnnotation(_modeAnnotation_);

        setLBrace(_lBrace_);

        if (_actuatorUpdateList_ != null)
        {
            while (_actuatorUpdateList_ instanceof X1PActuatorUpdate)
            {
                this._actuatorUpdateList_.addFirst(((X1PActuatorUpdate) _actuatorUpdateList_).getPActuatorUpdate());
                _actuatorUpdateList_ = ((X1PActuatorUpdate) _actuatorUpdateList_).getXPActuatorUpdate();
            }
            this._actuatorUpdateList_.addFirst(((X2PActuatorUpdate) _actuatorUpdateList_).getPActuatorUpdate());
        }

        setModeConnectionAnnotation(_modeConnectionAnnotation_);

        if (_modeSwitchList_ != null)
        {
            while (_modeSwitchList_ instanceof X1PModeSwitch)
            {
                this._modeSwitchList_.addFirst(((X1PModeSwitch) _modeSwitchList_).getPModeSwitch());
                _modeSwitchList_ = ((X1PModeSwitch) _modeSwitchList_).getXPModeSwitch();
            }
            this._modeSwitchList_.addFirst(((X2PModeSwitch) _modeSwitchList_).getPModeSwitch());
        }

        if (_taskInvocationList_ != null)
        {
            while (_taskInvocationList_ instanceof X1PTaskInvocation)
            {
                this._taskInvocationList_.addFirst(((X1PTaskInvocation) _taskInvocationList_).getPTaskInvocation());
                _taskInvocationList_ = ((X1PTaskInvocation) _taskInvocationList_).getXPTaskInvocation();
            }
            this._taskInvocationList_.addFirst(((X2PTaskInvocation) _taskInvocationList_).getPTaskInvocation());
        }

        setRBrace(_rBrace_);

    }
    public Object clone()
    {
        return new AModeDeclaration(
            (TMode) cloneNode(_mode_),
            (TIdent) cloneNode(_modeName_),
            (PActualPorts) cloneNode(_modePorts_),
            (TPeriod) cloneNode(_period_),
            (TNumber) cloneNode(_modePeriod_),
            (PNetworkTimeslotAnnotation) cloneNode(_modeAnnotation_),
            (TLBrace) cloneNode(_lBrace_),
            cloneList(_actuatorUpdateList_),
            (PModeConnectionAnnotation) cloneNode(_modeConnectionAnnotation_),
            cloneList(_modeSwitchList_),
            cloneList(_taskInvocationList_),
            (TRBrace) cloneNode(_rBrace_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModeDeclaration(this);
    }

    public TMode getMode()
    {
        return _mode_;
    }

    public void setMode(TMode node)
    {
        if (_mode_ != null)
        {
            _mode_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _mode_ = node;
    }

    public TIdent getModeName()
    {
        return _modeName_;
    }

    public void setModeName(TIdent node)
    {
        if (_modeName_ != null)
        {
            _modeName_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _modeName_ = node;
    }

    public PActualPorts getModePorts()
    {
        return _modePorts_;
    }

    public void setModePorts(PActualPorts node)
    {
        if (_modePorts_ != null)
        {
            _modePorts_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _modePorts_ = node;
    }

    public TPeriod getPeriod()
    {
        return _period_;
    }

    public void setPeriod(TPeriod node)
    {
        if (_period_ != null)
        {
            _period_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _period_ = node;
    }

    public TNumber getModePeriod()
    {
        return _modePeriod_;
    }

    public void setModePeriod(TNumber node)
    {
        if (_modePeriod_ != null)
        {
            _modePeriod_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _modePeriod_ = node;
    }

    public PNetworkTimeslotAnnotation getModeAnnotation()
    {
        return _modeAnnotation_;
    }

    public void setModeAnnotation(PNetworkTimeslotAnnotation node)
    {
        if (_modeAnnotation_ != null)
        {
            _modeAnnotation_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _modeAnnotation_ = node;
    }

    public TLBrace getLBrace()
    {
        return _lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if (_lBrace_ != null)
        {
            _lBrace_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBrace_ = node;
    }

    public LinkedList getActuatorUpdateList()
    {
        return _actuatorUpdateList_;
    }

    public void setActuatorUpdateList(List list)
    {
        _actuatorUpdateList_.clear();
        _actuatorUpdateList_.addAll(list);
    }

    public PModeConnectionAnnotation getModeConnectionAnnotation()
    {
        return _modeConnectionAnnotation_;
    }

    public void setModeConnectionAnnotation(PModeConnectionAnnotation node)
    {
        if (_modeConnectionAnnotation_ != null)
        {
            _modeConnectionAnnotation_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _modeConnectionAnnotation_ = node;
    }

    public LinkedList getModeSwitchList()
    {
        return _modeSwitchList_;
    }

    public void setModeSwitchList(List list)
    {
        _modeSwitchList_.clear();
        _modeSwitchList_.addAll(list);
    }

    public LinkedList getTaskInvocationList()
    {
        return _taskInvocationList_;
    }

    public void setTaskInvocationList(List list)
    {
        _taskInvocationList_.clear();
        _taskInvocationList_.addAll(list);
    }

    public TRBrace getRBrace()
    {
        return _rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if (_rBrace_ != null)
        {
            _rBrace_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBrace_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_mode_)
            + toString(_modeName_)
            + toString(_modePorts_)
            + toString(_period_)
            + toString(_modePeriod_)
            + toString(_modeAnnotation_)
            + toString(_lBrace_)
            + toString(_actuatorUpdateList_)
            + toString(_modeConnectionAnnotation_)
            + toString(_modeSwitchList_)
            + toString(_taskInvocationList_)
            + toString(_rBrace_);
    }

    void removeChild(Node child)
    {
        if (_mode_ == child)
        {
            _mode_ = null;
            return;
        }

        if (_modeName_ == child)
        {
            _modeName_ = null;
            return;
        }

        if (_modePorts_ == child)
        {
            _modePorts_ = null;
            return;
        }

        if (_period_ == child)
        {
            _period_ = null;
            return;
        }

        if (_modePeriod_ == child)
        {
            _modePeriod_ = null;
            return;
        }

        if (_modeAnnotation_ == child)
        {
            _modeAnnotation_ = null;
            return;
        }

        if (_lBrace_ == child)
        {
            _lBrace_ = null;
            return;
        }

        if (_actuatorUpdateList_.remove(child))
        {
            return;
        }

        if (_modeConnectionAnnotation_ == child)
        {
            _modeConnectionAnnotation_ = null;
            return;
        }

        if (_modeSwitchList_.remove(child))
        {
            return;
        }

        if (_taskInvocationList_.remove(child))
        {
            return;
        }

        if (_rBrace_ == child)
        {
            _rBrace_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_mode_ == oldChild)
        {
            setMode((TMode) newChild);
            return;
        }

        if (_modeName_ == oldChild)
        {
            setModeName((TIdent) newChild);
            return;
        }

        if (_modePorts_ == oldChild)
        {
            setModePorts((PActualPorts) newChild);
            return;
        }

        if (_period_ == oldChild)
        {
            setPeriod((TPeriod) newChild);
            return;
        }

        if (_modePeriod_ == oldChild)
        {
            setModePeriod((TNumber) newChild);
            return;
        }

        if (_modeAnnotation_ == oldChild)
        {
            setModeAnnotation((PNetworkTimeslotAnnotation) newChild);
            return;
        }

        if (_lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        for (ListIterator i = _actuatorUpdateList_.listIterator(); i.hasNext();)
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

        if (_modeConnectionAnnotation_ == oldChild)
        {
            setModeConnectionAnnotation((PModeConnectionAnnotation) newChild);
            return;
        }

        for (ListIterator i = _modeSwitchList_.listIterator(); i.hasNext();)
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

        for (ListIterator i = _taskInvocationList_.listIterator(); i.hasNext();)
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

        if (_rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

    }

    private class ActuatorUpdateList_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PActuatorUpdate node = (PActuatorUpdate) o;

            if ((node.parent() != null) &&
                (node.parent() != AModeDeclaration.this))
            {
                node.parent().removeChild(node);
            }

            if ((node.parent() == null) ||
                (node.parent() != AModeDeclaration.this))
            {
                node.parent(AModeDeclaration.this);
            }

            return node;
        }
    }

    private class ModeSwitchList_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PModeSwitch node = (PModeSwitch) o;

            if ((node.parent() != null) &&
                (node.parent() != AModeDeclaration.this))
            {
                node.parent().removeChild(node);
            }

            if ((node.parent() == null) ||
                (node.parent() != AModeDeclaration.this))
            {
                node.parent(AModeDeclaration.this);
            }

            return node;
        }
    }

    private class TaskInvocationList_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PTaskInvocation node = (PTaskInvocation) o;

            if ((node.parent() != null) &&
                (node.parent() != AModeDeclaration.this))
            {
                node.parent().removeChild(node);
            }

            if ((node.parent() == null) ||
                (node.parent() != AModeDeclaration.this))
            {
                node.parent(AModeDeclaration.this);
            }

            return node;
        }
    }
}
