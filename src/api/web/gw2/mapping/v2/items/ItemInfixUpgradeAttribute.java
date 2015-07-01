/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all infix upgrade attributes.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemInfixUpgradeAttribute {

    /**
     * Defines the condition damage attribute.
     */
    CONDITION_DAMAGE("ConditionDamage"),
    /**
     * Defines the critical strike damage attribute.
     */
    CRIT_DAMAGE("CritDamage"),
    /**
     * Defines the healing power attribute.
     */
    HEALING("Healing"),
    /**
     * Defines the power attribute.
     */
    POWER("Power"),
    /**
     * Defines the precision attribute.
     */
    PRECISION("Precision"),
    /**
     * Defines the toughness attribute.
     */
    TOUGHNESS("Toughness"),
    /**
     * Defines the vitality attribute.
     */
    VITALITY("Vitality"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    ItemInfixUpgradeAttribute(final String value) {
        this.value = value;
    }
}
