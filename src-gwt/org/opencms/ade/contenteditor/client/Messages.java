/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.contenteditor.client;

import org.opencms.gwt.client.util.CmsMessages;

/**
 * Convenience class to access the localized messages of this OpenCms package.<p> 
 * 
 * @since 8.0.0
 */
public final class Messages {

    /** Message constant for key in the resource bundle. */
    public static final String GUI_LOCALE_DIALOG_CANCEL_0 = "GUI_LOCALE_DIALOG_CANCEL_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_LOCALE_DIALOG_DESCRIPTION_1 = "GUI_LOCALE_DIALOG_DESCRIPTION_1";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_LOCALE_DIALOG_NO_LANGUAGE_SELECTED_0 = "GUI_LOCALE_DIALOG_NO_LANGUAGE_SELECTED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_LOCALE_DIALOG_OK_0 = "GUI_LOCALE_DIALOG_OK_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_LOCALE_DIALOG_TITLE_0 = "GUI_LOCALE_DIALOG_TITLE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TOOLBAR_COPY_LOCALE_0 = "GUI_TOOLBAR_COPY_LOCALE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TOOLBAR_DELETE_LOCALE_0 = "GUI_TOOLBAR_DELETE_LOCALE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TOOLBAR_LANGUAGE_0 = "GUI_TOOLBAR_LANGUAGE_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TOOLBAR_NOTHING_CHANGED_0 = "GUI_TOOLBAR_NOTHING_CHANGED_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TOOLBAR_OPEN_FORM_0 = "GUI_TOOLBAR_OPEN_FORM_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TOOLBAR_RESET_0 = "GUI_TOOLBAR_RESET_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_TOOLBAR_SAVE_0 = "GUI_TOOLBAR_SAVE_0";

    /** Name of the used resource bundle. */
    private static final String BUNDLE_NAME = "org.opencms.ade.contenteditor.clientmessages";

    /** Static instance member. */
    private static CmsMessages INSTANCE;

    /**
     * Hides the public constructor for this utility class.<p>
     */
    private Messages() {

        // hide the constructor
    }

    /**
     * Returns an instance of this localized message accessor.<p>
     * 
     * @return an instance of this localized message accessor
     */
    public static CmsMessages get() {

        if (INSTANCE == null) {
            INSTANCE = new CmsMessages(BUNDLE_NAME);
        }
        return INSTANCE;
    }

    /**
     * Returns the bundle name for this OpenCms package.<p>
     * 
     * @return the bundle name for this OpenCms package
     */
    public String getBundleName() {

        return BUNDLE_NAME;
    }

}
