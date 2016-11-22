/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.inventory.InventoryBag;
import api.web.gw2.mapping.v2.characters.equipment.Equipment;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
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
    @IdValue(flavor = IdValue.Flavor.STRING)
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
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    ZonedDateTime getCreated();

    /**
     * Gets the age of this character (the amount of second the character was played).
     * @return A {@code long}.
     */
    @DurationValue
    Duration getAge();

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
    @ListValue
    Optional<List<Equipment>> getEquipment();

    /**
     * Gets the inventory bags of this character.
     * @return An {@code Optional<List<Bag>>} instance, never {@code null}:
     * <br>If present, the list is non-modifiable and may be empty.
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#INVENTORIES
     */
    @OptionalValue
    @ListValue
    Optional<List<InventoryBag>> getBags();

    /**
     * Gets the crafting disciplines of this character.
     * @return An {@code Optional<Set<CharacterCrafting>>} instance, never {@code null}:
     * <br>If present, the set is non-modifiable and may be empty.
     */
    @OptionalValue
    @SetValue
    Optional<Set<CharacterCrafting>> getCrafting();

    /**
     * Gets the specialization of this character.
     * @return An {@code Optional<Map<CharacterGameType, Set<CharacterSpecialization>>>} instance, never {@code null}:
     * <br>If present, the map is non-modifiable and may be empty.
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#BUILDS
     */
    @OptionalValue
    @MapValue
    @SetValue
    Optional<Map<CharacterGameType, Set<CharacterSpecialization>>> getSpecializations();

    /**
     * Gets the training of this character.
     * @return An {@code Optional<Set<CharacterTraining>>} instance, never {@code null}:
     * <br>If present, the set is non-modifiable and may be empty.
     */
    @OptionalValue
    @MapValue
    @SetValue
    Optional<Set<CharacterTraining>> getTraining();

    /**
     * Gets the recipes known to this character.
     * @return An {@code Optional<Set<Integer>>} instance, never {@code null}:
     * <br>If present, the set is non-modifiable and may be empty.
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#INVENTORIES
     */
    @OptionalValue
    @SetValue
    @IdValue
    Optional<Set<Integer>> getRecipes();

    /**
     * Gets the utility and profession skills of this character.
     * @return An {@code Optional<Map<CharacterGameType, CharacterSkillSet>>} instance, never {@code null}:
     * <br>If present, the map is non-modifiable and may be empty.
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#BUILDS
     */
    @OptionalValue
    @MapValue
    Optional<Map<CharacterGameType, CharacterSkillSet>> getSkills();

    /** 
     * Gets the ids of the answers to this character's backstory.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.backstory.answers.BackstoryAnswer#getId() 
     */
    @SetValue
    @IdValue
    Set<Integer> getBackstory();

    /**
     * Gets the id of this character's title.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.titles.Title#getId() 
     */
    @OptionalValue
    @IdValue
    OptionalInt getTitle();

    @OptionalValue
    Optional<CharacterEquipmentPvP> getEquipmentPvp();

    /** 
     * Gets the WvW abilities of this character's.
     * @return A non-modifiable {@code Set<CharacterAbility>} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.wvw.abilities.Ability
     */
    @SetValue
    Set<CharacterAbility> getWvwAbilities();
}
