/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.colors;

/**
 * Default implementation of a dye.
 * @author Fabrice Bouyé
 */
public final class DefaultDye implements Dye {

    int id;
    String name;
    RGB base;
    Material cloth;
    Material leather;
    Material metal;

    /**
     * Creates a new empty instance.
     */
    DefaultDye() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public RGB getBase() {
        return base;
    }

    @Override
    public Material getCloth() {
        return cloth;
    }

    @Override
    public Material getLeather() {
        return leather;
    }

    @Override
    public Material getMetal() {
        return metal;
    }
}
