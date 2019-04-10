/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.upgrades;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines guild upgrade types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/upgrades") // NOI18N.
public enum GuildUpgradeType {
    /**
     * Defines the accumulating currency upgrade type (ie: mining capacity upgrades).
     */
    ACCUMULATING_CURRENCY("AccumulatingCurrency"),
    /**
     * Defines the bank bag upgrade type (ie: guild bank upgrades).
     */
    BANK_BAG("BankBag"),
    /**
     * Defines the boost upgrade type (ie: permanent guild buffs).
     */
    BOOST("Boost"),
    /**
     * Defines the claimable upgrade type (ie: WvW tactics).
     */
    CLAIMABLE("Claimable"),
    /**
     * Defines the consumable upgrade type (ie: banners and guild siege).
     */
    CONSUMABLE("Consumable"),
    /**
     * Defines the decoration upgrade type.
     */
    DECORATION("Decoration"),
    /**
     * Defines the hub upgrade type (ie: guild initiative unlocks).
     */
    HUB("Hub"),
    /**
     * Defines the unlock upgrade type (ie: merchant unlocks).
     */
    UNLOCK("Unlock"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private GuildUpgradeType(String value) {
        this.value = value;
    }
}
