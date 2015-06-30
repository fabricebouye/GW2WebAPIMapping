/* 
 * Copyright (C) 2015 Fabrice Bouyé
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
    *//**
    * Define the account bind on use flag.
    *//**
    * Define the account bind on use flag.
    *//**
    * Define the account bind on use flag.
    */
    ACCOUNT_BIND_ON_USE("AccountBindOnUse"),
    /**
    * Define the account bound flag.
    */
    ACCOUNT_BOUND("AccountBound"),
    /**
    * Define the hide suffix flag.
    */
    HIDE_SUFFIX("HideSuffix"),
    /**
    * Define the monster only flag.
    */
    MONSTER_ONLY("MonsterOnly"),
    /**
    * Define the no mystic forge flag.
    */
    NO_MYSTIC_FORGE("NoMysticForge"),
    /**
    * Define the no salvage flag.
    */
    NO_SALVAGE("NoSalvage"),
    /**
    * Define the no sell flag.
    */
    NO_SELL("NoSell"),
    /**
    * Define the not upgradeable flag.
    */
    NOT_UPGRADEABLE("NotUpgradeable"),
    /**
    * Define the no underwater flag.
    */
    NO_UNDERWATER("NoUnderwater"),
    /**
    * Define the soulbind on acquire flag.
    */
    SOUL_BIND_ON_ACQUIRE("SoulBindOnAcquire"),
    /**
    * Define the souldbind on use flag.
    */
    SOUL_BIND_ON_USE("SoulBindOnUse"),
    /**
    * Define the unique flag.
    */
    UNIQUE("Unique"),
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
