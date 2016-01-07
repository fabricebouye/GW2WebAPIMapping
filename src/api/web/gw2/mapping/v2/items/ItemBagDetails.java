/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines bag details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemBagDetails extends ItemDetails {

    /**
     * Get the size of this bag.
     * @return An {@code int}.
     */
    @QuantityValue
    int getSize();

    /**
     * Indicates whether the content of the bag appears at merchant or can be sorted in game.
     * @return  {@code True} if the property is verified, {@code false} otherwise.
     */
    boolean isNoSellOrSort();
}
