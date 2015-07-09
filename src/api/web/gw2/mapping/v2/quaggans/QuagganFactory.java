/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.quaggans;

import java.io.IOException;

/**
 * Defines a factory that produces a quaggan object.
 * @author Fabrice Bouyé
 */
@FunctionalInterface
public interface QuagganFactory {

    /**
     * Creates a new quaggan instance.
     * @param basecode The source URL.
     * @return A {@code Quaggan} instance, never {@code null}.
     * @throws NullPointerException If {@code basecode} is {@code null}.
     * @throws IOException In case of IO error.
     */
    Quaggan create(final String basecode) throws NullPointerException, IOException;
}
