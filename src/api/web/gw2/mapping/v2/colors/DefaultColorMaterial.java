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
final class DefaultColorMaterial implements ColorMaterial {

    ColorRGB rgb = ColorRGB.EMPTY;
    int brightness = 0;
    double contrast = 0;
    int hue = 0;
    double saturation = 0;
    double lightness = 0;

    /**
     * Creates a new empty instance.
     */
    DefaultColorMaterial() {
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
    public ColorRGB getRGB() {
        return rgb;
    }
    
    @Override
    public int getHue() {
        return hue;
    }

    @Override
    public double getSaturation() {
        return saturation;
    }

    @Override
    public double getLightness() {
        return lightness;
    }
}
