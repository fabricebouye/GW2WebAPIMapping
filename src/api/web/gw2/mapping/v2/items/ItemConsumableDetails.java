/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines an item consumable details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemConsumableDetails extends ItemDetails {

    /**
     * Gets the type of this consumable.
     * @return An {@code ItemConsumableType} instance, never {@code null}.
     */
    ItemConsumableType getType();

    /**
     * Gets the description of this consumable.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @LocalizedResource
    Optional<String> getDescription();

    /**
     * Gets the duration of this consumable in milliseconds.
     * @return An {@code Optional<Duration>} instance, never {@code null}.
     */
    @OptionalValue
    @DurationValue(flavor = DurationValue.Flavor.MILLIS)
    Optional<Duration> getDurationMs();

    /**
     * Gets the unlock type of this consumable.
     * @return An {@code Optional<ItemConsumableUnlockType>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ItemConsumableUnlockType> getUnlockType();

    /**
     * Gets the color id of this consumable.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getColorId();

    /**
     * Gets the recipe id of this consumable.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getRecipeId();

    /**
     * Gets the number of charges applied by this consumable.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getApplyCount();

    /**
     * Gets the i18n name of the effect applied by this consumable.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @LocalizedResource
    Optional<String> getName();

    /**
     * Gets the icon of the effect applied by this consumable.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the list of skins applied by this consumable (supported by some skin that act as transmutation charges).
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}; may be empty.
     */
    @SetValue
    @IdValue
    Set<Integer> getSkins();
}
