/* This file was generated by SableCC (http://www.sablecc.org/). */

package giotto.giottoc.node;

import giotto.giottoc.analysis.Analysis;

public final class ANetworkConnection extends PNetworkConnection
{
    private TConnects _connects_;
    private PHostNameIdent _hostName_;
    private TComma _comma_;
    private PHostList _hostList_;

    public ANetworkConnection()
    {
    }

    public ANetworkConnection(
        TConnects _connects_,
        PHostNameIdent _hostName_,
        TComma _comma_,
        PHostList _hostList_)
    {
        setConnects(_connects_);

        setHostName(_hostName_);

        setComma(_comma_);

        setHostList(_hostList_);

    }
    public Object clone()
    {
        return new ANetworkConnection(
            (TConnects) cloneNode(_connects_),
            (PHostNameIdent) cloneNode(_hostName_),
            (TComma) cloneNode(_comma_),
            (PHostList) cloneNode(_hostList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANetworkConnection(this);
    }

    public TConnects getConnects()
    {
        return _connects_;
    }

    public void setConnects(TConnects node)
    {
        if (_connects_ != null)
        {
            _connects_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _connects_ = node;
    }

    public PHostNameIdent getHostName()
    {
        return _hostName_;
    }

    public void setHostName(PHostNameIdent node)
    {
        if (_hostName_ != null)
        {
            _hostName_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _hostName_ = node;
    }

    public TComma getComma()
    {
        return _comma_;
    }

    public void setComma(TComma node)
    {
        if (_comma_ != null)
        {
            _comma_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comma_ = node;
    }

    public PHostList getHostList()
    {
        return _hostList_;
    }

    public void setHostList(PHostList node)
    {
        if (_hostList_ != null)
        {
            _hostList_.parent(null);
        }

        if (node != null)
        {
            if (node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _hostList_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_connects_)
            + toString(_hostName_)
            + toString(_comma_)
            + toString(_hostList_);
    }

    void removeChild(Node child)
    {
        if (_connects_ == child)
        {
            _connects_ = null;
            return;
        }

        if (_hostName_ == child)
        {
            _hostName_ = null;
            return;
        }

        if (_comma_ == child)
        {
            _comma_ = null;
            return;
        }

        if (_hostList_ == child)
        {
            _hostList_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if (_connects_ == oldChild)
        {
            setConnects((TConnects) newChild);
            return;
        }

        if (_hostName_ == oldChild)
        {
            setHostName((PHostNameIdent) newChild);
            return;
        }

        if (_comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if (_hostList_ == oldChild)
        {
            setHostList((PHostList) newChild);
            return;
        }

    }
}
