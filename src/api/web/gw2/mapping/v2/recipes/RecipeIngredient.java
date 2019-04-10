/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

/**
 * Defines a recipe ingredient.
 * @author Fabrice Bouyé
 */
public interface RecipeIngredient {

    /**
     * Gets the id of the item in this recipe's ingredient.
     * @return An {@code int}
     */
    int getItemId();

    /**
     * Gets the quantity of the item in this recipe's ingredient.
     * @return An {@code int}
     */
    int getCount();
}
