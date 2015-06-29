/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.colors;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a dye.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/colors") // NOI18N.
public interface Dye {

    /**
     * Gets the id of this dye.
     * @return An {@code int}.
     */
    int getId();

    /**
     * Gets the localized name of this dye.
     * @return A {@code String} instance, never {@code null}.
     */
    String getName();

    /**
     * Gets the base rgb color of this dye.
     * @return An {@code RGB} instance, never {@code null}.
     */
    RGB getBase();

    /**
     * Gets the cloth material for this dye.
     * @return A {@code Material} instance, never {@code null}.
     */
    Material getCloth();

    /**
     * Gets the leather material for this dye.
     * @return A {@code Material} instance, never {@code null}.
     */
    Material getLeather();

    /**
     * Gets the metal material for this dye.
     * @return A {@code Material} instance, never {@code null}.
     */
    Material getMetal();
}
