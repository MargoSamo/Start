package org.margo.start.doctor;

import java.util.Date;
public class DoctorsAppointment {

    private HospitalNotifier hospitalNotifier = new HospitalNotifier();
    public boolean appointment(Date date, String name, String tel) {
        hospitalNotifier.notifyHospital();
        return true;
    }



}
