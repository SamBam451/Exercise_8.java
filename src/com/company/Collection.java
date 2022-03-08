package com.company;

import java.util.ArrayList;

class Collection {
    ArrayList<Person> contact_book = new ArrayList<>();

    public void add_contact(Person a) {
        contact_book.add(a);
    }
    public void show_all(){
        for (Person a : contact_book) {
            a.display();
        }
    }
}
