package pan.edu.welcome_spring.form;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

public class ClientForm {

    private String id;
    private String name;
    private String description;
    private String phoneNumber;

    public ClientForm() {
    }

    public ClientForm(String name, String description, String phoneNumber) {
        this.name = name;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }

    public ClientForm(String id, String name, String description, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.phoneNumber = phoneNumber;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ClientForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
