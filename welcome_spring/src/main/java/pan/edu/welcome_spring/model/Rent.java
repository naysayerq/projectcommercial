package pan.edu.welcome_spring.model;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Rent {

    private String id;
    private Space space;
    private Client client;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Rent() {
    }

    public Rent(Space space, Client client, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.space = space;
        this.client = client;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Rent(String id, Space space, Client client, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.space = space;
        this.client = client;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    @Override
    public String toString() {
        return "Rent{" +
                "id='" + id + '\'' +
                ", space=" + space +
                ", client=" + client +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return Objects.equals(id, rent.id) &&
                Objects.equals(space, rent.space) &&
                Objects.equals(client, rent.client) &&
                Objects.equals(createdAt, rent.createdAt) &&
                Objects.equals(updatedAt, rent.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, space, client, createdAt, updatedAt);
    }
}
