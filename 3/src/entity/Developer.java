package entity;

import java.util.Date;

public class Developer {
    private String fio;
    private String achiveTaskDate;
    private Date passTaskDate;

    public Developer(){
        passTaskDate = new Date();
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAchiveTaskDate(String achiveTaskDate) {
        this.achiveTaskDate = achiveTaskDate;
    }

    @Override
    public String toString() {
        return "FIO of developer " + fio + '\n' +
                " Task was received at " + achiveTaskDate + '\n' +
                " Task was passed at " + passTaskDate;
    }
}