/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of a recipe.
 * @author Fabrice Bouyé
 */
final class DefaultRecipe implements Recipe {

    int id = -1;
    RecipeType type = RecipeType.UNKNOWN;
    int outputItemId = -1;
    int outputItemCount = -1;
    long timeToCraftMs = -1;
    Set<RecipeCraftingDiscipline> disciplines = Collections.EMPTY_SET;
    int minRating = -1;
    Set<RecipeFlag> flags = Collections.EMPTY_SET;
    Set<RecipeIngredient> ingredients = Collections.EMPTY_SET;

    /**
     * Creates a new empty instance.
     */
    DefaultRecipe() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public RecipeType getType() {
        return type;
    }

    @Override
    public int getOutputItemId() {
        return outputItemId;
    }

    @Override
    public int getOutputItemCount() {
        return outputItemCount;
    }

    @Override
    public long getTimeToCraftMs() {
        return timeToCraftMs;
    }

    @Override
    public Set<RecipeCraftingDiscipline> getDisciplines() {
        return disciplines;
    }

    @Override
    public int getMinRating() {
        return minRating;
    }

    @Override
    public Set<RecipeFlag> getFlags() {
        return flags;
    }

    @Override
    public Set<RecipeIngredient> getIngredients() {
        return ingredients;
    }
}
