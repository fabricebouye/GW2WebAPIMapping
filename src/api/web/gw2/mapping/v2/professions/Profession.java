/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Map;
import java.util.Set;

/**
 * Defines a profession.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/professions") // NOI18N.
public interface Profession {

    /**
     * Gets the id of this profession.
     * @return A {@code String} never {@code null}.
     * @see api.web.gw2.mapping.v2.characters.CharacterProfession
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the i18n name of the profession (non-gender specific).
     * @return A {@code String} never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the url to the icon of this profession.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the url to the large icon of this profession.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIconBig();

    /**
     * Gets the set of ids of this profession's specializations.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     */
    @IdValue
    @SetValue
    Set<Integer> getSpecializations();

    /**
     * Gets the weapons skills for this profession.
     * @return A non-modifiable {@code Map<ProfessionWeaponType, ProfessionWeaponSkillSet>} instance, never {@code null}.
     */
    @MapValue
    Map<ProfessionWeaponType, ProfessionWeaponSkillSet> getWeapons();

    /**
     * Gets all training tracks in this profession.
     * @return A non-modifiable {@code Set<ProfessionTrack>} instance, never {@code null}.
     */
    @SetValue
    Set<ProfessionTrack> getTraining();
}
