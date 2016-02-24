/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.emblem;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a guild emblem layer (either foreground or background).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/emblem") // NOI18N.
public interface EmblemLayer {

    /**
     * Gets the id of this layer.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the URLs of all images in this layer.
     * @return A non-modifiable {@code Set<URLReference>}, never {@code null}.
     */
    @URLValue
    @SetValue
    Set<URLReference> getLayers();
}
