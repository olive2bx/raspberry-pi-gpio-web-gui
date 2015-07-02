package com.olive2bx.raspberrypi;

import com.olive2bx.raspberrypi.resources.GpioResources;
import net.codestory.http.WebServer;

/**
 * Created by ocesbron on 03/06/15.
 */
public class Application {

    public static void main(String[] args){
        new WebServer().configure(routes -> routes.add("/gpio", new GpioResources())).start();
    }
}
