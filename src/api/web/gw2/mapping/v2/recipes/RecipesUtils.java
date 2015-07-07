/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for recipes.
 * @author Fabrice Bouyé
 */
public enum RecipesUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the recipe type for given value.
     * @param value The source value.
     * @return A {@code RecipeType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code RecipeType.UNKNOWN} is returned.
     * @see RecipeType
     */
    public static RecipeType findRecipeType(final String value) {
        final Optional<RecipeType> resultOptional = Arrays.stream(RecipeType.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final RecipeType result = resultOptional.isPresent() ? resultOptional.get() : RecipeType.UNKNOWN;
        return result;
    }

    /**
     * Gets the recipe flag for given value.
     * @param value The source value.
     * @return A {@code RecipeFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code RecipeFlag.UNKNOWN} is returned.
     * @see RecipeFlag
     */
    public static RecipeFlag findRecipeFlag(final String value) {
        final Optional<RecipeFlag> resultOptional = Arrays.stream(RecipeFlag.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final RecipeFlag result = resultOptional.isPresent() ? resultOptional.get() : RecipeFlag.UNKNOWN;
        return result;
    }
    
    /**
     * Gets the recipe crafting discipline for given value.
     * @param value The source value.
     * @return A {@code RecipeCraftingDiscipline} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code RecipeCraftingDiscipline.UNKNOWN} is returned.
     * @see RecipeCraftingDiscipline
     */
    public static RecipeCraftingDiscipline findRecipeCraftingDiscipline(final String value) {
        final Optional<RecipeCraftingDiscipline> resultOptional = Arrays.stream(RecipeCraftingDiscipline.values())
                .filter(toTest -> value != null && value.equals(toTest.value))
                .findFirst();
        final RecipeCraftingDiscipline result = resultOptional.isPresent() ? resultOptional.get() : RecipeCraftingDiscipline.UNKNOWN;
        return result;
    }
}
