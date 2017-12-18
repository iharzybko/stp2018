package entity;

import java.util.HashMap;
import java.util.Map;

public class Abiturient {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String address;
    private String mobileNumber;
    private Map<String, Integer> marks;

    public Abiturient() {
        marks = new HashMap<>();
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(String subject, int mark) {
        marks.put(subject, mark);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Abiturient" + '\n' +
                "id:           " + id + '\n' +
                "Last name:    " + lastName + '\n' +
                "First name:   " + firstName + '\n' +
                "Middle name:  " + middleName + '\n' +
                "Address:      " + address + '\n' +
                "MobileNumber: " + mobileNumber + '\n' +
                "marks:        " + marks;
    }
}