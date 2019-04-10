/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.equipment;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Defines the equipment of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/equipment", requiresAuthentication = true, scope = {"inventories", "builds"}) // NOI18N.
public interface CharacterEquipment {

    /**
     * Gets the Id of this equipment.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the slot of this equipment.
     * @return An {@code CharacterEquipmentSlot} instance, never {@code null}.
     */
    CharacterEquipmentSlot getSlot();

    /**
     * Gets the list of upgrades ids on this equipment.
     * @return A non-modifiable {@code List<Integer>} instance, never {@code null}; may be empty.
     */
    @IdValue
    @ListValue
    List<Integer> getUpgrades();

    /**
     * Gets the list of infusions ids on this equipment.
     * @return A non-modifiable {@code List<Integer>} instance, never {@code null}; may be empty.
     */
    @IdValue
    @ListValue
    List<Integer> getInfusions();

    /**
     * Gets the skin id of this equipment.
     * @return An {@code int}.
     */
    @IdValue
    int getSkin();

    /**
     * Gets the stats of this equipment.
     * @return An {@code Optional<CharacterEquipmentStats>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<CharacterEquipmentStats> getStats();

    /**
     * Gets the binding state of this equipment.
     * @return An {@code Optional<CharacterEquipmentBinding>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<CharacterEquipmentBinding> getBinding();

    /**
     * Gets the name of the character this equipment is bound to.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue(flavor = IdValue.Flavor.STRING)
    Optional<String> getBoundTo();

    /**
     * Gets the number of charges for this equipment (mainly for gathering tools).
     * @return An {@code OptionalInt} instance, never {@code null}:
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getCharges();
}
