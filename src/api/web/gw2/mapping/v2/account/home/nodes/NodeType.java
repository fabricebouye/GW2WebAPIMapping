/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.home.nodes;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all node types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/home/nodes", requiresAuthentication = true, scope = "progression") // NOI18N.
public enum NodeType {
    BASIC_ORE_NODES("basic_ore_nodes"), // NOI18N.
    BASIC_LUMBER_NODES("basic_lumber_nodes"), // NOI18N.
    BASIC_HARVESTING_NODES("basic_harvesting_nodes"), // NOI18N.
    BASIC_CLOTH_RACK("basic_cloth_rack"), // NOI18N.
    BASIC_LEATHER_RACK("basic_leather_rack"), // NOI18N.
    HARD_WOOD_NODE("hard_wood_node"), // NOI18N.
    ANCIENT_WOOD_NODE("ancient_wood_node"), // NOI18N.
    ELDER_WOOD_NODE("elder_wood_node"), // NOI18N.
    IRON_ORE_NODE("iron_ore_node"), // NOI18N.
    PLATINUM_ORE_NODE("platinum_ore_node"), // NOI18N.
    MITHRIL_ORE_NODE("mithril_ore_node"), // NOI18N.
    ORICHALCUM_ORE_NODE("orichalcum_ore_node"), // NOI18N.
    OMNOMBERRY_NODE("omnomberry_node"), // NOI18N.
    SNOW_TRUFFLE_NODE("snow_truffle_node"), // NOI18N.
    LOTUS_NODE("lotus_node"), // NOI18N.
    ORRIAN_TRUFFLE_NODE("orrian_truffle_node"), // NOI18N.
    FLAXSEED_NODE("flaxseed_node"), // NOI18N.
    GHOST_PEPPER_NODE("ghost_pepper_node"), // NOI18N.
    AURILIUM_NODE("aurilium_node"), // NOI18N.
    ENCHANTED_TREASURE_CHEST("enchanted_treasure_chest"), // NOI18N.
    CANDY_CORN_NODE("candy_corn_node"), // NOI18N.
    WINTERSDAY_TREE("wintersday_tree"), // NOI18N.
    QUARTZ_NODE("quartz_node"), // NOI18N.
    SPROKET_GENERATOR("sprocket_generator"), // NOI18N.
    KRAIT_OBELISK("krait_obelisk"), // NOI18N.
    BANDIT_CHEST("bandit_chest"), // NOI18N.
    BLOODSTONE_KRYSTAL("bloodstone_crystals"), // NOI18N.
    KING_SIZED_CANDY_CORN("king_sized_candy_corn"), // NOI18N.
    AIRSHIP_CARGO("airship_cargo"), // NOI18N.
    CRYSTALLIZED_SUPPLY_CACHE("crystallized_supply_cache"), // NOI18N.
    EXALTED_CHEST("exalted_chest"), // NOI18N.
    PETRIFIED_STUMP("petrified_stump"), // NOI18N.
    WINTERBERRY_BUSH("winterberry_bush"), // NOI18N.
    JADE_FRAGMENT("jade_fragment"), // NOI18N.
    NOXIOUS_POD("noxious_pod"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private NodeType(final String value) {
        this.value = value;
    }
}
