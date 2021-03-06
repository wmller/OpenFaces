/*
 * OpenFaces - JSF Component Library 3.0
 * Copyright (C) 2007-2013, TeamDev Ltd.
 * licensing@openfaces.org
 * Unless agreed in writing the contents of this file are subject to
 * the GNU Lesser General Public License Version 2.1 (the "LGPL" License).
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * Please visit http://openfaces.org/licensing/ for more details.
 */

package org.openfaces.testapp.customEvents;

import org.openfaces.event.SelectionChangeEvent;
import org.openfaces.event.SelectionChangeListener;

import java.util.logging.Logger;

/**
 * @author Andrew Palval
 */
public class MySelectionChangeListener implements SelectionChangeListener {

    Logger logger = Logger.getLogger(MySelectionChangeListener.class.getName());

    public void processSelectionChange(SelectionChangeEvent event) {
        logger.info("===  Selection changed: old=" + event.getOldIndex() + "; new=" + event.getNewIndex() + "  ===");
    }
}
