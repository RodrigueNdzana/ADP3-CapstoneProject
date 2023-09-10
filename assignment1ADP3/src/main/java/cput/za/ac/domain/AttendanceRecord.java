package cput.za.ac.domain;

import jakarta.persistence.*;

/*   AttendanceRecord.java
     Domain for Attendance Record
     Author:Neilyn Parnell (218132425)
     Date: 07 April 2022
*/
@Entity
public class AttendanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Attendance Id", length = 255)
    private int AttendanceID;
    @Column(name="student id", length = 255)
    private int StudentID;
    @Column(name="attendance status", length = 255)
    private String AttendanceStatus;

    @Column(name="date", length = 255)
    private String Date;
    @Column(name="department", length = 255)
    private String Department;
    @Column(name="class", length = 255)
    private String Class;
    @Column(name="teaher id", length = 255)
    private String TeacherID;
    @Column(name="subject id", length = 255)
    private String SubjectID;

    public AttendanceRecord() {
    }

    private AttendanceRecord(AttendanceRecord.Builder builder){
        this.AttendanceID = builder.AttendanceID;
        this.StudentID = builder.StudentID;
        this.AttendanceStatus = builder.AttendanceStatus;
        this.Date = builder.Date;
        this.Department = builder.Department;
        this.Class = builder.Class;
        this.TeacherID = builder.TeacherID;
        this.SubjectID = builder.SubjectID;
    }
    public class Builder{
        public int AttendanceID;
        public int StudentID;
        public String AttendanceStatus;

        public String Date;
        public String Department;
        public String Class;
        public String TeacherID;
        public String SubjectID;

    }

    public void setAttendanceID(int attendanceID) {
        AttendanceID = attendanceID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        AttendanceStatus = attendanceStatus;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public void setTeacherID(String teacherID) {
        TeacherID = teacherID;
    }

    public void setSubjectID(String subjectID) {
        SubjectID = subjectID;
    }

    @Override
    public String toString() {
        return "AttendanceRecord{" +
                "AttendanceID=" + AttendanceID +
                ", StudentID=" + StudentID +
                ", AttendanceStatus='" + AttendanceStatus + '\'' +
                ", Date='" + Date + '\'' +
                ", Department='" + Department + '\'' +
                ", Class='" + Class + '\'' +
                ", TeacherID='" + TeacherID + '\'' +
                ", SubjectID='" + SubjectID + '\'' +
                '}';
    }
}
