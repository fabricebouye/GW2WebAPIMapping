/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.listings;

import java.util.Set;

/**
 * Defines a listing response.
 * @author Fabrice Bouyé
 */
public interface ListingResponse {
     /**
     * Gets the id of the item.
     * @return And {@code int}.
     */
    int getId();

    /**
     * Gets the set of all buy listings on this item.
     * @return A non-modifiable {@code Set<Listing>} instance, never {@code null}.
     * <br>The set is ordered ascending from the lowest buy order.
     */
    Set<Listing> getBuys();

    /**
     * Gets the set of all sell listings on this item.
     * @return A non-modifiable {@code Set<Listing>} instance, never {@code null}.
     * <br>The set is ordered ascending from the lowest sell offer.
     */
    Set<Listing> getSells();
}
