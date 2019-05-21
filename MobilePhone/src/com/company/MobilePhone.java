package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> contactsName = new ArrayList<String>();
    private ArrayList<String> contactsNumber = new ArrayList<String>();

    public void addContacts (String name, String number){

        contactsName.add(name);
        contactsNumber.add(number);
    }

    public void printContacts(){

        System.out.println("You have " + contactsName.size() + " Contacts.");
        for (int i = 0; i < contactsName.size(); i++){

            System.out.println((i+1) + ", " + contactsName.get(i) + ", " + contactsNumber.get(i));
        }
    }

    public void modifyContacts(String existingName, String newName, String newNumber){

        int position = findContact(existingName);
        if(position >= 0){
            modifyContacts(position, newName, newNumber);
        }
    }

    private void modifyContacts(int position, String newName, String newNumber){

        contactsName.set(position, newName);
        contactsNumber.set(position, newNumber);
        System.out.println("Contacts Name " + contactsName.get(position) + " Modified.");
    }

    public int  findContact(String newName){

        return contactsName.indexOf(newName);

    }

    public void removeContacts (String contactName){

        int position = findContact(contactName);
        if(position >= 0){
            removeContacts(position);
        }

    }

    private void removeContacts(int position){

        String name = contactsName.get(position);
        contactsName.remove(position);
        contactsNumber.remove(position);
        System.out.println("Contact Name " + name + "Removed.");
    }

    public boolean onFile(String searchName){

        int position = findContact(searchName);
        if(position >= 0){
            return true;
        }else{
            return false;
        }
    }
}
