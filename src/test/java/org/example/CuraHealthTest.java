package org.example;

import curaHealth.CuraHealthObjects;
import io.qameta.allure.Description;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CuraHealthTest {
    CuraHealthObjects cure = new CuraHealthObjects();
    @BeforeTest
    public void openPage(){
        cure.setup();
    }
    @Test(priority = 0)
    @Description("Appointment Confirmation\n" +
            "Please be informed that your appointment has been booked as following:\n"+
    "Facility:  " + "\t\t\tTokyo CURA Healthcare Center\n" +
            "\n" +
            "Apply for hospital readmission:    " +
            "\t\t\tYes" +
            "\n" +
            "Healthcare Program:     " +
            "\t\t\tMedicaid" +
            "\n" +
            "Visit Date:     " +
            "\t\t\t20/12/2023" +
            "\n" +
            "Comment:    " +
            "\t\t\tthis is the date suitable for me")
    public void bookAppointment(){
        cure.makeAppointment();
    }
    @Test(priority = 1)
    @Description("Logs User out")
    public void logout(){
        cure.logout();
    }
    @AfterTest
    public void closeUp(){
        cure.dissolve();
    }
}