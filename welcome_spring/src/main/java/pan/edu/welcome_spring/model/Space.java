package pan.edu.welcome_spring.model;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.apache.tomcat.jni.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import sun.util.resources.cldr.dav.LocaleNames_dav;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Space {

    private String id;
    private String name;
    private int floor;
    private double area;
    private boolean isConditioner;
    private double rentPricePerDay;
    private LocalDateTime createdAt, updatedAt;

    public Space() {
    }

    public Space(String name, int floor, double area, boolean isConditioner, double rentPricePerDay) {
        this.name = name;
        this.floor = floor;
        this.area = area;
        this.isConditioner = isConditioner;
        this.rentPricePerDay = rentPricePerDay;
    }

    public Space(String id, String name, int floor, double area, boolean isConditioner, double rentPricePerDay) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.area = area;
        this.isConditioner = isConditioner;
        this.rentPricePerDay = rentPricePerDay;
    }

    public Space(String id, String name, int floor, double area, boolean isConditioner, double rentPricePerDay, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.area = area;
        this.isConditioner = isConditioner;
        this.rentPricePerDay = rentPricePerDay;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isConditioner() {
        return isConditioner;
    }

    public void setConditioner(boolean conditioner) {
        isConditioner = conditioner;
    }

    public double getRentPricePerDay() {
        return rentPricePerDay;
    }

    public void setRentPricePerDay(double rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
    }

    @Override
    public String toString() {
        return "Space{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", floor=" + floor +
                ", area=" + area +
                ", isConditioner=" + isConditioner +
                ", rentPricePerDay=" + rentPricePerDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Space space = (Space) o;
        return floor == space.floor &&
                Double.compare(space.area, area) == 0 &&
                isConditioner == space.isConditioner &&
                Double.compare(space.rentPricePerDay, rentPricePerDay) == 0 &&
                Objects.equals(id, space.id) &&
                Objects.equals(name, space.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, floor, area, isConditioner, rentPricePerDay);
    }
}
