/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.colors;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a color or dye.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/colors") // NOI18N.
public interface ColorDye {

    /**
     * Gets the id of this dye.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this dye.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the base rgb color of this dye.
     * @return A {@code ColorRGB} instance, never {@code null}.
     */
    @ImplementationSpecific
    ColorRGB getBaseRGB();

    /**
     * Gets the cloth material for this dye.
     * @return A {@code ColorMaterial} instance, never {@code null}.
     */
    ColorMaterial getCloth();

    /**
     * Gets the leather material for this dye.
     * @return A {@code ColorMaterial} instance, never {@code null}.
     */
    ColorMaterial getLeather();

    /**
     * Gets the metal material for this dye.
     * @return A {@code ColorMaterial} instance, never {@code null}.
     */
    ColorMaterial getMetal();
}
