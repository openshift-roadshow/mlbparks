package com.openshift.evg.roadshow.model;

/**
 * Created by jmorales on 19/08/16.
 */
public class View{
    private String title;

    private Coordinates center;

    private int zoom;

    public View() {
    }

    public View(String title, String latitude, String longitude, int zoom) {
        this.title = title;
        this.center = new Coordinates(latitude,longitude);
        this.zoom = zoom;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getLatitude() {
        return center.getLatitude();
    }

    public void setLatitude(String latitude) {
        center.setLatitude(latitude);
    }

    public String getLongitude() {
        return center.getLongitude();
    }

    public void setLongitude(String longitude) {
        center.setLongitude(longitude);
    }

    public Coordinates getCenter() {
        return center;
    }

    public void setCenter(Coordinates center) {
        this.center = center;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "View{" +
                "title='" + title + '\'' +
                ", center='" + center + '\'' +
                ", zoom=" + zoom +
                '}';
    }
}
