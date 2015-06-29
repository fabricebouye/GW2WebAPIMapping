/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

import java.util.List;

/**
 * Default implementation of a bag.
 * @author Fabrice Bouyé
 */
final class DefaultBag implements Bag {

    int id;
    int size;
    List<Inventory> inventory;

    /**
     * Creates a new instance.
     */
    DefaultBag() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public List<Inventory> getInventory() {
        return inventory;
    }
}
