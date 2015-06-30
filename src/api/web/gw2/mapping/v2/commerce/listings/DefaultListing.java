/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.listings;

/**
 * Default implementation of a listing
 * @author Fabrice Bouyé
 */
final class DefaultListing implements Listing {
    int listing = -1;
    int unitPrice = -1;
    int quantity = -1;

    /**
    * Creates a new empty instance.
    */
    DefaultListing() {        
    }
    
    @Override
    public int getListings() {
        return listing;
    }

    @Override
    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
