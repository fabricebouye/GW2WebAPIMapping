/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * Defines a Web API error.
 * @author Fabrice Bouyé
 */
public interface WebAPIError {

    /**
     * Gets the text of this API error.
     * @return A {@code String}.
     */
    String getText();
}
