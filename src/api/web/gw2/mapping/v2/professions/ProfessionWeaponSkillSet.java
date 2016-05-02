/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines a weapon skill set for a profession.
 * @author Fabrice Bouyé
 */
public interface ProfessionWeaponSkillSet {

    /**
     * Gets all skills in this weapon skill set.
     * @return A non-modifiable {@code Set<ProfessionWeaponSkill>}, never {@code null}.
     */
    @SetValue
    Set<ProfessionWeaponSkill> getSkills();

    /**
     * Gets the id of the specialization needed to use this weapon skill set (if any).
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getSpecialization();
}
