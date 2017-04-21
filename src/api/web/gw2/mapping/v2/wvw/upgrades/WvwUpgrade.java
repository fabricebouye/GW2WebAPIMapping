/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.upgrades;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;

/**
 * Defines a WvW upgrade.
 * @author Fabrice Bouyé
 */
public interface WvwUpgrade {

    /**
     * Gets the localized name of this upgrade.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the localized description of this upgrade.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the URL to the icon of this upgrade.
     * @return A {@code SURLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();
}
