/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.continents;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a continent.
 * @author FabriceB
 */
@APIv2(endpoint = "v2/continents") // NOI18N.
public interface Continent {

    /**
     * Gets the id of this continent.
     * @return A {@code String} instance, never {@code null}.
     */
    String getId();

    /**
     * Gets the localized name of this continent.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the width of the area defined by this continent.
     * @return An {@code int}
     */
    @ImplementationSpecific
    int getWidth();

    /**
     * Gets the height of the area defined by this continent.
     * @return An {@code int}
     */
    @ImplementationSpecific
    int getHeight();

    /**
     * Gets the minimum zoom level support for this continent.
     * @return An {@code int}
     */
    int getMinZoom();

    /**
     * Gets the maximum zoom level support for this continent.
     * @return An {@code int}
     */
    int getMaxZoom();

    /**
     * Gets a set of tile ids included in this continent.
     * @return A {@code Set<Integer>} instance, never {@code null}.
     */
    Set<Integer> getFloors();
}
