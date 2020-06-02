package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private boolean stamp;

    public Stamp(String name, double width, double height, boolean stamp) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.stamp = stamp;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isStamp() {
        return stamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp1 = (Stamp) o;
        return Double.compare(stamp1.width, width) == 0 &&
                Double.compare(stamp1.height, height) == 0 &&
                stamp == stamp1.stamp &&
                Objects.equals(name, stamp1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", stamp=" + stamp +
                '}';
    }
}
