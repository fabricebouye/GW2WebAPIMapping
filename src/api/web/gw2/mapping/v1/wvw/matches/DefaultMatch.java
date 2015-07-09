/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matches;

import java.time.LocalDate;

/**
 * Default implementation of a WvW match.
 * @author Fabrice Bouyé
 */
final class DefaultMatch implements Match {

    String wvwMatchId = "";
    int redWorldId = -1;
    int blueWorldId = -1;
    int greenWorldId = -1;
    LocalDate startTime = LocalDate.MIN;
    LocalDate endTime = LocalDate.MIN;

    /**
     * Creates a new empty instance.
     */
    DefaultMatch() {
    }

    @Override
    public String getWvwMatchId() {
        return wvwMatchId;
    }

    @Override
    public int getRedWorldId() {
        return redWorldId;
    }

    @Override
    public int getBlueWorldId() {
        return blueWorldId;
    }

    @Override
    public int getGreenWorldId() {
        return greenWorldId;
    }

    @Override
    public LocalDate getStartTime() {
        return startTime;
    }

    @Override
    public LocalDate getEndTime() {
        return endTime;
    }    
}
