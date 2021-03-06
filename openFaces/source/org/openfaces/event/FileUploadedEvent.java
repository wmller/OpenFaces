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

package org.openfaces.event;

import javax.faces.component.UIComponent;
import javax.faces.event.FacesEvent;
import javax.faces.event.FacesListener;
import java.io.File;

public class FileUploadedEvent extends FacesEvent {
    private final File uploadedFile;

    public FileUploadedEvent(UIComponent component, File file) {
        super(component);
        if (component == null) throw new IllegalArgumentException("component " + component + " is null");
        this.uploadedFile = file;
    }

    @Override
    public boolean isAppropriateListener(FacesListener listener) {
        return listener instanceof FileUploadedListener;
    }

    @Override
    public void processListener(FacesListener listener) {
        ((FileUploadedListener) listener).processFileUploaded(this);
    }

    public File getUploadedFile() {
        return uploadedFile;
    }
}
