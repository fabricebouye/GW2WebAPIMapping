/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

import api.web.gw2.mapping.core.CraftingLevelValue;
import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import java.time.Duration;
import java.util.Set;

/**
 * Defines a recipe.
 * @author Fabrice Bouyé
 */
public interface Recipe {

    /**
     * Gets the id of this recipe.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the type of this recipe.
     * @return A {@code RecipeType} instance, never {@code null}.
     */
    RecipeType getType();

    /**
     * Gets the id of the item produced by this recipe.
     * @return An {@code int}.
     */
    @IdValue
    int getOutputItemId();

    /**
     * Gets the quantity of the item produced by this recipe.
     * @return An {@code int}.
     */
    @QuantityValue
    int getOutputItemCount();

    /**
     * Gets the time in milliseconds to craft this recipe.
     * @return A {@code Duration} instance, never {@code null}.
     */
    @DurationValue(flavor = DurationValue.Flavor.MILLIS)
    Duration getTimeToCraftMs();

    /**
     * Gets a set of all crafting disciplines for this recipe.
     * @return A non-modifiable {@code Set<RecipeCraftingDiscipline>} instance, never {@code null}.
     */
    @SetValue
    Set<RecipeCraftingDiscipline> getDisciplines();

    /**
     * Gets the minimum level required to craft this recipe.
     * @return An {@code int}.
     */
    @CraftingLevelValue
    int getMinRating();

    /**
     * Gets a set of all flags for this recipe.
     * @return A non-modifiable {@code Set<RecipeFlag>} instance, never {@code null}.
     */
    @SetValue
    Set<RecipeFlag> getFlags();

    /**
     * Gets a set of all ingredients for this recipe.
     * @return A non-modifiable {@code Set<RecipeIngredient>} instance, never {@code null}.
     */
    @SetValue
    Set<RecipeIngredient> getIngredients();

    /**
     * Gets the chat link for this recipe.
     * @return  A {@code String} instance, never {@code null}.
     */
    String getChatLink();
}
