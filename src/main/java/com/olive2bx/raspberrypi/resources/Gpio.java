package com.olive2bx.raspberrypi.resources;

import java.io.Serializable;

/**
 * Created by ocesbron on 04/06/15.
 */
public class Gpio implements Serializable {

    private final GpioPiPin pin;

    private GpioPiMode
            mode;

    public Gpio(GpioPiPin pin) {
        this.pin = pin;
    }

    public GpioPiPin getPin() {
        return pin;
    }

    public GpioPiMode getMode() {
        return mode;
    }

    public void setMode(GpioPiMode mode) {
        this.mode = mode;
    }
}
