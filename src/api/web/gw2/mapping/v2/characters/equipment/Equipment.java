/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.equipment;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Optional;

/**
 * Defines the equipment of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/<name>/equipment", requiresAuthentication = true, scope = {"inventories", "builds"}) // NOI18N.
public interface Equipment {

    /**
     * Gets the Id of this equipment.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the slot of this equipment.
     * @return An {@code EquipmentSlot} instance, never {@code null}.
     */
    EquipmentSlot getSlot();

    /**
     * Gets the list of upgrades ids on this equipment.
     * @return An {@code Optional<List<Integer>>} instance, never {@code null}:
     * If present, the list is non-modifiable and may be empty.
     */
    @OptionalValue
    @IdValue
    @ListValue
    Optional<List<Integer>> getUpgrades();

    /**
     * Gets the list of infusions ids on this equipment.
     * @return An {@code Optional<List<Integer>>} instance, never {@code null}:
     * If present, the list is non-modifiable and may be empty.
     */
    @OptionalValue
    @IdValue
    @ListValue
    Optional<List<Integer>> getInfusions();

    /**
     * Gets the skin id of this equipment.
     * @return An {@code int}.
     */
    @IdValue
    int getSkin();

    @OptionalValue
    Optional<EquipmentStats> getStats();

    @OptionalValue
    Optional<EquipmentBinding> getBinding();

    @OptionalValue
    @IdValue(flavor = IdValue.Flavor.STRING)
    Optional<String> getBoundTo();
}
