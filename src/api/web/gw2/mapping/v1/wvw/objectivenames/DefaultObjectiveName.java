/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.objectivenames;

/**
 * Default implementation of an objective name.
 * @author Fabrice Bouyé
 */
final class DefaultObjectiveName implements ObjectiveName {

    String id = "";
    String name = "";

    /**
     * Creates a new empty instance.
     */
    DefaultObjectiveName() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
