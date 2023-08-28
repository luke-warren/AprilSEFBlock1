package org.service_example;

public class CustomerDTO {

    private int idNumber;
    private String firstName;
    private String lastName;
    private int rewardsNumber;
    private int totalPoints;

    public CustomerDTO(int idNumber, String firstName, String lastName, int rewardsNumber, int totalPoints) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rewardsNumber = rewardsNumber;
        this.totalPoints = totalPoints;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getRewardsNumber(){
        return rewardsNumber;
    }
    public void setRewardsNumber(int number){
        this.rewardsNumber = number;
    }
}
