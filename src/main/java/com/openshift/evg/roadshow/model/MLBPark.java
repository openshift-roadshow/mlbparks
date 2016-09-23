package com.openshift.evg.roadshow.model;

/**
 * Created by jmorales on 18/08/16.
 */
public class MLBPark implements DataPoint {
    private Object name;
    private Coordinates position;
    private Object latitude;
    private Object longitude;
    private Object id;
    private Object ballpark;
    private Object payroll;
    private Object league;

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    @Override
    public Object getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    @Override
    public Object getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Coordinates getPosition() {
        return position;
    }

    public void setPosition(Coordinates position) {
        this.position = position;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getBallpark() {
        return ballpark;
    }

    public void setBallpark(Object ballpark) {
        this.ballpark = ballpark;
    }

    public Object getPayroll() {
        return payroll;
    }

    public void setPayroll(Object payroll) {
        this.payroll = payroll;
    }

    public Object getLeague() {
        return league;
    }

    public void setLeague(Object league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "MLBPark{" +
                "id=" + id +
                ", name=" + name +
                ", ballpark=" + ballpark +
                ", position=" + position +
                ", payroll=" + payroll +
                ", league=" + league +
                '}';
    }
}
