package org.example;

public class DriveTest {

    public void issueDL(String name, ITest itest){
        itest.testName(name);
        if(itest.testName(name)){
            System.out.println("DL Issued.");
        }
        else{
            System.out.println("Dl not issued");
        }
    }
}
