/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.materials;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import java.util.Set;

/**
 * Defines a category of material storage in the bank.
 * @author Fabrice Bouyé
 */
public interface MaterialStorage {

    /**
     * Gets the id of this material storage.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.items.Item#getId() 
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this material storage.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets a set of item ids contained in this material storage.
     * @return A {@code Set<Integer>} instance, never {@code null}.
     */
    @IdValue
    @SetValue
    Set<Integer> getItems();
}
