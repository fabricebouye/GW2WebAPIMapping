/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

/**
 * Defines a gathering tool details.
 * @author Fabrice Bouyé
 */
public interface ItemGatheringDetails {

    /**
     * Gets the type of this gathering too.
     * @return An {@code ItemGatheringType} instance, never {@code null}.
     */
    ItemGatheringType getType();

}
