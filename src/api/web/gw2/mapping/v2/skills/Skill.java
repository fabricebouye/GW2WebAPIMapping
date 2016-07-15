/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
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
     * Gets the localized name of this skill.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized description of this skill.
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

    @OptionalValue
    @SetValue
    Optional<Set<SkillFact>> getFacts();

    @OptionalValue
    @SetValue
    Optional<Set<SkillTraitedFact>> getTraitedFacts();

    @OptionalValue
    @SetValue
    Optional<Set<SkillCategory>> getCategories();

    @OptionalValue
    Optional<ProfessionElementalistAttunement> getAttunement();

    @OptionalValue
    @QuantityValue
    OptionalInt getCost();

    @OptionalValue
    Optional<ItemWeaponType> getDualWield();

    @OptionalValue
    @IdValue
    OptionalInt getFlipSkill();

    @OptionalValue
    @QuantityValue
    OptionalInt getInitiative();

    @OptionalValue
    @IdValue
    OptionalInt getNextChain();

    @OptionalValue
    @IdValue
    OptionalInt getPrevChain();

    @OptionalValue
    @SetValue
    @IdValue
    Optional<Set<Integer>> getTransformSkills();

    @OptionalValue
    @SetValue
    @IdValue
    Optional<Set<Integer>> getBundleSkills();

    @OptionalValue
    @IdValue
    OptionalInt getToolbeltSkill();
}
