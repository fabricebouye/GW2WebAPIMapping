/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

/**
 * Defines the armor details.
 * @author Fabrice Bouyé
 */
public interface SkinArmorDetails extends SkinDetails {

    /**
     * Gets the type of the armor.
     * @return A {@code SkinArmorType} instance, never {@code null}.
     */
    SkinArmorType getType();

    /**
     * Gets the weight of the armor.
     * @return A {@code SkinArmorWeightClass} instance, never {@code null}.
     */
    SkinArmorWeightClass getWeightClass();
}
