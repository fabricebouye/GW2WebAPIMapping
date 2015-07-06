/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.files;

/**
 * Default implementation of a file.
 * @author Fabrice Bouyé
 */
final class DefaultFile implements File {
    String id;
    String icon;

    /**
    * Creates a new empty instance.
    */
    DefaultFile() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getIcon() {
        return icon;
    }
}
