package com.company;

public class IPhoneContact extends Contact {
    private int id;
    private String surname;
    private String firstPhone;
    private String secondPhone;
    private String thirdPhone;

    public IPhoneContact() {
    }

    public IPhoneContact(int id, String surname, String firstPhone, String secondPhone, String thirdPhone) {
        this.id = id;
        this.surname = surname;
        this.firstPhone = firstPhone;
        this.secondPhone = secondPhone;
        this.thirdPhone = thirdPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstPhone() {
        return firstPhone;
    }

    public void setFirstPhone(String firstPhone) {
        this.firstPhone = firstPhone;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public void setSecondPhone(String secondPhone) {
        this.secondPhone = secondPhone;
    }

    public String getThirdPhone() {
        return thirdPhone;
    }

    public void setThirdPhone(String thirdPhone) {
        this.thirdPhone = thirdPhone;
    }

    @Override
    public String getPersonalData() {
        return getId() + " " + getSurname() + " ";
    }

    @Override
    public String getPhone() {
        return getFirstPhone() + " " + getSecondPhone() + " " + getThirdPhone();
    }
}
