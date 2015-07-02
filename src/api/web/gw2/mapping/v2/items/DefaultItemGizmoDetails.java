/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

/**
 * Base type for all item details implementations.
 * @author Fabrice Bouyé
 */
final class DefaultItemGizmoDetails extends DefaultItemDetails implements ItemGizmoDetails {

    ItemGizmoType type = ItemGizmoType.UNKNOWN;

    DefaultItemGizmoDetails() {
        super(ItemType.GIZMO);
    }

    @Override
    public ItemGizmoType getType() {
        return type;
    }
}
