package com.setsandhash;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbintalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbintalPeriod) {
        this.name = name;
        this.orbintalPeriod = orbintalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }

    public String getName() {
        return name;
    }

    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }
    public boolean addMood(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}
