package MyFirstSpringController.task02;

public class Users {

    private String name;
    private String surname;
    private String messageType;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", messageType='" + messageType + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Users(String name, String surname, String messageType) {
        this.name = name;
        this.surname = surname;
        this.messageType = messageType;
    }
}
