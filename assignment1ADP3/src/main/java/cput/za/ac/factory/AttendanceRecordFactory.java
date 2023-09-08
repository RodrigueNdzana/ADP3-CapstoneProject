package cput.za.ac.factory;

import cput.za.ac.domain.AttendanceRecord;
import cput.za.ac.util.Helper;

import static cput.za.ac.util.Helper.isNullOrEmpty;

/*   AttendanceRecordFactory.java
     Author:Neilyn Parnell (218132425)
     Date: 07 April 2022
*/
public class AttendanceRecordFactory {

    public static AttendanceRecord createAttendanceRecord(String AttendanceStatus, String Department, String Date) {
        if (isNullOrEmpty(AttendanceStatus) || isNullOrEmpty(Department) || isNullOrEmpty(Date)) {
            System.out.println("Fields can not be empty. Please make sure you enter all the value");
        }


        return null;
    }
}
