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
}
