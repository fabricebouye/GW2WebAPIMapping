/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.home.cats;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all cat hints.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/home/cats", requiresAuthentication = true, scope = "progression") // NOI18N.
public enum CatHint {
    CHICKEN("chicken"), // NOI18N.
    GRILLED_CHICKEN("grilled_chicken"), // NOI18N.
    SPICY_FLANK("spicy_flank"), // NOI18N.
    SPICIER_FLANK("spicier_flank"), // NOI18N.
    FIRE_FLANK("fire_flank"), // NOI18N.
    PRICKLEY_PEAR_SORBET("prickley_pear_sorbet"), // NOI18N.
    GINGER_LIME_ICECREAM("ginger_lime_icecream"), // NOI18N.
    SAFFRON_MANGO_ICECREAM("saffron_mango_icecream"), // NOI18N.
    PEACH_RASPBERRY_ICECREAM("peach_raspberry_icecream"), // NOI18N.
    CHICKEN_DAY("chicken_day"), // NOI18N.
    CHIKEN_NIGHT("chicken_night"), // NOI18N.
    WARRIOR("warrior"), // NOI18N.
    MESMER("mesmer"), // NOI18N.
    RANGER("ranger"), // NOI18N.
    GUARDIAN("guardian"), // NOI18N.
    ELEMENTALIST("elementalist"), // NOI18N.
    ENGINEER("engineer"), // NOI18N.
    REVENANT("revenant"), // NOI18N.
    THIEF("thief"), // NOI18N.
    NECROMANCER("necromancer"), // NOI18N.
    LAVA_SKRITT("lava_skritt"), // NOI18N.
    GHOST_PEPPERS("ghost_peppers"), // NOI18N.
    HALLOWEEN("halloween"), // NOI18N.
    SNOW_LEPOARD("snow_leopard"), // NOI18N.
    FROZEN_POULTRY_LEEK("frozen (poultry leek)"), // NOI18N.
    ICE_POULTRY_WINTER_VEG("ice (poultry winter veg)"), // NOI18N.
    FREEZER_POULTRY_LEMONGRASS("freezer (poultry lemongrass)"), // NOI18N.
    COLD_SAFFRON_POULTRY("cold (saffron poultry)"), // NOI18N.
    CAUDECUS("cadeucus"), // NOI18N.
    BUNDLE("bundle"), // NOI18N.
    GHOST("ghost"), // NOI18N.
    SAB("sab"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private CatHint(final String value) {
        this.value = value;
    }
}
