package MyFirstSpringController.adapter.persistance;

import java.time.LocalDateTime;

public class Twitter {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Twitter(Long id, String message, LocalDateTime timeStamp, String creatorId, String access, String ip) {

        this.id = id;
        this.message = message;
        this.timeStamp = timeStamp;
        this.creatorId = creatorId;
        this.access = access;
        this.ip = ip;
    }

    private Long id;
    private String message;
    private LocalDateTime timeStamp;
    private String creatorId;
    private String access;
    private String ip;

}
