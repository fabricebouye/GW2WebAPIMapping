/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Defines an item upgrade component details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemUpgradeComponentDetails extends ItemDetails {

    /**
     * Gets the type of this upgrade component.
     * @return A {@code ItemUpgradeComponentType} instance, never {@code null}.
     */
    ItemUpgradeComponentType getType();

    /**
     * Gets the set of flags on this upgrade component.
     * @return A non-modifiable {@code Set<ItemUpgradeComponentFlag>} instance, never {@code null}.
     */
    @SetValue
    Set<ItemUpgradeComponentFlag> getFlags();

    /**
     * Gets the set of infusion flags on this upgrade component.
     * @return A non-modifiable {@code Set<ItemInfusionSlotFlag>} instance, never {@code null}.
     */
    @SetValue
    Set<ItemInfusionSlotFlag> getInfusionUpgradeFlags();

    /**
     * Gets the suffix of this upgrade component.
     * @return A {@code String} instance, never {@code null}.
     */
    String getSuffix();

    /**
     * Gets the infix upgrade on this upgrade component.
     * @return An {@code ItemInfixUpgrade} instance, never {@code null}.
     */
    ItemInfixUpgrade getInfixUpgrade();

    /**
     * Gets the list of bonuses on this upgrade component.
     * @return A non-modifiable {@code List<String>} instance, never {@code null}; non-modifiable.
     */
    @ListValue
    List<String> getBonuses();
}
