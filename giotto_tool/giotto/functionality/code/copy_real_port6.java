/*
  Copyright (c) 2002-2004 The Regents of the University of California.
  All rights reserved.

  Permission is hereby granted, without written agreement and without
  license or royalty fees, to use, copy, modify, and distribute this
  software and its documentation for any purpose, provided that the above
  copyright notice and the following two paragraphs appear in all copies
  of this software.

  IN NO EVENT SHALL THE UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY
  FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES
  ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
  THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
  SUCH DAMAGE.

  THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY WARRANTIES,
  INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
  MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
  PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
  CALIFORNIA HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES,
  ENHANCEMENTS, OR MODIFICATIONS.

  GIOTTO_COPYRIGHT_VERSION_2
  COPYRIGHTENDKEY
*/
package giotto.functionality.code;

import giotto.functionality.interfaces.DriverInterface;
import giotto.functionality.table.Parameter;

import java.io.Serializable;

/**
 * @author M.A.A. Sanvido
 * @version copy_real_port6.java,v 1.8 2004/09/29 03:49:04 cxh Exp
 * @since Giotto 1.0.1
 */
public class copy_real_port6 implements DriverInterface, Serializable {

    /**
     * @see giotto.functionality.interfaces.DriverInterface#run(Parameter)
     */
    public void run(Parameter p) {
        real_port a0 = (real_port)p.getPortVariable(0);
        real_port a1 = (real_port)p.getPortVariable(1);
        real_port a2 = (real_port)p.getPortVariable(2);
        real_port a3 = (real_port)p.getPortVariable(3);
        real_port a4 = (real_port)p.getPortVariable(4);
        real_port a5 = (real_port)p.getPortVariable(5);
        real_port b0 = (real_port)p.getPortVariable(6);
        real_port b1 = (real_port)p.getPortVariable(7);
        real_port b2 = (real_port)p.getPortVariable(8);
        real_port b3 = (real_port)p.getPortVariable(9);
        real_port b4 = (real_port)p.getPortVariable(10);
        real_port b5 = (real_port)p.getPortVariable(11);
        b0.copyValueFrom(a0);
        b1.copyValueFrom(a1);
        b2.copyValueFrom(a2);
        b3.copyValueFrom(a3);
        b4.copyValueFrom(a4);
        b5.copyValueFrom(a5);
    }
}
