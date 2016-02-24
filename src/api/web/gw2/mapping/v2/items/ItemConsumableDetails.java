/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
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
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;
import java.util.Optional;
import java.util.OptionalInt;

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
}
