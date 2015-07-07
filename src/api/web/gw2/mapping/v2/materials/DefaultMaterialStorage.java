/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.materials;

import java.util.Set;

/**
 * Default implementation of a material storage.
 * @author Fabrice Bouyé
 */
final class DefaultMaterialStorage implements MaterialStorage {

    int id;
    String name;
    Set<Integer> items;

    /**
     * Creates a new empty instance.
     */
    DefaultMaterialStorage() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Set<Integer> getItems() {
        return items;
    }
}
