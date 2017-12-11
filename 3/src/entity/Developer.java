package entity;

import java.util.Date;

public class Developer {
    private String Fname;
    private Date achiveTaskDate;
    private Date passTaskDate;
    private String fname;

    public void setFname(String fname) {
        this.fname = fname;
        passTaskDate = new Date();
    }

    public void setAchiveTaskDate(Date date) {

        this.achiveTaskDate = date;
    }

    @Override
    public String toString() {
        return  "First name of developer: " + fname + '\n' +
                " Task was received at " + achiveTaskDate + '\n' +
                " Task was passed at " + passTaskDate;
    }
}
