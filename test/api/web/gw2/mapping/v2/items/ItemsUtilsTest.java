/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

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
public class ItemsUtilsTest {

    public ItemsUtilsTest() {
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
     * Test of findItemType method, of class ItemsUtils.
     */
    @Test
    public void testFindItemType() {
        System.out.println("findItemType");
        final String[] values = {
            "Armor", // NOI18N.
            "Back", // NOI18N.
            "Bag", // NOI18N.
            "Consumable", // NOI18N.
            "Container", // NOI18N.
            "CraftingMaterial", // NOI18N.
            "Gathering", // NOI18N.
            "Gizmo", // NOI18N.
            "MiniPet", // NOI18N.
            "Tool", // NOI18N.
            "Trait", // NOI18N.
            "Trinket", // NOI18N.
            "Trophy", // NOI18N.
            "UpgradeComponent", // NOI18N.
            "Weapon", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemType[] expResults = {
            ItemType.ARMOR,
            ItemType.BACK,
            ItemType.BAG,
            ItemType.CONSUMABLE,
            ItemType.CONTAINER,
            ItemType.CRAFTING_MATERIAL,
            ItemType.GATHERING,
            ItemType.GIZMO,
            ItemType.MINI_PET,
            ItemType.TOOL,
            ItemType.TRAIT,
            ItemType.TRINKET,
            ItemType.TROPHY,
            ItemType.UPGRADE_COMPONENT,
            ItemType.WEAPON,
            ItemType.UNKNOWN,
            ItemType.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemType expResult = expResults[index];
                    final ItemType result = ItemsUtils.findItemType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findItemRarity method, of class ItemsUtils.
     */
    @Test
    public void testFindItemRarity() {
        System.out.println("findItemRarity");
        final String[] values = {
            "Ascended", // NOI18N.
            "Basic", // NOI18N.
            "Exotic", // NOI18N.
            "Fine", // NOI18N.
            "Junk", // NOI18N.
            "Legendary", // NOI18N.
            "Masterwork", // NOI18N.
            "Rare", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemRarity[] expResults = {
            ItemRarity.ASCENDED,
            ItemRarity.BASIC,
            ItemRarity.EXOTIC,
            ItemRarity.FINE,
            ItemRarity.JUNK,
            ItemRarity.LEGENDARY,
            ItemRarity.MASTERWORK,
            ItemRarity.RARE,
            ItemRarity.UNKNOWN,
            ItemRarity.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemRarity expResult = expResults[index];
                    final ItemRarity result = ItemsUtils.findItemRarity(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findItemGameType method, of class ItemsUtils.
     */
    @Test
    public void testFindItemGameType() {
        System.out.println("findItemGameType");
        final String[] values = {
            "Activity", // NOI18N.
            "Dungeon", // NOI18N.
            "Pve", // NOI18N.
            "Pvp", // NOI18N.
            "PvpLobby", // NOI18N.
            "Wvw", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemGameType[] expResults = {
            ItemGameType.ACTIVITY,
            ItemGameType.DUNGEON,
            ItemGameType.PVE,
            ItemGameType.PVP,
            ItemGameType.PVP_LOBBY,
            ItemGameType.WVW,
            ItemGameType.UNKNOWN,
            ItemGameType.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemGameType expResult = expResults[index];
                    final ItemGameType result = ItemsUtils.findItemGameType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findItemFlag method, of class ItemsUtils.
     */
    @Test
    public void testFindItemFlag() {
        System.out.println("findItemFlag");
        final String[] values = {
            "AccountBindOnUse", // NOI18N.
            "AccountBound", // NOI18N.
            "HideSuffix", // NOI18N.
            "MonsterOnly", // NOI18N.
            "NotUpgradeable", // NOI18N.
            "NoMysticForge", // NOI18N.
            "NoSalvage", // NOI18N.
            "NoSell", // NOI18N.
            "NoUnderwater", // NOI18N.
            "SoulBindOnAcquire", // NOI18N.
            "SoulBindOnUse", // NOI18N.
            "Unique", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemFlag[] expResults = {
            ItemFlag.ACCOUNT_BIND_ON_USE,
            ItemFlag.ACCOUNT_BOUND,
            ItemFlag.HIDE_SUFFIX,
            ItemFlag.MONSTER_ONLY,
            ItemFlag.NOT_UPGRADEABLE,
            ItemFlag.NO_MYSTIC_FORGE,
            ItemFlag.NO_SALVAGE,
            ItemFlag.NO_SELL,
            ItemFlag.NO_UNDERWATER,
            ItemFlag.SOUL_BIND_ON_ACQUIRE,
            ItemFlag.SOUL_BIND_ON_USE,
            ItemFlag.UNIQUE,
            ItemFlag.UNKNOWN,
            ItemFlag.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemFlag expResult = expResults[index];
                    final ItemFlag result = ItemsUtils.findItemFlag(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findItemRestriction method, of class ItemsUtils.
     */
    @Test
    public void testFindItemRestriction() {
        System.out.println("findItemRestriction");
        final String[] values = {
            "Asura", // NOI18N.
            "Charr", // NOI18N.
            "Guardian", // NOI18N.
            "Human", // NOI18N.
            "Mesmer", // NOI18N.
            "Norn", // NOI18N.
            "Ranger", // NOI18N.
            "Sylvari", // NOI18N.
            "Warrior", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemRestriction[] expResults = {
            ItemRestriction.ASURA,
            ItemRestriction.CHARR,
            ItemRestriction.GUARDIAN,
            ItemRestriction.HUMAN,
            ItemRestriction.MESMER,
            ItemRestriction.NORN,
            ItemRestriction.RANGER,
            ItemRestriction.SYLVARI,
            ItemRestriction.WARRIOR,
            ItemRestriction.UNKNOWN,
            ItemRestriction.UNKNOWN
        };
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemRestriction expResult = expResults[index];
                    final ItemRestriction result = ItemsUtils.findItemRestriction(value);
                    assertEquals(expResult, result);
                });
    }
}
