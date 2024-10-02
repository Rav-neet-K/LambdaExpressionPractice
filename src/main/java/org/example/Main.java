package org.example;

public class Main {
    public static void main(String[] args) {

        DriveTest Dl= new DriveTest();



        Dl.issueDL("Ravneet",(name)->{
            if (name.length()> 4) {
                return true;
            } else {
                return false;
            }
        });
    }
}