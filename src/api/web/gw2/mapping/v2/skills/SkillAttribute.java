/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an attribute.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public enum SkillAttribute {

    /**
     * Defines the condition damage attribute.
     */
    CONDITION_DAMAGE("ConditionDamage"), // NOI18N.
    /**
     * Defines the ferocity attribute.
     */
    FEROCITY("CritDamage"), // NOI18N.
    /**
     * Defines the healing attribute.
     */
    HEALING("Healing"), // NOI18N.
    /**
     * Defines the power attribute.
     */
    POWER("Power"), // NOI18N.
    /**
     * Defines the precision attribute.
     */
    PRECISION("Precision"), // NOI18N.
    /**
     * Defines the thoughness attribute.
     */
    TOUGHNESS("Toughness"), // NOI18N.
    /**
     * Defines the vitality attribute.
     */
    VITALITY("Vitality"), // NOI18N.
    /**
     * Defines the none attribute (? apparently used for ranger pet?).
     */
    NONE("None"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkillAttribute(String value) {
        this.value = value;
    }
}
