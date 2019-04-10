/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worldbosses;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a worldboss.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/worldbosses") // NOI18N.
public enum WorldBoss {
    /**
     * Defines world boss: Admiral Taidha Covington.
     */
    ADMIRAL_TAIDHA_COVINGTON("admiral_taidha_covington"), // NOI18N.
    /**
     * Defines world boss: Claw of Jormag.
     */
    CLAW_OF_JORMAG("claw_of_jormag"), // NOI18N.
    /**
     * Defines world boss: Fire Elemental.
     */
    FIRE_ELEMENTAL("fire_elemental"), // NOI18N.
    /**
     * Defines world boss: Great Jungle Wurm.
     */
    GREAT_JUNGLE_WURM("great_jungle_wurm"), // NOI18N.
    /**
     * Defines world boss: Inquest Golem MK II.
     */
    INQUEST_GOLEM_MARK_II("inquest_golem_mark_ii"), // NOI18N.
    /**
     * Defines world boss: Karka Queen.
     */
    KARKA_QUEEN("karka_queen"), // NOI18N.
    /**
     * Defines world boss: Megadestroyer.
     */
    MEGADESTROYER("megadestroyer"), // NOI18N.
    /**
     * Defines world boss: Modniir Ulgoth.
     */
    MODNIRR_ULGOTH("modniir_ulgoth"), // NOI18N.
    /**
     * Defines world boss: Shadow Behemoth.
     */
    SHADOW_BEHEMOTH("shadow_behemoth"), // NOI18N.
    /**
     * Defines world boss: Svanir Shaman Chief.
     */
    SVANIR_SHAMAN_CHIEF("svanir_shaman_chief"), // NOI18N.
    /**
     * Defines world boss: Tequatl the Sunless.
     */
    TEQUATL_THE_SUNLESS("tequatl_the_sunless"), // NOI18N.
    /**
     * Defines world boss: the Shatterer.
     */
    THE_SHATTERER("the_shatterer"), // NOI18N.
    /**
     * Defines world boss: admiral Triple Trouble Wurm.
     */
    TRIPLE_TROUBLE_WURM("triple_trouble_wurm"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    WorldBoss(final String value) {
        this.value = value;
    }
}
