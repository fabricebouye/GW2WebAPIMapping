/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.IdValue;
import java.util.Set;

/**
 * Defines a character specialization.
 * @author Fabrice Bouyé
 */
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
    public Set<Integer> getTraits();
}
