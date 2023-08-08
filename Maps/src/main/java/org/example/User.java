package org.example;

import java.util.Objects;

public class User {
    private String name;
    private String userName;

    private int id;

    private String tierLevel;

    public User(String name, String userName, int id, String tierLevel) {
        this.name = name;
        this.userName = userName;
        this.id = id;
        this.tierLevel = tierLevel;
    }

    public User(String name, String userName, int id) {
        this.name = name;
        this.userName = userName;
        this.id = id;
        this.tierLevel = "Basic";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTierLevel() {
        return tierLevel;
    }

    public void setTierLevel(String tierLevel) {
        this.tierLevel = tierLevel;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        //Should be the same check
//        if (other == null || !(other instanceof User)) {
//            return false;
//        }
        if (other == null ||  this.getClass() != other.getClass()) {
            return false;
        }
        User that = (User) other;

        return (this.id == that.getId()
                && this.name.equals(that.getName())
                && this.userName.equals(that.getUserName()));
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.userName);
    }

    public int fakeHashCode(){
        return Objects.hash(this.userName, this.name, this.id);
    }

}
