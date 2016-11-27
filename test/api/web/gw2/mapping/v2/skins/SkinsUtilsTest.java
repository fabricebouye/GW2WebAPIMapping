/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

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
public class SkinsUtilsTest {

    public SkinsUtilsTest() {
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
     * Test of SkinType.
     */
    @Test
    public void testFindSkinType() {
        System.out.println("findSkinType");
        final String[] values = {
            "Armor", // NOI18N.
            "Back", // NOI18N.
            "Weapon", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinType[] expResults = {
            SkinType.ARMOR,
            SkinType.BACK,
            SkinType.WEAPON,
            SkinType.UNKNOWN,
            SkinType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinType expResult = expResults[index];
                    final SkinType result = EnumValueFactory.INSTANCE.mapEnumValue(SkinType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkinFlag.
     */
    @Test
    public void testFindSkinFlag() {
        System.out.println("findSkinFlag");
        final String[] values = {
            "HideIfLocked", // NOI18N.
            "NoCost", // NOI18N.
            "ShowInWardrobe", // NOI18N.
            "OverrideRarity", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinFlag[] expResults = {
            SkinFlag.HIDE_IF_LOCKED,
            SkinFlag.NO_COST,
            SkinFlag.SHOW_IN_WARDROBE,
            SkinFlag.OVERRIDE_RARITY,
            SkinFlag.UNKNOWN,
            SkinFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinFlag expResult = expResults[index];
                    final SkinFlag result = EnumValueFactory.INSTANCE.mapEnumValue(SkinFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkinArmorType.
     */
    @Test
    public void testFindSkinArmorType() {
        System.out.println("findSkinArmorType");
        final String[] values = {
            "Backpack", // NOI18N.
            "Boots", // NOI18N.
            "Coat", // NOI18N.
            "Helm", // NOI18N.
            "HelmAquatic", // NOI18N.
            "Leggings", // NOI18N.
            "Shoulders", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinArmorType[] expResults = {
            SkinArmorType.BACKPACK,
            SkinArmorType.BOOTS,
            SkinArmorType.COAT,
            SkinArmorType.HELM,
            SkinArmorType.HELM_AQUATIC,
            SkinArmorType.LEGGINGS,
            SkinArmorType.SHOULDERS,
            SkinArmorType.UNKNOWN,
            SkinArmorType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinArmorType expResult = expResults[index];
                    final SkinArmorType result = EnumValueFactory.INSTANCE.mapEnumValue(SkinArmorType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkinWeaponType.
     */
    @Test
    public void testFindSkinWeaponType() {
        System.out.println("findSkinWeaponType");
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
            null,
            "" // NOI18N.
        };
        final SkinWeaponType[] expResults = {
            SkinWeaponType.AXE,
            SkinWeaponType.DAGGER,
            SkinWeaponType.FOCUS,
            SkinWeaponType.GREATSWORD,
            SkinWeaponType.HAMMER,
            SkinWeaponType.HARPOON,
            SkinWeaponType.LONG_BOW,
            SkinWeaponType.MACE,
            SkinWeaponType.PISTOL,
            SkinWeaponType.RIFLE,
            SkinWeaponType.SCEPTER,
            SkinWeaponType.SHIELD,
            SkinWeaponType.SHORT_BOW,
            SkinWeaponType.SPEARGUN,
            SkinWeaponType.STAFF,
            SkinWeaponType.SWORD,
            SkinWeaponType.TORCH,
            SkinWeaponType.TRIDENT,
            SkinWeaponType.UNKNOWN,
            SkinWeaponType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinWeaponType expResult = expResults[index];
                    final SkinWeaponType result = EnumValueFactory.INSTANCE.mapEnumValue(SkinWeaponType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkinArmorWeightClass.
     */
    @Test
    public void testFindSkinArmorWeightClass() {
        System.out.println("findSkinArmorWeightClass");
        final String[] values = {
            "Heavy", // NOI18N.
            "Light", // NOI18N.
            "Medium", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinArmorWeightClass[] expResults = {
            SkinArmorWeightClass.HEAVY,
            SkinArmorWeightClass.LIGHT,
            SkinArmorWeightClass.MEDIUM,
            SkinArmorWeightClass.UNKNOWN,
            SkinArmorWeightClass.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinArmorWeightClass expResult = expResults[index];
                    final SkinArmorWeightClass result = EnumValueFactory.INSTANCE.mapEnumValue(SkinArmorWeightClass.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkinWeaponDamageType.
     */
    @Test
    public void testFindSkinWeaponDamageType() {
        System.out.println("findSkinWeaponDamageType");
        final String[] values = {
            "Fire", // NOI18N.
            "Ice", // NOI18N.
            "Lightning", // NOI18N.
            "Physical", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinWeaponDamageType[] expResults = {
            SkinWeaponDamageType.FIRE,
            SkinWeaponDamageType.ICE,
            SkinWeaponDamageType.LIGHTNING,
            SkinWeaponDamageType.PHYSICAL,
            SkinWeaponDamageType.UNKNOWN,
            SkinWeaponDamageType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinWeaponDamageType expResult = expResults[index];
                    final SkinWeaponDamageType result = EnumValueFactory.INSTANCE.mapEnumValue(SkinWeaponDamageType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SkinRarity.
     */
    @Test
    public void testFindSkinRarity() {
        System.out.println("findSkinRarity");
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
        final SkinRarity[] expResults = {
            SkinRarity.ASCENDED,
            SkinRarity.BASIC,
            SkinRarity.EXOTIC,
            SkinRarity.FINE,
            SkinRarity.JUNK,
            SkinRarity.LEGENDARY,
            SkinRarity.MASTERWORK,
            SkinRarity.RARE,
            SkinRarity.UNKNOWN,
            SkinRarity.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinRarity expResult = expResults[index];
                    final SkinRarity result = EnumValueFactory.INSTANCE.mapEnumValue(SkinRarity.class, value);
                    assertEquals(expResult, result);
                });
    }
}
