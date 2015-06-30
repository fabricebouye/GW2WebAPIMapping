/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

/**
 * Default implementation of a skin armor details.
 * @author Fabrice Bouyé
 */
final class DefaultSkinArmorDetails implements SkinArmorDetails {

    SkinArmorType type = SkinArmorType.UNKNOWN;
    SkinWeightClass weightClass = SkinWeightClass.UNKNOWN;

    /**
     * Creates a new empty instance.
     */
    DefaultSkinArmorDetails() {
    }

    @Override
    public SkinArmorType getType() {
        return type;
    }

    @Override
    public SkinWeightClass getWeightClass() {
        return weightClass;
    }
}
