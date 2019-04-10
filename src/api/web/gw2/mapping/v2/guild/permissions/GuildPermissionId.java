/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.permissions;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines existing guild permissions ids.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/permissions") // NOI18N.
public enum GuildPermissionId {
    ACTIVATE_PLACEABLES("ActivatePlaceables"),
    ACTIVATE_WORLD_EVENT("ActivateWorldEvent"),
    /**
     * Allows to administrate lower ranks.
     */
    ADMIN("Admin"),
    CLAIMABLE_ACTIVATE("ClaimableActivate"),
    CLAIMABLE_CLAIM("ClaimableClaim"),
    /**
     * Allows to edit guild-owned claimables.
     */
    CLAIMABLE_EDIT_OPTIONS("ClaimableEditOptions"),
    CLAIMABLE_SPEND("ClaimableSpend"),
    DECORATION_ADMIN("DecorationAdmin"),
    DEPOSIT_COINS_STASH("DepositCoinsStash"),
    DEPOSIT_COINS_TROVE("DepositCoinsTrove"),
    DEPOSIT_ITEMS_TROVE("DepositItemsTrove"),
    DEPOSIT_ITEMS_STASH("DepositItemsStash"),
    EDIT_ASSEMBLY_QUEUE("EditAssemblyQueue"),
    /**
     * Allows to edit guild anthem.
     */
    EDIT_ANTHEM("EditAnthem"),
    EDIT_BGM("EditBGM"),
    EDIT_EMBLEM("EditEmblem"),
    EDIT_MOTD("EditMOTD"),
    EDIT_ROLES("EditRoles"),
    MISSION_CONTROL("MissionControl"),
    OPEN_PORTAL("OpenPortal"),
    PLACE_ARENA_DECORATION("PlaceArenaDecoration"),
    PLACE_DECORATION("PlaceDecoration"),
    PURCHASE_UPGRADES("PurchaseUpgrades"),
    SET_GUILD_HALL("SetGuildHall"),
    SPEND_FUEL("SpendFuel"),
    TEAM_ADMIN("TeamAdmin"),
    WITHDRAW_COINS_STASH("WithdrawCoinsStash"),
    WITHDRAW_COINS_TROVE("WithdrawCoinsTrove"),
    WITHDRAW_ITEMS_STASH("WithdrawItemsStash"),
    WITHDRAW_ITEMS_TROVE("WithdrawItemsTrove"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private GuildPermissionId(String value) {
        this.value = value;
    }
}
