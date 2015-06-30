/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

/**
 * Default implementation of a world.
 * @author Fabrice Bouyé
 */
final class DefaultWorld implements World {

    int id = -1;
    String name = "";

    /**
     * Creates a new empty instance.
     */
    DefaultWorld() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
