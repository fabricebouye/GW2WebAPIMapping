/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines permissions on a token info.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits")
public enum TraitFactType {

    /**
     * Defines the attribute adjust type.
     */
    ATTRIBUTE_ADJUST("AttributeAdjust"), // NOI18N.
    /**
     * Defines the buff type.
     */
    BUFF("Buff"), // NOI18N.
    /**
     * Defines the buff conversion type.
     */
    BUFF_CONVERSION("BuffConversion"), // NOI18N.
    /**
     * Defines the combo field type.
     */
    COMBO_FIELD("ComboField"), // NOI18N.
    /**
     * Defines the combo finisher type.
     */
    COMBO_FINISHER("ComboFinisher"), // NOI18N.
    /**
     * Defines the damage type.
     */
    DAMAGE("Damage"), // NOI18N.
    /**
     * Defines the attribute adjust type.
     */
    DISTANCE("Distance"), // NOI18N.
    /**
     * Defines the no data type.
     */
    NO_DATA("NoData"), // NOI18N.
    /**
     * Defines the number type.
     */
    NUMBER("Number"), // NOI18N.
    /**
     * Defines the percent type.
     */
    PERCENT("Percent"), // NOI18N.
    /**
     * Defines the prefixed buff type.
     */
    PREFIXED_BUFF("PrefixedBuff"), // NOI18N.
    /**
     * Defines the radius type.
     */
    RADIUS("Radius"), // NOI18N.
    /**
     * Defines the range type.
     */
    RANGE("Range"), // NOI18N.
    /**
     * Defines the recharge type.
     */
    RECHARGE("Recharge"), // NOI18N.
    /**
     * Defines the time type.
     */
    TIME("Time"), // NOI18N.
    /**
     * Defines the unblockable type.
     */
    UNBLOCKABLE("Unblockable"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private TraitFactType(String value) {
        this.value = value;
    }
}
