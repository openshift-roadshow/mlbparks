package com.openshift.evg.roadshow.model;

/**
 * Created by jmorales on 18/08/16.
 */
public interface DataPoint {
    public Object getId();

    public void setId(Object id);

    public Object getName();

    public void setName(Object name);

    public Coordinates getPosition();

    public void setPosition(Coordinates position);

    public Object getLongitude();

    public void setLongitude(Object longitude);

    public Object getLatitude();

    public void setLatitude(Object latitude);
}
