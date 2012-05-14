/*
 * OpenFaces - JSF Component Library 2.0
 * Copyright (C) 2007-2012, TeamDev Ltd.
 * licensing@openfaces.org
 * Unless agreed in writing the contents of this file are subject to
 * the GNU Lesser General Public License Version 2.1 (the "LGPL" License).
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * Please visit http://openfaces.org/licensing/ for more details.
 */

package org.openfaces.validator;

import org.openfaces.util.MessageUtil;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

/**
 * @author Vladimir Korenev
 */
public class ByteConverterClientValidator extends AbstractClientValidator {
    private static final String CONVERSION_MESSAGE_ID = "javax.faces.convert.ByteConverter.CONVERSION";

    public String getJsValidatorName() {
        return "O$._ByteConverterValidator";
    }

    public ByteConverterClientValidator() {
        addJavascriptLibrary(new ValidationJavascriptLibrary("byteConverterValidator.js", null));
    }

    @Override
    protected Object[] getJsValidatorParametersAsString(FacesContext context, UIComponent component) {
        Object[] args = {component.getId()};
        FacesMessage message = MessageUtil.getMessage(context, FacesMessage.SEVERITY_ERROR,
                new String[]{CONVERSION_MESSAGE_ID, UIInput.CONVERSION_MESSAGE_ID}, args);

        return new String[]{
                message.getSummary(),
                message.getDetail()
        };
    }


}
