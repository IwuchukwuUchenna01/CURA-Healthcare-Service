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
            "Please be informed that your appointment has been booked as following:")
    public void bookAppointment(){
        cure.makeAppointment();
    }
    @AfterTest
    public void logout(){
        cure.logout();
    }
}