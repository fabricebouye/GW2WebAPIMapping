/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all combo finisher types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public enum SkillComboFinisherType {

    /**
     * Defines the blast combo finisher type.
     */
    BLAST("Blast"), // NOI18N.
    /**
     * Defines the leap combo finisher type.
     */
    LEAP("Leap"), // NOI18N.
    /**
     * Defines the projectile combo finisher type.
     */
    PROJECTILE("Projectile"), // NOI18N.
    /**
     * Defines the whirl combo finisher type.
     */
    WHIRL("Whirl"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkillComboFinisherType(String value) {
        this.value = value;
    }
}
