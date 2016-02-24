/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

import api.web.gw2.mapping.core.EnumValueFactory;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Defines all recipe crafting disciplines.
 * @author Fabrice Bouyé
 */
public class RecipesUtilsTest {

    public RecipesUtilsTest() {
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
     * Test of RecipeType.
     */
    @Test
    public void testFindRecipeType() {
        System.out.println("findRecipeType");
        final String[] values = {
            "Accessory", // NOI18N.
            "Amulet", // NOI18N.
            "Axe", // NOI18N.
            "Backpack", // NOI18N.
            "Bag", // NOI18N.
            "Boots", // NOI18N.
            "Bulk", // NOI18N.
            "Coat", // NOI18N.
            "Component", // NOI18N.
            "Consumable", // NOI18N.
            "Dagger", // NOI18N.
            "Dessert", // NOI18N.
            "Dye", // NOI18N.
            "Feast", // NOI18N.
            "Focus", // NOI18N.
            "Gloves", // NOI18N.
            "Greatsword", // NOI18N.
            "Hammer", // NOI18N.
            "Harpoon", // NOI18N.
            "Helm", // NOI18N.
            "IngredientCooking", // NOI18N.
            "Inscription", // NOI18N.
            "Insignia", // NOI18N.
            "Leggings", // NOI18N.
            "LongBow", // NOI18N.
            "Mace", // NOI18N.
            "Meal", // NOI18N.
            "Pistol", // NOI18N.
            "Potion", // NOI18N.
            "Refinement", // NOI18N.
            "RefinementEctoplasm", // NOI18N.
            "RefinementObsidian", // NOI18N.
            "Rifle", // NOI18N.
            "Ring", // NOI18N.
            "Scepter", // NOI18N.
            "Seasoning", // NOI18N.
            "Shield", // NOI18N.
            "ShortBow", // NOI18N.
            "Shoulders", // NOI18N.
            "Snack", // NOI18N.
            "Soup", // NOI18N.
            "Speargun", // NOI18N.
            "Staff", // NOI18N.
            "Sword", // NOI18N.
            "Torch", // NOI18N.
            "Trident", // NOI18N.
            "UpgradeComponent", // NOI18N.
            "Warhorn", // NOI18N.
            null,
            "" // NOI18N.
        };
        final RecipeType[] expResults = {
            RecipeType.ACCESSORY,
            RecipeType.AMULET,
            RecipeType.AXE,
            RecipeType.BACKPACK,
            RecipeType.BAG,
            RecipeType.BOOTS,
            RecipeType.BULK,
            RecipeType.COAT,
            RecipeType.COMPONENT,
            RecipeType.CONSUMABLE,
            RecipeType.DAGGER,
            RecipeType.DESSERT,
            RecipeType.DYE,
            RecipeType.FEAST,
            RecipeType.FOCUS,
            RecipeType.GLOVES,
            RecipeType.GREATSWORD,
            RecipeType.HAMMER,
            RecipeType.HARPOON,
            RecipeType.HELM,
            RecipeType.INGREDIENT_COOKING,
            RecipeType.INSCRIPTION,
            RecipeType.INSIGNIA,
            RecipeType.LEGGINGS,
            RecipeType.LONG_BOW,
            RecipeType.MACE,
            RecipeType.MEAL,
            RecipeType.PISTOL,
            RecipeType.POTION,
            RecipeType.REFINEMENT,
            RecipeType.REFINEMENT_ECTOPLASM,
            RecipeType.REFINEMENT_OBSIDIAN,
            RecipeType.RIFLE,
            RecipeType.RING,
            RecipeType.SCEPTER,
            RecipeType.SEASONING,
            RecipeType.SHIELD,
            RecipeType.SHORT_BOW,
            RecipeType.SHOULDERS,
            RecipeType.SNACK,
            RecipeType.SOUP,
            RecipeType.SPEARGUN,
            RecipeType.STAFF,
            RecipeType.SWORD,
            RecipeType.TORCH,
            RecipeType.TRIDENT,
            RecipeType.UPGRADE_COMPONENT,
            RecipeType.WARHORN,
            RecipeType.UNKNOWN,
            RecipeType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final RecipeType expResult = expResults[index];
                    final RecipeType result = EnumValueFactory.INSTANCE.mapEnumValue(RecipeType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of RecipeFlag.
     */
    @Test
    public void testFindRecipeFlag() {
        System.out.println("findRecipeFlag");
        final String[] values = {
            "AutoLearned", // NOI18N.
            "LearedFromItem", // NOI18N.
            null,
            "" // NOI18N.
        };
        final RecipeFlag[] expResults = {
            RecipeFlag.AUTO_LEARNED,
            RecipeFlag.LEARNED_FROM_ITEM,
            RecipeFlag.UNKNOWN,
            RecipeFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final RecipeFlag expResult = expResults[index];
                    final RecipeFlag result = EnumValueFactory.INSTANCE.mapEnumValue(RecipeFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of RecipeCraftingDiscipline.
     */
    @Test
    public void testFindRecipeCraftingDiscipline() {
        System.out.println("findRecipeCraftingDiscipline");
        final String[] values = {
            "Armorsmith", // NOI18N.
            "Artificer", // NOI18N.
            "Chef", // NOI18N.
            "Huntsman", // NOI18N.
            "Jeweler", // NOI18N.
            "Leatherworker", // NOI18N.
            "Tailor", // NOI18N.
            "Weaponsmith", // NOI18N.
            "Scribe", // NOI18N.
            null,
            "" // NOI18N.
        };
        final RecipeCraftingDiscipline[] expResults = {
            RecipeCraftingDiscipline.ARMORSMITH,
            RecipeCraftingDiscipline.ARTIFICER,
            RecipeCraftingDiscipline.CHEF,
            RecipeCraftingDiscipline.HUNTSMAN,
            RecipeCraftingDiscipline.JEWELER,
            RecipeCraftingDiscipline.LEATHERWORKER,
            RecipeCraftingDiscipline.TAILOR,
            RecipeCraftingDiscipline.WEAPONSMITH,
            RecipeCraftingDiscipline.SCRIBE,
            RecipeCraftingDiscipline.UNKNOWN,
            RecipeCraftingDiscipline.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final RecipeCraftingDiscipline expResult = expResults[index];
                    final RecipeCraftingDiscipline result = EnumValueFactory.INSTANCE.mapEnumValue(RecipeCraftingDiscipline.class, value);
                    assertEquals(expResult, result);
                });
    }

}
