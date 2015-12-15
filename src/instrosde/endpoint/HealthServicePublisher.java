package introsde.endpoint;

import javax.xml.ws.Endpoint;
import introsde.ws.HealthServiceImplementation;
//Endpoint publisher
public class HealthServicePublisher{
    public static void main(String[] args) {
       Endpoint.publish("http://localhost:6901/ws/health", new HealthServiceImplementation());
    }
}
