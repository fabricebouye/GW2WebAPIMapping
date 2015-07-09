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
final class DefaultColorDye implements ColorDye {

    int id = -1;
    String name = "";
    ColorRGB baseRGB = ColorRGB.EMPTY;
    ColorMaterial cloth = ColorMaterial.EMPTY;
    ColorMaterial leather = ColorMaterial.EMPTY;
    ColorMaterial metal = ColorMaterial.EMPTY;

    /**
     * Creates a new empty instance.
     */
    DefaultColorDye() {
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
    public ColorRGB getBaseRGB() {
        return baseRGB;
    }

    @Override
    public ColorMaterial getCloth() {
        return cloth;
    }

    @Override
    public ColorMaterial getLeather() {
        return leather;
    }

    @Override
    public ColorMaterial getMetal() {
        return metal;
    }
}
