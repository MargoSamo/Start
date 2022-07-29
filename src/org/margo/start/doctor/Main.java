package org.margo.start.doctor;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        DoctorsAppointment doctorsAppointment = new DoctorsAppointment();
        doctorsAppointment.appointment(date, "Felics Cot", "123123");

    }
}
