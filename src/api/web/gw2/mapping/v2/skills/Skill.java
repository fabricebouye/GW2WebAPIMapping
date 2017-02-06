/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterProfession;
import api.web.gw2.mapping.v2.items.ItemWeaponType;
import api.web.gw2.mapping.v2.professions.ProfessionElementalistAttunement;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines a skill.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills") // NOI18N.
public interface Skill {

    /**
     * Gets the id of this skill.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this skill.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the i18n description of this skill.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @LocalizedResource
    @OptionalValue
    Optional<String> getDescription();

    /**
     * Gets the URL to the icon of this skill.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the chat link of this skill.
     * @return A {@code String} instance, never {@code null}.
     */
    String getChatLink();

    /**
     * Gets the type of this skill.
     * @return A {@code SkillType} instance, never {@code null}.
     */
    SkillType getType();

    /**
     * Gets the weapon type of this skill.
     * @return A {@code SkillWeaponType} instance, never {@code null}.
     */
    SkillWeaponType getWeaponType();

    /**
     * Gets the set of professions which can use this skill.
     * @return A {@code Set<CharacterProfession>} instance, never {@code null}.
     */
    @SetValue
    Set<CharacterProfession> getProfessions();

    /**
     * Gets the slot of this skill.
     * @return A {@code SkillSlot} instance, never {@code null}.
     */
    SkillSlot getSlot();

    /**
     * Gets facts about this skill.
     * @return A non-modifiable {@code Set<SkillFact>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<SkillFact> getFacts();

    /**
     * Gets traited facts about this skill.
     * @return A non-modifiable {@code Set<TraitedFacts>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<SkillTraitedFact> getTraitedFacts();

    /**
     * Gets the categories of this skill.
     * @return A non-modifiable {@code Set<SkillCategory>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<SkillCategory> getCategories();

    /**
     * Gets the elemental attunement of this skill (Elementalist).
     * @return An {@code Optional<ProfessionElementalistAttunement>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ProfessionElementalistAttunement> getAttunement();

    /**
     * Gets the energy cost of this skill (Revenant).
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @QuantityValue
    @OptionalValue
    OptionalInt getCost();

    /**
     * Indicates the type of weapon that needs to be wielded for this skill to appear.
     * @return An {@code Optional<ItemWeaponType>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ItemWeaponType> getDualWield();

    /**
     * Gets the initiative cost of flip over skill (Engineer's toolkits, Revenant's facets).
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    OptionalInt getFlipSkill();

    /**
     * Gets the initiative cost of this skill (Thief).
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @QuantityValue
    @OptionalValue
    OptionalInt getInitiative();

    /**
     * Gets the id of the next skill in this skill's attack chain.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    OptionalInt getNextChain();

    /**
     * Gets the id of the previous skill in this skill's attack chain.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    OptionalInt getPrevChain();

    /**
     * Gets the ids of transformations skills granted by this skill (shrouds & avatar states and other transformations).
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}; may be empty.
     */
    @IdValue
    @SetValue
    Set<Integer> getTransformSkills();

    /**
     * Gets the ids of bundle skills granted by this skill  (Engineer and other environmental weapons).
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}; may be empty.
     */
    @IdValue
    @SetValue
    Set<Integer> getBundleSkills();

    /**
     * Gets the id of the toolbelt skills granted by this skill (Engineer).
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    OptionalInt getToolbeltSkill();

    /**
     * Gets the flags on this skill.
     * @return A non-modifiable {@code Set<?>}, never {@code null}; may be empty.
     */
    @SetValue
    Set<?> getFlags();
}
