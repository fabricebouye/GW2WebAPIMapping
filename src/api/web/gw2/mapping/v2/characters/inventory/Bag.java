/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

import api.web.gw2.mapping.v2.APIv2;
import java.util.List;

/**
 * Defines a bag carried by a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/<name>/inventory", requiresAuthentication = true) // NOI18N.
public interface Bag {

    /**
     * Gets the Id of this bag.
     * @return An {@code int}.
     */
    int getId();

    /**
     * Gets the number of slots of this bag.
     * @return An {@code int}.
     */
    int getSize();

    /**
     * Gets the list of items in this bag.
     * <br>The size of this list is the size of this bag.
     * <br>{@code null} values denote an empty slot.
     * @return A non-modifiable {@code List<Inventory>} instance, never {@code null}.
     * @see Inventory
     */
    List<Inventory> getInventory();
}
