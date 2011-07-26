/*
 * OpenFaces - JSF Component Library 3.0
 * Copyright (C) 2007-2011, TeamDev Ltd.
 * licensing@openfaces.org
 * Unless agreed in writing the contents of this file are subject to
 * the GNU Lesser General Public License Version 2.1 (the "LGPL" License).
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * Please visit http://openfaces.org/licensing/ for more details.
 */

package org.openfaces.ajax;

import javax.faces.context.FacesContext;

/**
 * @author Dmitry Pikhulya
 */
public class PartialViewContextFactory extends javax.faces.context.PartialViewContextFactory {
    private javax.faces.context.PartialViewContextFactory wrapped;

    public PartialViewContextFactory(javax.faces.context.PartialViewContextFactory wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public javax.faces.context.PartialViewContextFactory getWrapped() {
        return wrapped;
    }

    @Override
    public PartialViewContext getPartialViewContext(FacesContext context) {
        return new PartialViewContext(getWrapped().getPartialViewContext(context));
    }
}