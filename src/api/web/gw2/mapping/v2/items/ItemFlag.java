/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines flags that define the state of the item.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemFlag {

    /**
     * Define the account bind on use flag.
     */
    ACCOUNT_BIND_ON_USE("AccountBindOnUse"), // NOI18N.
    /**
     * Define the account bound flag.
     */
    ACCOUNT_BOUND("AccountBound"), // NOI18N.
    /**
     * Define the hide suffix flag.
     */
    HIDE_SUFFIX("HideSuffix"), // NOI18N.
    /**
     * Define the monster only flag.
     */
    MONSTER_ONLY("MonsterOnly"), // NOI18N.
    /**
     * Define the no mystic forge flag.
     */
    NO_MYSTIC_FORGE("NoMysticForge"), // NOI18N.
    /**
     * Define the no salvage flag.
     */
    NO_SALVAGE("NoSalvage"), // NOI18N.
    /**
     * Define the no sell flag.
     */
    NO_SELL("NoSell"), // NOI18N.
    /**
     * Define the not upgradeable flag.
     */
    NOT_UPGRADEABLE("NotUpgradeable"), // NOI18N.
    /**
     * Define the no underwater flag.
     */
    NO_UNDERWATER("NoUnderwater"), // NOI18N.
    /**
     * Define the soulbind on acquire flag.
     */
    SOUL_BIND_ON_ACQUIRE("SoulBindOnAcquire"), // NOI18N.
    /**
     * Define the souldbind on use flag.
     */
    SOUL_BIND_ON_USE("SoulBindOnUse"), // NOI18N.
    /**
     * Define the unique flag.
     */
    UNIQUE("Unique"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);
    final String value;

    private ItemFlag(final String value) {
        this.value = value;
    }
}
