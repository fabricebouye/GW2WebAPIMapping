/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.specializations;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a character specialization.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/specializations", requiresAuthentication = true, scope = {"characters", "builds"}) // NOI18N.
public interface CharacterSpecialization {

    /**
     * Gets the id of this character's specialization.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the set of major traits ids of this character's specialization.
     * <br>May be empty if the characters has yet to unlock traits for this specialization.
     * @return A non-modifiable {@code Set<Integer>}, never {@code null}.
     */
    @IdValue
    @SetValue
    public Set<Integer> getTraits();
}
