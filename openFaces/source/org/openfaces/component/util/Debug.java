/*
 * OpenFaces - JSF Component Library 3.0
 * Copyright (C) 2007-2012, TeamDev Ltd.
 * licensing@openfaces.org
 * Unless agreed in writing the contents of this file are subject to
 * the GNU Lesser General Public License Version 2.1 (the "LGPL" License).
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * Please visit http://openfaces.org/licensing/ for more details.
 */
package org.openfaces.component.util;

import org.openfaces.component.window.Window;
import org.openfaces.renderkit.CompoundComponentRenderer;

import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * This component is under construction. API is subject to change. Please avoid using this component in a production
 * environment.
 *
 * @author Dmitry Pikhulya
 */
public class Debug extends Window {
    public static final String COMPONENT_TYPE = "org.openfaces.Debug";
    public static final String COMPONENT_FAMILY = "org.openfaces.Debug";

    public Debug() {
        setRendererType("org.openfaces.DebugRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    @Override
    protected String getDefaultCaptionText() {
        return "Debug";
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        createSubComponents(context);
        super.encodeBegin(context);
    }

    public void createSubComponents(FacesContext context) {
        String createdKey = "_subComponentsCreated";
        if (getAttributes().containsKey(createdKey)) return;
        getAttributes().put(createdKey, true);

        ((CompoundComponentRenderer) getRenderer(context)).createSubComponents(context, this);
    }
}
