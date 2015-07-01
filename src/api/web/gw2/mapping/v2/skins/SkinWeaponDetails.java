/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

/**
 * Defines the weapon details.
 * @author Fabrice Bouyé
 */
public interface SkinWeaponDetails extends SkinDetails {

    /**
     * Gets the type of the weapon.
     * @return A {@code SkinWeaponType} instance, never {@code null}.
     */
    SkinWeaponType getType();

    /**
     * Gets the damage type of the weapon.
     * @return A {@code SkinWeaponDamageType} instance, never {@code null}.
     */
    SkinWeaponDamageType getDamageType();
}
