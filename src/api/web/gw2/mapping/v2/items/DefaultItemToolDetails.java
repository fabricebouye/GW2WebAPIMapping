/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

/**
 * Default implementation of an tool details.
 * @author Fabrice Bouyé
 */
final class DefaultItemToolDetails extends DefaultItemDetails implements ItemToolDetails {

    ItemToolType type = ItemToolType.UNKNOWN;
    int charges = -1;

    DefaultItemToolDetails() {
        super(ItemType.TOOL);
    }

    @Override
    public ItemToolType getType() {
        return type;
    }

    @Override
    public int getCharges() {
        return charges;
    }
}
