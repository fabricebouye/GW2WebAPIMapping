/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.inventory.InventoryBag;
import api.web.gw2.mapping.v2.characters.equipment.Equipment;
import api.web.gw2.mapping.v2.specializations.Specialization;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Defines a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true, scope = "characters") // NOI18N.
public interface Character {

    /**
     * Gets the name of this character.
     * @return A {@code String}, never {@code null}.
     */
    String getName();

    /**
     * Gets the race of this character.
     * @return A {@code CharacterRace} instance, never {@code null}.
     */
    CharacterRace getRace();

    /**
     * Gets the profession of this character.
     * @return A {@code CharacterProfession} instance, never {@code null}.
     */
    CharacterProfession getProfession();

    /**
     * Gets the gender of this character.
     * @return A {@code CharacterGender} instance, never {@code null}.
     */
    CharacterGender getGender();

    /**
     * Gets the level of this character.
     * @return An {@code int} &ge; 1 and &le; 80.
     */
    @LevelValue
    int getLevel();

    /**
     * Gets the id of the guild of this character.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    Optional<String> getGuild();

    /**
     * Gets the creation date of this character.
     * @return A {@code LocalDate} instance, never {@code null}.
     */
    LocalDate getCreated();

    /**
     * Gets the age of this character (the amount of second the character was played).
     * @return A {@code long}.
     */
    @DurationValue
    long getAge();

    /**
     * Gets the number of deaths of this character.
     * @return An {@code in}.
     */
    @QuantityValue
    int getDeaths();

    /**
     * Gets the equipment of this character.
     * @return An {@code Optional<List<Equipment>>} instance, never {@code null}:
     * <br>If present, the list is non-modifiable and may be empty.
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#BUILDS
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#INVENTORIES
     */
    @OptionalValue
    Optional<List<Equipment>> getEquipment();

    /**
     * Gets the inventory bags of this character.
     * @return An {@code Optional<List<Bag>>} instance, never {@code null}:
     * <br>If present, the list is non-modifiable and may be empty.
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#INVENTORIES
     */
    @OptionalValue
    Optional<List<InventoryBag>> getBags();

    /**
     * Gets the crafting disciplines of this character.
     * @return An {@code Optional<Set<CharacterCrafting>>} instance, never {@code null}:
     * <br>If present, the set is non-modifiable and may be empty.
     */
    @OptionalValue
    Optional<Set<CharacterCrafting>> getCrafting();

    /**
     * Gets the specialization of this character.
     * @return An {@code Optional<Map<CharacterGameType, Specialization>>} instance, never {@code null}:
     * <br>If present, the map is non-modifiable and may be empty.
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#BUILDS
     */
    @OptionalValue
    Optional<Map<CharacterGameType, Specialization>> getSpecialisations();
}
