package com.it326.isucarpool.model;

/**
 * Created by Cedomir Spalevic on 11/2/2016.
 */

public class CarpoolOffer
{
    private String rideId;
    private String driverId;
    private String riderId;
    private String startingPoint;
    private String destination;
    private String description;
    private String gender;
    private String radius;
    private String departure;
    private boolean driverRated;
    private boolean riderRated;

    public CarpoolOffer()
    {
        setRiderId("");
        setStartingPoint("");
        setDestination("");
        setDriverId("");
        setDescription("");
        setGender("");
        setRadius("");
        setDeparture("");
    }

    public CarpoolOffer(String driverId, String startingPoint, String destination, String description,
                        String gender, String radius, String departure)
    {
        this.driverId = driverId;
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.description = description;
        this.gender = gender;
        this.radius = radius;
        this.departure = departure;
    }

    public boolean getDriverRated() { return driverRated; }

    public void setDriverRated(boolean driverRated) { this.driverRated = driverRated; }

    public boolean getRiderRated() { return riderRated; }

    public void setRiderRated(boolean riderRated) { this.riderRated = riderRated; }

    public String getRideId() { return rideId; }

    public void setRideId(String rideId) { this.rideId = rideId; }

    public String getRiderId() { return riderId; }

    public void setRiderId(String riderId) { this.riderId = riderId; }

    public String getDriverId() { return driverId; }

    public void setDriverId(String driverId) { this.driverId = driverId; }

    public String getStartingPoint() { return startingPoint; }

    public void setStartingPoint(String startingPoint) { this.startingPoint = startingPoint; }

    public String getDestination() { return destination; }

    public void setDestination(String destination) { this.destination = destination; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getRadius() { return radius; }

    public void setRadius(String radius) { this.radius = radius; }

    public String getDeparture() { return departure; }

    public void setDeparture(String departure) { this.departure = departure; }
}
