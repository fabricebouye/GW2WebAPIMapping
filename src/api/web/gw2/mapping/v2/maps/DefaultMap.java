/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.maps;

import api.web.gw2.mapping.core.ContinentDimension;
import api.web.gw2.mapping.core.MapDimension;
import java.util.Set;

/**
 * Default implementation of a map.
 * @author Fabrice Bouyé
 */
final class DefaultMap implements Map {

    int id;
    String name;
    int minLevel;
    int maxLevel;
    int defaultFloor;
    Set<Integer> floors;
    int regionId;
    String regionName;
    int continentId;
    String continentName;
    MapDimension<Integer> mapRect;
    ContinentDimension<Integer> continentRect;

    /**
     * Creates a new empty instance.
     */
    DefaultMap() {
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
    public int getMinLevel() {
        return minLevel;
    }

    @Override
    public int getMaxLevel() {
        return maxLevel;
    }

    @Override
    public int getDefaultFloor() {
        return defaultFloor;
    }

    @Override
    public Set<Integer> getFloors() {
        return floors;
    }

    @Override
    public int getRegionId() {
        return regionId;
    }

    @Override
    public String getRegionName() {
        return regionName;
    }

    @Override
    public int getContinentId() {
        return continentId;
    }

    @Override
    public String getContinentName() {
        return continentName;
    }

    @Override
    public MapDimension<Integer> getMapRect() {
        return mapRect;
    }

    @Override
    public ContinentDimension<Integer> getContinentRect() {
        return continentRect;
    }
}
