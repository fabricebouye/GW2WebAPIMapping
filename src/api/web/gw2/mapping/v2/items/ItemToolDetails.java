/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a tool details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemToolDetails {

    /**
     * Get the type of this tool.
     * @return An {@code ItemToolType} instance, never {@code null}.
     */
    ItemToolType getType();

    /**
     * Gets the number of charges on this tool.
     * @return An {@code int}.
     */
    int getCharges();
}
