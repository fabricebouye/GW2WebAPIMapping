/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

/**
 * Default implementation of a skin weapon details.
 * @author Fabrice Bouyé
 */
final class DefaultSkinWeaponDetails implements SkinWeaponDetails {

    SkinWeaponType type = SkinWeaponType.UNKNOWN;
    SkinWeaponDamageType damageType = SkinWeaponDamageType.UNKNOWN;

    /**
     * Creates a new empty instance.
     */
    DefaultSkinWeaponDetails() {
    }

    @Override
    public SkinWeaponType getType() {
        return type;
    }

    @Override
    public SkinWeaponDamageType getDamageType() {
        return damageType;
    }
}
