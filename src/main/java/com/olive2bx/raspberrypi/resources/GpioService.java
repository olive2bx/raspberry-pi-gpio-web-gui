package com.olive2bx.raspberrypi.resources;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ocesbron on 04/06/15.
 */
public class GpioService {

    private static GpioService instance = new GpioService();

    private final Map<GpioPiPin, Gpio> gpios;

    private GpioService(){
        gpios = new LinkedHashMap<>();

        gpios.put(GpioPiPin.GPIO_0, new Gpio(GpioPiPin.GPIO_0));
        gpios.put(GpioPiPin.GPIO_1, new Gpio(GpioPiPin.GPIO_1));
        gpios.put(GpioPiPin.GPIO_2, new Gpio(GpioPiPin.GPIO_2));
        gpios.put(GpioPiPin.GPIO_3, new Gpio(GpioPiPin.GPIO_3));
        gpios.put(GpioPiPin.GPIO_4, new Gpio(GpioPiPin.GPIO_4));
        gpios.put(GpioPiPin.GPIO_5, new Gpio(GpioPiPin.GPIO_5));
        gpios.put(GpioPiPin.GPIO_6, new Gpio(GpioPiPin.GPIO_6));
        gpios.put(GpioPiPin.GPIO_7, new Gpio(GpioPiPin.GPIO_7));
        gpios.put(GpioPiPin.GPIO_8, new Gpio(GpioPiPin.GPIO_8));
        gpios.put(GpioPiPin.GPIO_9, new Gpio(GpioPiPin.GPIO_9));
        gpios.put(GpioPiPin.GPIO_10, new Gpio(GpioPiPin.GPIO_10));
        gpios.put(GpioPiPin.GPIO_11, new Gpio(GpioPiPin.GPIO_11));
        gpios.put(GpioPiPin.GPIO_12, new Gpio(GpioPiPin.GPIO_12));
        gpios.put(GpioPiPin.GPIO_13, new Gpio(GpioPiPin.GPIO_13));
        gpios.put(GpioPiPin.GPIO_14, new Gpio(GpioPiPin.GPIO_14));
        gpios.put(GpioPiPin.GPIO_15, new Gpio(GpioPiPin.GPIO_15));
        gpios.put(GpioPiPin.GPIO_16, new Gpio(GpioPiPin.GPIO_16));
        gpios.put(GpioPiPin.GPIO_21, new Gpio(GpioPiPin.GPIO_21));
        gpios.put(GpioPiPin.GPIO_22, new Gpio(GpioPiPin.GPIO_22));
        gpios.put(GpioPiPin.GPIO_23, new Gpio(GpioPiPin.GPIO_23));
        gpios.put(GpioPiPin.GPIO_24, new Gpio(GpioPiPin.GPIO_24));
        gpios.put(GpioPiPin.GPIO_25, new Gpio(GpioPiPin.GPIO_25));
        gpios.put(GpioPiPin.GPIO_26, new Gpio(GpioPiPin.GPIO_26));
        gpios.put(GpioPiPin.GPIO_27, new Gpio(GpioPiPin.GPIO_27));
        gpios.put(GpioPiPin.GPIO_28, new Gpio(GpioPiPin.GPIO_28));
        gpios.put(GpioPiPin.GPIO_29, new Gpio(GpioPiPin.GPIO_29));
    }

    public static GpioService getInstance() {
        return instance;
    }

    public Collection<Gpio> getAll() {
        return gpios.values();
    }
}
