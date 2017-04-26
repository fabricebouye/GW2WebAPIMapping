/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.permissions;

import api.web.gw2.mapping.core.EnumValueFactory;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test.
 * @author Fabrice Bouyé
 */
public class GuildPermissionsUtilsTest {

    public GuildPermissionsUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of GuildPermissionId.
     */
    @Test
    public void testFindGuildPermissionId() {
        System.out.println("findGuildPermissionId");
        final String[] values = {
            "ActivatePlaceables", // NOI18N.
            "ActivateWorldEvent", // NOI18N.
            "Admin", // NOI18N.
            "ClaimableActivate", // NOI18N.
            "ClaimableClaim", // NOI18N.
            "ClaimableEditOptions", // NOI18N.
            "ClaimableSpend", // NOI18N.
            "DecorationAdmin", // NOI18N.
            "DepositCoinsStash", // NOI18N.
            "DepositCoinsTrove", // NOI18N.
            "DepositItemsStash", // NOI18N.
            "DepositItemsTrove", // NOI18N.
            "EditAnthem", // NOI18N.
            "EditAssemblyQueue", // NOI18N.
            "EditBGM", // NOI18N.
            "EditEmblem", // NOI18N.
            "EditMOTD", // NOI18N.
            "EditRoles", // NOI18N.
            "MissionControl", // NOI18N.
            "OpenPortal", // NOI18N.
            "PlaceArenaDecoration", // NOI18N.
            "PlaceDecoration", // NOI18N.
            "PurchaseUpgrades", // NOI18N.
            "SetGuildHall", // NOI18N.
            "SpendFuel", // NOI18N.
            "TeamAdmin", // NOI18N.
            "WithdrawCoinsStash", // NOI18N.
            "WithdrawCoinsTrove", // NOI18N.
            "WithdrawItemsStash", // NOI18N.
            "WithdrawItemsTrove", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildPermissionId[] expResults = {
            GuildPermissionId.ACTIVATE_PLACEABLES,
            GuildPermissionId.ACTIVATE_WORLD_EVENT,
            GuildPermissionId.ADMIN,
            GuildPermissionId.CLAIMABLE_ACTIVATE,
            GuildPermissionId.CLAIMABLE_CLAIM,
            GuildPermissionId.CLAIMABLE_EDIT_OPTIONS,
            GuildPermissionId.CLAIMABLE_SPEND,
            GuildPermissionId.DECORATION_ADMIN,
            GuildPermissionId.DEPOSIT_COINS_STASH,
            GuildPermissionId.DEPOSIT_COINS_TROVE,
            GuildPermissionId.DEPOSIT_ITEMS_STASH,
            GuildPermissionId.DEPOSIT_ITEMS_TROVE,
            GuildPermissionId.EDIT_ANTHEM,
            GuildPermissionId.EDIT_ASSEMBLY_QUEUE,
            GuildPermissionId.EDIT_BGM,
            GuildPermissionId.EDIT_EMBLEM,
            GuildPermissionId.EDIT_MOTD,
            GuildPermissionId.EDIT_ROLES,
            GuildPermissionId.MISSION_CONTROL,
            GuildPermissionId.OPEN_PORTAL,
            GuildPermissionId.PLACE_ARENA_DECORATION,
            GuildPermissionId.PLACE_DECORATION,
            GuildPermissionId.PURCHASE_UPGRADES,
            GuildPermissionId.SET_GUILD_HALL,
            GuildPermissionId.SPEND_FUEL,
            GuildPermissionId.TEAM_ADMIN,
            GuildPermissionId.WITHDRAW_COINS_STASH,
            GuildPermissionId.WITHDRAW_COINS_TROVE,
            GuildPermissionId.WITHDRAW_ITEMS_STASH,
            GuildPermissionId.WITHDRAW_ITEMS_TROVE,
            GuildPermissionId.UNKNOWN,
            GuildPermissionId.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildPermissionId expResult = expResults[index];
                    final GuildPermissionId result = EnumValueFactory.INSTANCE.mapEnumValue(GuildPermissionId.class, value);
                    assertEquals(expResult, result);
                });
    }

}
