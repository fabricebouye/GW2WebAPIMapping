/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

/**
 * Default implementation of an inventory item.
 * @author Fabrice Bouyé
 */
final class DefaultInventory implements Inventory {

    int id = -1;
    int count = 0;

    /**
     * Creates a new empty instance.
     */
    public DefaultInventory() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getCount() {
        return count;
    }
}
