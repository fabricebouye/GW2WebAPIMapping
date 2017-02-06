/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import java.util.Optional;

/**
 * Defines a profession weapon skill.
 * @author Fabrice Bouyé
 */
public interface ProfessionWeaponSkill {

    /**
     * Gets the id of this weapon skill.
     * @return
     */
    @IdValue
    int getId();

    /**
     * Gets the weapon slot of this skill.
     * @return A {@code ProfessionWeaponSlot} instance, never {@code null}.
     */
    ProfessionWeaponSlot getSlot();

    /**
     * Gets the offhand weapon that is required for this skill.
     * <br>Thief skill #3 may change depending of the equipped offhand weapon.
     * @return An {@code  Optional<ProfessionWeaponType>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ProfessionWeaponType> getOffhand();

    /**
     * Gets the elementalist attunement that is required for this skill.
     * @return An {@code  Optional<ProfessionElementalistAttunement>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ProfessionElementalistAttunement> getAttunement();
}
