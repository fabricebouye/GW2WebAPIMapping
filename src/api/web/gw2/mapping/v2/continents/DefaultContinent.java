/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.continents;

import java.util.Set;

/**
 * Default implementation of a continent.
 * @author Fabrice Bouyé
 */
final class DefaultContinent implements Continent {

    String id;
    String name;
    int width;
    int height;
    int minZoom;
    int maxZoom;
    Set<Integer> floors;

    /**
     * Creates a new empty instance.
     */
    DefaultContinent() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getMinZoom() {
        return minZoom;
    }

    @Override
    public int getMaxZoom() {
        return maxZoom;
    }

    @Override
    public Set<Integer> getFloors() {
        return floors;
    }
}
