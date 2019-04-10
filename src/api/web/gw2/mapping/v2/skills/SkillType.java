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
 * Defines all skill types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills") // NOI18N.
public enum SkillType {

    /**
     * Defines the bundle skill type.
     * <br>Used for engineer bundles
     */
    BUNDLE("Bundle"), // NOI18N.
    /**
     * Defines the elite skill type.
     */
    ELITE("Elite"), // NOI18N.
    /**
     * Defines the heal skill type.
     */
    HEAL("Heal"), // NOI18N.
    /**
     * Defines the profession skill type.
     * <br>Used for profession specific skills (i.e.: F1, F2, etc.).
     */
    PROFESSION("Profession"), // NOI18N.
    /**
     * Defines the utility skill type.
     */
    UTILITY("Utility"), // NOI18N.
    /**
     * Defines the weapon (or downed) skill type.
     */
    WEAPON("Weapon"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkillType(final String value) {
        this.value = value;
    }
}
