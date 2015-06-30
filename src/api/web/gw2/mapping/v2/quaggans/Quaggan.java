/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.quaggans;

/**
 * Defines a guaggan image.
 * @author Fabrice Bouyé
 */
public interface Quaggan {

    /**
     * Gets the id of this guaggan image.
     * @return An {@code int}.
     */
    int getId();

    /**
     * Gets the URL of the image of this guaggan image.
     * @return A {@code String} instance, never {@code null}.
     */
    String getURl();
}
