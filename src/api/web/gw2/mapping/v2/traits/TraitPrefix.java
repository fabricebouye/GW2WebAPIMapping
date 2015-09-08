/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;
import java.net.URL;

/**
 * Defines a trait prefix.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitPrefix {
    
    /**
     * Gets the localized text of this fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getText();

    /**
     * Gets the URL to the icon of this fact.
     * @return A {@code URL} instance, never {@code null}.
     */
    URL getIcon();

    @LocalizedResource
    String getStatus();

    /**
     * Gets the localized description of this fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();
}
