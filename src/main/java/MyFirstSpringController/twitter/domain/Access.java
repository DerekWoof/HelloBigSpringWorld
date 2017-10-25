package MyFirstSpringController.twitter.domain;

public enum Access {
    PUBLIC("public"),
    FRIENDS("friends"),
    PRIVATE("private");

    String value;
    Access(String value) {
        this.value = value;
    }
}
