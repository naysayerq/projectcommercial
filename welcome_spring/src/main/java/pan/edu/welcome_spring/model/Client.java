package pan.edu.welcome_spring.model;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import java.time.LocalDate;
import java.util.Objects;

public class Client {

    private String id;
    private String name;
    private String details;
    private String description;
    private String address;
    private int phoneNumber;
    private String contactPerson;
    private LocalDate createdAt, updatedAt;

    public Client() {
    }

    public Client(String name, String description, String address, int phoneNumber, String contactPerson) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.contactPerson = contactPerson;
    }

    public Client(String name, String details, String description, String address, int phoneNumber, String contactPerson, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.details = details;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.contactPerson = contactPerson;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Client(String id, String name, String details, String description, String address, int phoneNumber, String contactPerson, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.contactPerson = contactPerson;
        this.createdAt = createdAt;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", contactPerson='" + contactPerson + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return phoneNumber == client.phoneNumber &&
                Objects.equals(id, client.id) &&
                Objects.equals(name, client.name) &&
                Objects.equals(details, client.details) &&
                Objects.equals(description, client.description) &&
                Objects.equals(address, client.address) &&
                Objects.equals(contactPerson, client.contactPerson) &&
                Objects.equals(createdAt, client.createdAt) &&
                Objects.equals(updatedAt, client.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, details, description, address, phoneNumber, contactPerson, createdAt, updatedAt);
    }
}
