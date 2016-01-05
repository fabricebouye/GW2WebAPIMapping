/* 
 * Copyright (C) 2015 Fabrice Bouyé
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
public class PermissionsUtilsTest {

    public PermissionsUtilsTest() {
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
     * Test of PermissionId.
     */
    @Test
    public void testFindPermissionId() {
        System.out.println("findPermissionId");
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
        final PermissionId[] expResults = {
            PermissionId.ACTIVATE_PLACEABLES,
            PermissionId.ACTIVATE_WORLD_EVENT,
            PermissionId.ADMIN,
            PermissionId.CLAIMABLE_ACTIVATE,
            PermissionId.CLAIMABLE_CLAIM,
            PermissionId.CLAIMABLE_EDIT_OPTIONS,
            PermissionId.CLAIMABLE_SPEND,
            PermissionId.DECORATION_ADMIN,
            PermissionId.DEPOSIT_COINS_STASH,
            PermissionId.DEPOSIT_COINS_TROVE,
            PermissionId.DEPOSIT_ITEMS_STASH,
            PermissionId.DEPOSIT_ITEMS_TROVE,
            PermissionId.EDIT_ANTHEM,
            PermissionId.EDIT_ASSEMBLY_QUEUE,
            PermissionId.EDIT_BGM,
            PermissionId.EDIT_EMBLEM,
            PermissionId.EDIT_MOTD,
            PermissionId.EDIT_ROLES,
            PermissionId.MISSION_CONTROL,
            PermissionId.OPEN_PORTAL,
            PermissionId.PLACE_ARENA_DECORATION,
            PermissionId.PLACE_DECORATION,
            PermissionId.PURCHASE_UPGRADES,
            PermissionId.SET_GUILD_HALL,
            PermissionId.SPEND_FUEL,
            PermissionId.TEAM_ADMIN,
            PermissionId.WITHDRAW_COINS_STASH,
            PermissionId.WITHDRAW_COINS_TROVE,
            PermissionId.WITHDRAW_ITEMS_STASH,
            PermissionId.WITHDRAW_ITEMS_TROVE,
            PermissionId.UNKNOWN,
            PermissionId.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PermissionId expResult = expResults[index];
                    final PermissionId result = EnumValueFactory.INSTANCE.mapEnumValue(PermissionId.class, value);
                    assertEquals(expResult, result);
                });
    }

}
