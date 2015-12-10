/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.v2.characters.inventory.InventoryBag;
import api.web.gw2.mapping.v2.characters.equipment.Equipment;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Default implementation of a character.
 * @author Fabrice Bouyé
 */
final class DefaultCharacter implements Character {

    String name = "";
    CharacterRace race = CharacterRace.UNKNOWN;
    CharacterProfession profession = CharacterProfession.UNKNOWN;
    CharacterGender gender = CharacterGender.UNKNOWN;
    int level = 0;
    Optional<String> guild = Optional.empty();
    ZonedDateTime created = DateValue.DEFAULT;
    long age = 0;
    int deaths = 0;
    Optional<List<Equipment>> equipment = Optional.empty();
    Optional<List<InventoryBag>> bags = Optional.empty();
    Optional<Set<CharacterCrafting>> crafting = Optional.empty();
    Optional<Map<CharacterGameType, CharacterSpecialization>> specializations = Optional.empty();

    /**
     * Creates a new empty instance.
     */
    DefaultCharacter() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CharacterRace getRace() {
        return race;
    }

    @Override
    public CharacterProfession getProfession() {
        return profession;
    }

    @Override
    public CharacterGender getGender() {
        return gender;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public Optional<String> getGuild() {
        return guild;
    }

    @Override
    public ZonedDateTime getCreated() {
        return created;
    }

    @Override
    public long getAge() {
        return age;
    }

    @Override
    public int getDeaths() {
        return deaths;
    }

    @Override
    public Optional<List<Equipment>> getEquipment() {
        return equipment;
    }

    @Override
    public Optional<List<InventoryBag>> getBags() {
        return bags;
    }

    @Override
    public Optional<Set<CharacterCrafting>> getCrafting() {
        return crafting;
    }

    @Override
    public Optional<Map<CharacterGameType, CharacterSpecialization>> getSpecialisations() {
        return specializations;
    }

}
