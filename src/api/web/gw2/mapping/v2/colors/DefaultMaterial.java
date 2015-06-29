/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.colors;

/**
 * Default implementation of a color material.
 * @author Fabrice Bouyé
 */
final class DefaultMaterial implements Material {

    RGB rgb;
    int brightness;
    double contrast;

    /**
     * Creates a new empty instance.
     */
    DefaultMaterial() {
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public double getContrast() {
        return contrast;
    }

    @Override
    public RGB getRGB() {
        return rgb;
    }
}
