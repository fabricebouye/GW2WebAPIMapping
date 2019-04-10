/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.files;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a file.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/files") // NOI18N.
public interface File {

    /**
     * Gets the id of this file.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the URL of the icon of this file.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();
}
