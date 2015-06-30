/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.colors;

/**
 * Default implementation of an RGB color storage.
 * @author Fabrice Bouyé
 */
final class DefaultRGB implements RGB {

    short[] rgb;

    /**
     * Creates a new empty instance.
     */
    DefaultRGB() {
    }

    @Override
    public int getRed() {
        return rgb[0];
    }

    @Override
    public int getGreen() {
        return rgb[1];
    }

    @Override
    public int getBlue() {
        return rgb[2];
    }
}
