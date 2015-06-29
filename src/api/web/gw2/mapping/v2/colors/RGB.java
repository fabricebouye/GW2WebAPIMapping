/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.colors;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an RGB color.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/colors") // NOI18N.
public interface RGB {

    /**
     * Gets the red component of this RGB color.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    int getRed();

    /**
     * Gets the green component of this RGB color.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    int getGreen();

    /**
     * Gets the blue component of this RGB color.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    int getBlue();
}
