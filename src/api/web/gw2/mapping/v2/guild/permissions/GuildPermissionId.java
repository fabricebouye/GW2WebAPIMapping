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
    ACTIVATE_PLACEABLES("ActivatePlaceables"), // NOI18N.
    ACTIVATE_WORLD_EVENT("ActivateWorldEvent"), // NOI18N.
    /**
     * Allows to administrate lower ranks.
     */
    ADMIN("Admin"),
    CLAIMABLE_ACTIVATE("ClaimableActivate"), // NOI18N.
    CLAIMABLE_CLAIM("ClaimableClaim"), // NOI18N.
    /**
     * Allows to edit guild-owned claimables.
     */
    CLAIMABLE_EDIT_OPTIONS("ClaimableEditOptions"), // NOI18N.
    CLAIMABLE_SPEND("ClaimableSpend"), // NOI18N.
    DECORATION_ADMIN("DecorationAdmin"), // NOI18N.
    DEPOSIT_COINS_STASH("DepositCoinsStash"), // NOI18N.
    DEPOSIT_COINS_TROVE("DepositCoinsTrove"), // NOI18N.
    DEPOSIT_ITEMS_TROVE("DepositItemsTrove"), // NOI18N.
    DEPOSIT_ITEMS_STASH("DepositItemsStash"), // NOI18N.
    EDIT_ASSEMBLY_QUEUE("EditAssemblyQueue"), // NOI18N.
    /**
     * Allows to edit guild anthem.
     */
    EDIT_ANTHEM("EditAnthem"), // NOI18N.
    EDIT_BGM("EditBGM"), // NOI18N.
    EDIT_EMBLEM("EditEmblem"), // NOI18N.
    EDIT_MONUMENT("EditMonument"), // NOI18N.
    EDIT_MOTD("EditMOTD"), // NOI18N.
    EDIT_ROLES("EditRoles"), // NOI18N.
    MISSION_CONTROL("MissionControl"), // NOI18N.
    OPEN_PORTAL("OpenPortal"), // NOI18N.
    PLACE_ARENA_DECORATION("PlaceArenaDecoration"), // NOI18N.
    PLACE_DECORATION("PlaceDecoration"), // NOI18N.
    PURCHASE_UPGRADES("PurchaseUpgrades"), // NOI18N.
    SET_GUILD_HALL("SetGuildHall"), // NOI18N.
    SPEND_FUEL("SpendFuel"), // NOI18N.
    STARTING_ROLE("StartingRole"), // NOI18N.
    TEAM_ADMIN("TeamAdmin"), // NOI18N.
    WITHDRAW_COINS_STASH("WithdrawCoinsStash"), // NOI18N.
    WITHDRAW_COINS_TROVE("WithdrawCoinsTrove"), // NOI18N.
    WITHDRAW_ITEMS_STASH("WithdrawItemsStash"), // NOI18N.
    WITHDRAW_ITEMS_TROVE("WithdrawItemsTrove"), // NOI18N.
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
