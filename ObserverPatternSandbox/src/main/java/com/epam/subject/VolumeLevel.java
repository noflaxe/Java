package com.epam.subject;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class VolumeLevel {

    private long dbVolumeLevel;

    private static final long MINIMAL_POSSIBLE_VOLUME = 0L;
    private static final long MAXIMUM_POSSIBLE_VOLUME = 130L;

    public void setLevel(long level) {
        if (level < MINIMAL_POSSIBLE_VOLUME) {
            this.dbVolumeLevel = MINIMAL_POSSIBLE_VOLUME;
        } else if (level > MAXIMUM_POSSIBLE_VOLUME) {
            level = MAXIMUM_POSSIBLE_VOLUME;
        }
        this.dbVolumeLevel = level;
    }

    public double getInPercentageValue() {
        return dbVolumeLevel / 130.0;
    }

    public double getInDbValue() {
        return dbVolumeLevel;
    }


}
