/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.dailycrafting;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a daily crafting (things that can only be crafted once per day per account).
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/dailycrafting") // NOI18N.
public enum DailyCrafting {
    /**
     * Defines daily crafting: charged quartz crystal.
     */
    CHARGED_QUARTZ_CRYSTAL("charged_quartz_crystal"), // NOI18N.
    /**
     * Defines daily crafting: glob of elder spirit residue.
     */
    GLOB_OF_ELDER_SPIRIT_RESIDUE("glob_of_elder_spirit_residue"), // NOI18N.
    /**
     * Defines daily crafting: lump of mithirlium.
     */
    LUMP_OF_MITHRILIIUM("lump_of_mithrilium"), // NOI18N.
    /**
     * Defines daily crafting: spool of silk weaving thread.
     */
    SPOOL_OF_SILK_WEAWING_THREAD("spool_of_silk_weaving_thread"), // NOI18N.
    /**
     * Defines daily crafting: spool of thick elonian cord.
     */
    SPOOL_OF_THICK_ELONIAN_CORD("spool_of_thick_elonian_cord"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    DailyCrafting(final String value) {
        this.value = value;
    }
}
