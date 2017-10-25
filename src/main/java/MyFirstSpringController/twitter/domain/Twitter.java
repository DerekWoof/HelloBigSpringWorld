package MyFirstSpringController.twitter.domain;

import java.time.LocalDateTime;


public class Twitter {

    private String message;
    private LocalDateTime timestamp;

    @Override
    public String toString() {
        return "Twitter{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Twitter(String message, LocalDateTime timestamp, String userId) {

        this.message = message;
        this.timestamp = timestamp;
        this.userId = userId;
    }

    private String userId;

}
