/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.build;

/**
 * Default implementation of a group.
 * @author Fabrice Bouyé
 */
final class DefaultBuild implements Build {

    int id = -1;

    /**
     * Creates a new empty instance.
     */
    DefaultBuild() {
    }

    @Override
    public int getId() {
        return id;
    }
}
