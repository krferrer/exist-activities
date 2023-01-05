package com.activity.two;

import java.util.HashMap;
import java.util.Map;

public class Smartphone extends Telephone {
    private String phoneNo;
    private String operatingSystem;
    private Map<String,String> contacts = new HashMap<>();

    public Smartphone(String phoneNo, String operatingSystem) {
        this.phoneNo = phoneNo;
        this.operatingSystem = operatingSystem;
    }

    public void addContact(String name,String phoneNo){
        contacts.put(name,phoneNo);
    }
    public void removeContact(String name){
        System.out.println("Contact deleted: " +name);
        contacts.remove(name);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "phoneNo='" + phoneNo + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    @Override
    public void call(String phoneNo) {
        if(phoneNo.equals(this.phoneNo)){
            System.out.println("You cannot call yourself");
        }else{
            super.call(phoneNo);
        }
    }


    public void call(String phoneNo,String name) {
        if(contacts.containsKey(name)){
            System.out.println("Calling from contacts");
        }else{
            super.call(phoneNo);
        }
    }

    public void displayContacts(){
        contacts.entrySet().stream().forEach(en-> System.out.println(en.getKey()+": "+en.getValue()));
    }

}
