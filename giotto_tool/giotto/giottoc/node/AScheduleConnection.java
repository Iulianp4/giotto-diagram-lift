/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class AScheduleConnection extends PScheduleConnection
{
    private TPush _push_;
    private PActualGlobalParameters _pushPorts_;
    private PDestinations _destinations_;
    private PNetworkTimeslots _networkTimeslots_;

    public AScheduleConnection()
    {
    }

    public AScheduleConnection(
        TPush _push_,
        PActualGlobalParameters _pushPorts_,
        PDestinations _destinations_,
        PNetworkTimeslots _networkTimeslots_)
    {
        setPush(_push_);

        setPushPorts(_pushPorts_);

        setDestinations(_destinations_);

        setNetworkTimeslots(_networkTimeslots_);

    }
    public Object clone()
    {
        return new AScheduleConnection(
            (TPush) cloneNode(_push_),
            (PActualGlobalParameters) cloneNode(_pushPorts_),
            (PDestinations) cloneNode(_destinations_),
            (PNetworkTimeslots) cloneNode(_networkTimeslots_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAScheduleConnection(this);
    }

    public TPush getPush()
    {
        return _push_;
    }

    public void setPush(TPush node)
    {
        if (_push_ != null)
        {
            _push_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _push_ = node;
    }

    public PActualGlobalParameters getPushPorts()
    {
        return _pushPorts_;
    }

    public void setPushPorts(PActualGlobalParameters node)
    {
        if (_pushPorts_ != null)
        {
            _pushPorts_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pushPorts_ = node;
    }

    public PDestinations getDestinations()
    {
        return _destinations_;
    }

    public void setDestinations(PDestinations node)
    {
        if (_destinations_ != null)
        {
            _destinations_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _destinations_ = node;
    }

    public PNetworkTimeslots getNetworkTimeslots()
    {
        return _networkTimeslots_;
    }

    public void setNetworkTimeslots(PNetworkTimeslots node)
    {
        if (_networkTimeslots_ != null)
        {
            _networkTimeslots_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _networkTimeslots_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_push_)
            + toString(_pushPorts_)
            + toString(_destinations_)
            + toString(_networkTimeslots_);
    }

    void removeChild(Node child)
    {
        if (_push_ == child)
        {
            _push_ = null;
            return;
        }

        if (_pushPorts_ == child)
        {
            _pushPorts_ = null;
            return;
        }

        if (_destinations_ == child)
        {
            _destinations_ = null;
            return;
        }

        if (_networkTimeslots_ == child)
        {
            _networkTimeslots_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_push_ == oldChild)
        {
            setPush((TPush) newChild);
            return;
        }

        if (_pushPorts_ == oldChild)
        {
            setPushPorts((PActualGlobalParameters) newChild);
            return;
        }

        if (_destinations_ == oldChild)
        {
            setDestinations((PDestinations) newChild);
            return;
        }

        if (_networkTimeslots_ == oldChild)
        {
            setNetworkTimeslots((PNetworkTimeslots) newChild);
            return;
        }

    }
}
