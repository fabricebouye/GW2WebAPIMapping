/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.IdValue;

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
    int id();
    
    /**
     * Gets the weapon slot of this skill.
     * @return A {@code ProfessionWeaponSlot} instance, never {@code null}.
    */
    ProfessionWeaponSlot getSlot();
}
