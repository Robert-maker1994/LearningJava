package com.Poly;

class Porche extends Car {
    public Porche(String name, int cylinders, int wheelDrive, int wheels) {
        super(name, cylinders, wheelDrive, wheels);

    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public int getCylinders() {
        return 4;
    }
}

