package com.company;

public class Business_contact extends Person {
    private long phone;

    public Business_contact(String name, String email, long phone) {
        super(name, email);
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Business_contact{" +
                "phone=" + phone +
                '}';
    }

    @Override
    public void display() {
        System.out.println("Name: "+ this.getName() + " | Email: " + this.getEmail() +" | Phone: " + this.getPhone());
    }
}
