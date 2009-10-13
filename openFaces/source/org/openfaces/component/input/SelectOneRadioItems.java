/*
 * OpenFaces - JSF Component Library 2.0
 * Copyright (C) 2007-2009, TeamDev Ltd.
 * licensing@openfaces.org
 * Unless agreed in writing the contents of this file are subject to
 * the GNU Lesser General Public License Version 2.1 (the "LGPL" License).
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * Please visit http://openfaces.org/licensing/ for more details.
 */

package org.openfaces.component.input;

import org.openfaces.util.ValueBindings;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import java.io.Serializable;

/**
 * Author: Oleg Marshalenko
 * Date: Sep 18, 2009
 * Time: 3:50:05 PM
 */
public class SelectOneRadioItems extends UIComponentBase implements Serializable {
    private static final long serialVersionUID = 335718451435237437L;

    public static final String COMPONENT_TYPE = "org.openfaces.SelectOneRadioItems";
    public static final String COMPONENT_FAMILY = "org.openfaces.SelectOneRadioItems";

    private Object value;

    public Object getValue() {
        return ValueBindings.get(this, "value", value, Object.class);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Object saveState(FacesContext context) {
        return new Object[]{
                super.saveState(context),
                value
        };
    }

    public void restoreState(FacesContext context, Object state) {
        Object[] values = (Object[]) state;
        super.restoreState(context, values[0]);
        value = values[1];
    }
}
