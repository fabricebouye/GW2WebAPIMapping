/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

/**
 * Default implementation of a gathering tool details.
 * @author Fabrice Bouyé
 */
final class DefaultItemGatheringDetails extends DefaultItemDetails implements ItemGatheringDetails {

    ItemGatheringType type = ItemGatheringType.UNKNOWN;

    /**
     * Creates a new empty instance.
     */
    DefaultItemGatheringDetails() {
        super(ItemType.GATHERING);
    }

    @Override
    public ItemGatheringType getType() {
        return type;
    }
}
