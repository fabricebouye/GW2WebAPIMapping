/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Defines a weapon details.
 * @author Fabrice Bouyé
 */
public interface ItemWeaponDetails extends ItemDetails {

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
    @QuantityValue
    int getMinPower();

    /**
     * Gets the max power of this weapon.
     * @return An {@code int}.
     */
    @QuantityValue
    int getMaxPower();

    /**
     * Gets the defense value of this weapon.
     * @return An {@code int}
     */
    @QuantityValue
    int getDefense();

    /**
     * Gets the list of infusions on this weapon.
     * @return A non-modifiable {@code List<ItemInfusionSlot>} instance, never {@code null}.
     */
    @ListValue
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
    @IdValue
    int getSuffixItemId();

    /**
     * Gets the id of the secondary suffix item on this weapon.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getSecondarySuffixItemId();

    /**
     * Gets the available stats choices for this weapon.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}. 
     * <br>May be empty if no stat choice is available.
     * @see api.web.gw2.mapping.v2.itemstats
     */
    @SetValue
    @IdValue
    Set<Integer> getStatsChoices();
}
