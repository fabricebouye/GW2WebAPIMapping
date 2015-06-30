/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.listings;

import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of a listing response.
 * @author Fabrice Bouyé
 */
final class DefaultListingResponse implements ListingResponse {

    int id;
    Set<Listing> buys = Collections.EMPTY_SET;
    Set<Listing> sells = Collections.EMPTY_SET;

    /**
     * Creates a new empty instance.
     */
    DefaultListingResponse() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Set<Listing> getBuys() {
        return buys;
    }

    @Override
    public Set<Listing> getSells() {
        return sells;
    }
}
