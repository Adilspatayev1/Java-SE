package com.company;

public class RenaultEngine extends Engine {
    private double extraTurboEnergy;

    public RenaultEngine() {
    }

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    public double efficiency() {
        return 0.27;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 100 + getExtraTurboEnergy();
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight() * 2.1;
    }
}
