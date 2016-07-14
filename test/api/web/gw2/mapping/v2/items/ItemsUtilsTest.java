/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

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
     * Test of ItemType.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemType expResult = expResults[index];
                    final ItemType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemRarity.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemRarity expResult = expResults[index];
                    final ItemRarity result = EnumValueFactory.INSTANCE.mapEnumValue(ItemRarity.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemGameType.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemGameType expResult = expResults[index];
                    final ItemGameType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemGameType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemFlag.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemFlag expResult = expResults[index];
                    final ItemFlag result = EnumValueFactory.INSTANCE.mapEnumValue(ItemFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemRestriction.
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
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemRestriction expResult = expResults[index];
                    final ItemRestriction result = EnumValueFactory.INSTANCE.mapEnumValue(ItemRestriction.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemArmorType.
     */
    @Test
    public void testFindItemArmorType() {
        System.out.println("findArmorType");
        final String[] values = {
            "Boots", // NOI18N.
            "Coat", // NOI18N.
            "Gloves", // NOI18N.
            "Helm", // NOI18N.
            "HelmAquatic", // NOI18N.
            "Leggings", // NOI18N.
            "Shoulders", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemArmorType[] expResults = {
            ItemArmorType.BOOTS,
            ItemArmorType.COAT,
            ItemArmorType.GLOVES,
            ItemArmorType.HELM,
            ItemArmorType.HELM_AQUATIC,
            ItemArmorType.LEGGINGS,
            ItemArmorType.SHOULDERS,
            ItemArmorType.UNKNOWN,
            ItemArmorType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemArmorType expResult = expResults[index];
                    final ItemArmorType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemArmorType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemArmorWeightClass.
     */
    @Test
    public void testFindItemArmorWeightClass() {
        System.out.println("findArmorWeightClass");
        final String[] values = {
            "Clothing", // NOI18N.
            "Heavy", // NOI18N.
            "Light", // NOI18N.
            "Medium", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemArmorWeightClass[] expResults = {
            ItemArmorWeightClass.CLOTHING,
            ItemArmorWeightClass.HEAVY,
            ItemArmorWeightClass.LIGHT,
            ItemArmorWeightClass.MEDIUM,
            ItemArmorWeightClass.UNKNOWN,
            ItemArmorWeightClass.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemArmorWeightClass expResult = expResults[index];
                    final ItemArmorWeightClass result = EnumValueFactory.INSTANCE.mapEnumValue(ItemArmorWeightClass.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemWeaponType.
     */
    @Test
    public void testFindItemWeaponType() {
        System.out.println("findItemWeaponType");
        final String[] values = {
            "Axe", // NOI18N.
            "Dagger", // NOI18N.
            "Focus", // NOI18N.
            "Greatsword", // NOI18N.
            "Hammer", // NOI18N.
            "Harpoon", // NOI18N.
            "LongBow", // NOI18N.
            "Mace", // NOI18N.
            "Pistol", // NOI18N.
            "Rifle", // NOI18N.
            "Scepter", // NOI18N.
            "Shield", // NOI18N.
            "ShortBow", // NOI18N.
            "Speargun", // NOI18N.
            "Staff", // NOI18N.
            "Sword", // NOI18N.
            "Torch", // NOI18N.
            "Trident", // NOI18N.
            "Warhorn", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemWeaponType[] expResults = {
            ItemWeaponType.AXE,
            ItemWeaponType.DAGGER,
            ItemWeaponType.FOCUS,
            ItemWeaponType.GREATSWORD,
            ItemWeaponType.HAMMER,
            ItemWeaponType.HARPOON,
            ItemWeaponType.LONG_BOW,
            ItemWeaponType.MACE,
            ItemWeaponType.PISTOL,
            ItemWeaponType.RIFLE,
            ItemWeaponType.SCEPTER,
            ItemWeaponType.SHIELD,
            ItemWeaponType.SHORT_BOW,
            ItemWeaponType.SPEARGUN,
            ItemWeaponType.STAFF,
            ItemWeaponType.SWORD,
            ItemWeaponType.TORCH,
            ItemWeaponType.TRIDENT,
            ItemWeaponType.WARHORN,
            ItemWeaponType.UNKNOWN,
            ItemWeaponType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemWeaponType expResult = expResults[index];
                    final ItemWeaponType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemWeaponType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemWeaponDamageType.
     */
    @Test
    public void testFindItemWeaponDamageType() {
        System.out.println("findWeaponDamageType");
        final String[] values = {
            "Fire", // NOI18N.
            "Ice", // NOI18N.
            "Lightning", // NOI18N.
            "Physical", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemWeaponDamageType[] expResults = {
            ItemWeaponDamageType.FIRE,
            ItemWeaponDamageType.ICE,
            ItemWeaponDamageType.LIGHTNING,
            ItemWeaponDamageType.PHYSICAL,
            ItemWeaponDamageType.UNKNOWN,
            ItemWeaponDamageType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemWeaponDamageType expResult = expResults[index];
                    final ItemWeaponDamageType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemWeaponDamageType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemInfusionSlotFlag.
     */
    @Test
    public void testFindItemInfusionSlotFlag() {
        System.out.println("findInfusionSlotFlag");
        final String[] values = {
            "Agony", // NOI18N.
            "Defense", // NOI18N.
            "Offense", // NOI18N.
            "Utility", // NOI18N.
            "", // NOI18N.
            null
        };
        final ItemInfusionSlotFlag[] expResults = {
            ItemInfusionSlotFlag.AGONY,
            ItemInfusionSlotFlag.DEFENSE,
            ItemInfusionSlotFlag.OFFENSE,
            ItemInfusionSlotFlag.UTILITY,
            ItemInfusionSlotFlag.UNKNOWN,
            ItemInfusionSlotFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemInfusionSlotFlag expResult = expResults[index];
                    final ItemInfusionSlotFlag result = EnumValueFactory.INSTANCE.mapEnumValue(ItemInfusionSlotFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemInfixUpgradeAttribute.
     */
    @Test
    public void testFindItemInfixUpgradeAttribute() {
        System.out.println("findInfixUpgradeAttribute");
        final String[] values = {
            "ConditionDamage", // NOI18N.
            "CritDamage", // NOI18N.
            "Healing", // NOI18N.
            "Power", // NOI18N.
            "Precision", // NOI18N.
            "Toughness", // NOI18N.
            "Vitality", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemInfixUpgradeAttribute[] expResults = {
            ItemInfixUpgradeAttribute.CONDITION_DAMAGE,
            ItemInfixUpgradeAttribute.CRIT_DAMAGE,
            ItemInfixUpgradeAttribute.HEALING,
            ItemInfixUpgradeAttribute.POWER,
            ItemInfixUpgradeAttribute.PRECISION,
            ItemInfixUpgradeAttribute.TOUGHNESS,
            ItemInfixUpgradeAttribute.VITALITY,
            ItemInfixUpgradeAttribute.UNKNOWN,
            ItemInfixUpgradeAttribute.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemInfixUpgradeAttribute expResult = expResults[index];
                    final ItemInfixUpgradeAttribute result = EnumValueFactory.INSTANCE.mapEnumValue(ItemInfixUpgradeAttribute.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemUpgradeComponentFlag.
     */
    @Test
    public void testFindItemUpgradeComponentFlag() {
        System.out.println("findUpgradeComponentFlag");
        final String[] values = {
            "Axe", // NOI18N.
            "Dagger", // NOI18N.
            "Focus", // NOI18N.
            "Greatsword", // NOI18N.
            "Hammer", // NOI18N.
            "Harpoon", // NOI18N.
            "LongBow", // NOI18N.
            "Mace", // NOI18N.
            "Pistol", // NOI18N.
            "Rifle", // NOI18N.
            "Scepter", // NOI18N.
            "Shield", // NOI18N.
            "ShortBow", // NOI18N.
            "Speargun", // NOI18N.
            "Staff", // NOI18N.
            "Sword", // NOI18N.
            "Torch", // NOI18N.
            "Trident", // NOI18N.
            "Warhorn", // NOI18N.
            "HeavyArmor", // NOI18N.
            "LightArmor", // NOI18N.
            "MediumArmor", // NOI18N.
            "Trinket", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemUpgradeComponentFlag[] expResults = {
            ItemUpgradeComponentFlag.AXE,
            ItemUpgradeComponentFlag.DAGGER,
            ItemUpgradeComponentFlag.FOCUS,
            ItemUpgradeComponentFlag.GREATSWORD,
            ItemUpgradeComponentFlag.HAMMER,
            ItemUpgradeComponentFlag.HARPOON,
            ItemUpgradeComponentFlag.LONG_BOW,
            ItemUpgradeComponentFlag.MACE,
            ItemUpgradeComponentFlag.PISTOL,
            ItemUpgradeComponentFlag.RIFLE,
            ItemUpgradeComponentFlag.SCEPTER,
            ItemUpgradeComponentFlag.SHIELD,
            ItemUpgradeComponentFlag.SHORT_BOW,
            ItemUpgradeComponentFlag.SPEARGUN,
            ItemUpgradeComponentFlag.STAFF,
            ItemUpgradeComponentFlag.SWORD,
            ItemUpgradeComponentFlag.TORCH,
            ItemUpgradeComponentFlag.TRIDENT,
            ItemUpgradeComponentFlag.WARHORN,
            ItemUpgradeComponentFlag.HEAVY_ARMOR,
            ItemUpgradeComponentFlag.LIGHT_ARMOR,
            ItemUpgradeComponentFlag.MEDIUM_ARMOR,
            ItemUpgradeComponentFlag.TRINKET,
            ItemUpgradeComponentFlag.UNKNOWN,
            ItemUpgradeComponentFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length)
                .forEach(index -> {
                    final String value = values[index];
                    final ItemUpgradeComponentFlag expResult = expResults[index];
                    final ItemUpgradeComponentFlag result = EnumValueFactory.INSTANCE.mapEnumValue(ItemUpgradeComponentFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemUpgradeComponentType.
     */
    @Test
    public void testFindItemUpgradeComponentType() {
        System.out.println("findUpgradeComponentType");
        final String[] values = {
            "Default", // NOI18N.
            "Gem", // NOI18N.
            "Rune", // NOI18N.
            "Sigil", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemUpgradeComponentType[] expResults = {
            ItemUpgradeComponentType.DEFAULT,
            ItemUpgradeComponentType.GEM,
            ItemUpgradeComponentType.RUNE,
            ItemUpgradeComponentType.SIGIL,
            ItemUpgradeComponentType.UNKNOWN,
            ItemUpgradeComponentType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemUpgradeComponentType expResult = expResults[index];
                    final ItemUpgradeComponentType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemUpgradeComponentType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemConsumableType.
     */
    @Test
    public void testFindItemConsumableType() {
        System.out.println("findConsumableType");
        final String[] values = {
            "AppearanceChange", // NOI18N.
            "Booze", // NOI18N.
            "ContractNpc", // NOI18N.
            "Food", // NOI18N.
            "Generic", // NOI18N.
            "Halloween", // NOI18N.
            "Immediate", // NOI18N.
            "Transmutation", // NOI18N.
            "Unlock", // NOI18N.
            "UpgradeRemoval", // NOI18N.
            "Utility", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemConsumableType[] expResults = {
            ItemConsumableType.APPEARANCE_CHANGE,
            ItemConsumableType.BOOZE,
            ItemConsumableType.CONTRACT_NPC,
            ItemConsumableType.FOOD,
            ItemConsumableType.GENERIC,
            ItemConsumableType.HALLOWEEN,
            ItemConsumableType.IMMEDIATE,
            ItemConsumableType.TRANSMUTATION,
            ItemConsumableType.UNLOCK,
            ItemConsumableType.UPGRADE_REMOVAL,
            ItemConsumableType.UTILITY,
            ItemConsumableType.UNKNOWN,
            ItemConsumableType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemConsumableType expResult = expResults[index];
                    final ItemConsumableType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemConsumableType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemConsumableUnlockType.
     */
    @Test
    public void testFindItemConsumableUnlockType() {
        System.out.println("findConsumableUnlockType");
        final String[] values = {
            "BagSlot", // NOI18N.
            "BankTab", // NOI18N.
            "CollectibleCapacity", // NOI18N.
            "Content", // NOI18N.
            "CraftingRecipe", // NOI18N.
            "Dye", // NOI18N.
            "Unknown", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemConsumableUnlockType[] expResults = {
            ItemConsumableUnlockType.BAG_SLOT,
            ItemConsumableUnlockType.BANK_TAB,
            ItemConsumableUnlockType.COLLECTIBLE_CAPACITY,
            ItemConsumableUnlockType.CONTENT,
            ItemConsumableUnlockType.CRAFTING_RECIPE,
            ItemConsumableUnlockType.DYE,
            ItemConsumableUnlockType.OUTFIT,
            ItemConsumableUnlockType.UNKNOWN,
            ItemConsumableUnlockType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemConsumableUnlockType expResult = expResults[index];
                    final ItemConsumableUnlockType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemConsumableUnlockType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemContainerType.
     */
    @Test
    public void testFindItemContainerType() {
        System.out.println("findContainerType");
        final String[] values = {
            "Default", // NOI18N.
            "GiftBox", // NOI18N.
            "OpenUI", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemContainerType[] expResults = {
            ItemContainerType.DEFAULT,
            ItemContainerType.GIFT_BOX,
            ItemContainerType.OPEN_UI,
            ItemContainerType.UNKNOWN,
            ItemContainerType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemContainerType expResult = expResults[index];
                    final ItemContainerType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemContainerType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemGatheringType.
     */
    @Test
    public void testFindItemGatheringType() {
        System.out.println("findGatheringType");
        final String[] values = {
            "Foraging", // NOI18N.
            "Logging", // NOI18N.
            "Mining", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemGatheringType[] expResults = {
            ItemGatheringType.FORAGING,
            ItemGatheringType.LOGGING,
            ItemGatheringType.MINING,
            ItemGatheringType.UNKNOWN,
            ItemGatheringType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemGatheringType expResult = expResults[index];
                    final ItemGatheringType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemGatheringType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemToolType.
     */
    @Test
    public void testFindItemToolType() {
        System.out.println("findToolType");
        final String[] values = {
            "Salvage", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemToolType[] expResults = {
            ItemToolType.SALVAGE,
            ItemToolType.UNKNOWN,
            ItemToolType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemToolType expResult = expResults[index];
                    final ItemToolType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemToolType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemTrinketType.
     */
    @Test
    public void testFindItemTrinketType() {
        System.out.println("findTrinketType");
        final String[] values = {
            "Accessory", // NOI18N.
            "Amulet", // NOI18N.
            "Ring", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemTrinketType[] expResults = {
            ItemTrinketType.ACCESSORY,
            ItemTrinketType.AMULET,
            ItemTrinketType.RING,
            ItemTrinketType.UNKNOWN,
            ItemTrinketType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemTrinketType expResult = expResults[index];
                    final ItemTrinketType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemTrinketType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of ItemGizmoType.
     */
    @Test
    public void testFindItemGizmoType() {
        System.out.println("findGizmoType");
        final String[] values = {
            "ContainerKey", // NOI18N.
            "Default", // NOI18N.
            "RentableContractNpc", // NOI18N.
            "UnlimitedConsumable", // NOI18N.
            null,
            "" // NOI18N.
        };
        final ItemGizmoType[] expResults = {
            ItemGizmoType.CONTAINER_KEY,
            ItemGizmoType.DEFAULT,
            ItemGizmoType.RENTABLE_CONTRACT_NPC,
            ItemGizmoType.UNLIMITED_CONSUMABLE,
            ItemGizmoType.UNKNOWN,
            ItemGizmoType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ItemGizmoType expResult = expResults[index];
                    final ItemGizmoType result = EnumValueFactory.INSTANCE.mapEnumValue(ItemGizmoType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
