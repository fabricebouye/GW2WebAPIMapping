/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.quaggans;

/**
 * Default implementation of a guaggan.
 * @author Fabrice Bouyé
 */
final class DefaultQuaggan implements Quaggan {

    String id = "";
    String url = "";

    /**
     * Creates a new empty instance.
     */
    public DefaultQuaggan() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getUrl() {
        return url;
    }

}
