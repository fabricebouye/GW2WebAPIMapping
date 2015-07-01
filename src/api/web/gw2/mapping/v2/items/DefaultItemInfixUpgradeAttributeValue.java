/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

/**
 * Default implementation of an item infix upgrade attribute value.
 * @author Fabrice Bouyé
 */
final class DefaultItemInfixUpgradeAttributeValue implements ItemInfixUpgradeAttributeValue {

    ItemInfixUpgradeAttribute attribute = ItemInfixUpgradeAttribute.UNKNOWN;
    int modifier = -1;

    DefaultItemInfixUpgradeAttributeValue() {
    }

    @Override
    public ItemInfixUpgradeAttribute getAttribute() {
        return attribute;
    }

    @Override
    public int getModifier() {
        return modifier;
    }

}
