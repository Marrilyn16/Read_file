package org.example;

public class CSVReader {
    private String userName;
    private String identifier;
    private String oneTimePassword;
    private String recoveryCode;
    private String firstName;
    private String lastName;
    private String Department;
    private String location;

    public CSVReader(String userName, String identifier, String oneTimePassword, String recoveryCode, String firstName, String lastName, String department, String location) {
        this.userName = userName;
        this.identifier = identifier;
        this.oneTimePassword = oneTimePassword;
        this.recoveryCode = recoveryCode;
        this.firstName = firstName;
        this.lastName = lastName;
        Department = department;
        this.location = location;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "CSVReader{" +
                "userName='" + userName + '\'' +
                ", identifier='" + identifier + '\'' +
                ", oneTimePassword='" + oneTimePassword + '\'' +
                ", recoveryCode='" + recoveryCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Department='" + Department + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getOneTimePassword() {
        return oneTimePassword;
    }

    public void setOneTimePassword(String oneTimePassword) {
        this.oneTimePassword = oneTimePassword;
    }

    public String getRecoveryCode() {
        return recoveryCode;
    }

    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
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

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
