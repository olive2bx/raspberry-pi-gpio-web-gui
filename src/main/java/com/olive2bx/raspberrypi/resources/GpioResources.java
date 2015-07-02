package com.olive2bx.raspberrypi.resources;

import net.codestory.http.annotations.Get;

import java.util.Collection;

/**
 * Created by ocesbron on 04/06/15.
 */
public class GpioResources {

    GpioService gpioService = GpioService.getInstance();

    @Get("/")
    public Collection<Gpio> getAll(){

        return gpioService.getAll();
    }


}
