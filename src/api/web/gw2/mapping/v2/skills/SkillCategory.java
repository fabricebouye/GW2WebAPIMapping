/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all skill categories.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills") // NOI18N.
public enum SkillCategory {
    /**
     * Defines the burst skill category.
     */
    BURST("Burst"), // NOI18N.
    /**
     * Defines the cantrip skill category.
     */
    CANTRIP("Cantrip"), // NOI18N.
    /**
     * Defines the conjure skill category.
     * <br>Used by elementalist conjured weapons.
     */
    CONJURE("Conjure"), // NOI18N.
    /**
     * Defines the duel wield skill category.
     * <br>Dual wield attack for a thief, off-hand weapon id will be given in {@code dualWield} field.
     */
    DUAL_WIELD("DualWield"), // NOI18N.
    /**
     * Defines the signet skill category.
     */
    SIGNET("Signet"), // NOI18N.
    /**
     * Defines the shout skill category.
     */
    SHOUT("Shout"), // NOI18N.
    /**
     * Defines the stealth attack skill category.
     * <br>Stealth attack for a thief.
     */
    STEALTH_ATTACK("StealthAttack"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkillCategory(final String value) {
        this.value = value;
    }
}
