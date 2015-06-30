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
 * Defines a color material.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/colors") // NOI18N.
public interface Material {

    /**
     * Gets the base rgb color of this material.
     * @return An {@code RGB} instance, never {@code null}.
     */
    @ImplementationSpecific
    RGB getRGB();

    /**
     * Gets the brightness of this material.
     * @return An {@code int}.
     */
    int getBrightness();

    /**
     * Gets the contrast of this material.
     * @return A {@code double}.
     */
    double getContrast();

    /**
     * Gets the hue of this material.
     * @return An {@code int}.
     */
    int getHue();

    /**
     * Gets the saturation of this material.
     * @return A {@code double}.
     */
    double getSaturation();

    /**
     * Gets the lightness of this material.
     * @return A {@code double}.
     */
    double getLightness();
}
