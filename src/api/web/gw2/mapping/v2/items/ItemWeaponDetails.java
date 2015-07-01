/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.OptionalValue;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author FabriceB
 */
public interface ItemWeaponDetails {

    /**
     * Gets the type of this weapon.
     * @return An {@code ItemWeaponType} instance, never {@code null}.
     */
    ItemWeaponType getType();

    /**
     * Gets the damage type of this weapon.
     * @return An {@code ItemDamageType} instance, never {@code null}.
     */
    ItemWeaponDamageType getDamageType();

    /**
     * Gets the min power of this weapon.
     * @return An {@code int}.
     */
    int getMinPower();

    /**
     * Gets the max power of this weapon.
     * @return An {@code int}.
     */
    int getMaxPower();

    /**
     * Gets the defense value of this weapon.
     * @return An {@code int}
     */
    int getDefense();

    /**
     * Gets the list of infusions on this weapon.
     * @return A non-modifiable {@code List<ItemInfusionSlot>} instance, never {@code null}.
     */
    List<ItemInfusionSlot> getInfusionSlots();

    /**
     * Gets the infix upgrade on this weapon.
     * @return An {@code Optional<ItemInfixUpgrade>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ItemInfixUpgrade> getInfixUpgrade();

    /**
     * Gets the ide of the suffix item (ie: sigil) on this weapon.
     * @return An {@code int}.
     */
    int getSuffixItemId();

    /**
     * Gets the id of the secondary suffix item on this armor.
     * @return A {@code String} instance, never {@code null}.
     */
    String getSecondarySuffixItemId();
}
