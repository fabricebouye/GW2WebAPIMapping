/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.colors;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an RGB color.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/colors") // NOI18N.
@ImplementationSpecific
public interface ColorRGB {

    /**
     * A singleton instance that represents the empty or black color.
     */
    public static final ColorRGB EMPTY = new ColorRGB(){
        @Override
        public int getRed() {
            return 0;
        }

        @Override
        public int getGreen() {
            return 0;
        }

        @Override
        public int getBlue() {
            return 0;
        }
    };

    /**
     * Gets the red component of this RGB color.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    @QuantityValue
    int getRed();

    /**
     * Gets the green component of this RGB color.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    @QuantityValue
    int getGreen();

    /**
     * Gets the blue component of this RGB color.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    @QuantityValue
    int getBlue();
}
