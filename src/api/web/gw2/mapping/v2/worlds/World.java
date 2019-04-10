/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

import api.web.gw2.mapping.core.EnumValueFactory;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;
import static javax.management.Query.value;

/**
 * Defines a world.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/worlds") // NOI18N.
public interface World {

    /**
     * Gets the id of this world.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this world.
     * @return An {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the population level of this world.
     * @return A {@code WorldPopulation} instance, never {@code null}.
     */
    WorldPopulation getPopulation();

    /**
     * Gets the region to which this world is attached to.
     * @return A {@code WorldRegion} instance, never {@code null}.
     */
    @ImplementationSpecific
    default WorldRegion getRegion() {
        final int id = getId();
        final String code = "" + String.valueOf(id).charAt(0);
        return EnumValueFactory.INSTANCE.mapEnumValue(WorldRegion.class, code);
    }

    /**
     * Gets the expected language of the population of this world.
     * @return A {@code WorldLanguage} instance, never {@code null}.
     */
    @ImplementationSpecific
    default WorldLanguage getLanguage() {
        final int id = getId();
        final String code = "" + String.valueOf(id).charAt(1);
        return EnumValueFactory.INSTANCE.mapEnumValue(WorldLanguage.class, code);
    }
}
