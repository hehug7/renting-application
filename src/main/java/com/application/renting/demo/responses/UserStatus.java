package com.application.renting.demo.responses;

public class UserStatus {

    public int getUserId() {
        return userId;
    }

    public userstatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(userstatus userStatus) {
        this.userStatus = userStatus;
    }

    public enum userstatus {
        UNKNOWN,
        CREATED,
        ALREADY_EXISTS
    }

    private final int userId;
    private userstatus userStatus;

    public UserStatus(int userId, userstatus status) {
        this.userId = userId;
        this.userStatus = status;
    }
}
