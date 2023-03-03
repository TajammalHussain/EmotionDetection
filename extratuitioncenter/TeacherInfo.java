package extratuitioncenter;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author Hussain
 */
public class TeacherInfo {

    private String teacher_Name;
    private String sbjct;
    private String teacher_ID;
    private String contact_Number;

    Date d = new Date();

    public TeacherInfo(String namel, String idl, String sbjct,String contact_Number) {

        this.setName(namel);
        this.setId(idl);
        this.setSubject(sbjct);
        this.setContactNumber(contact_Number);
    }

    public TeacherInfo() {

        this.teacher_Name = "Mike";
        this.teacher_ID = "1";
        this.sbjct = "Science";
        this.contact_Number="87643333";


    }

    public String getName() {
        return this.teacher_Name;
    }

    public void setName(String name) {

        this.teacher_Name = name;
    }

    public String getId() {
        return this.teacher_ID;
    }

    public void setId(String id) {
        this.teacher_ID = id;
    }

    public String getSubject() {
        return this.sbjct;
    }

    public void setSubject(String subject) {
        this.sbjct = subject;
    }

     public String getContactNumber() {
        return contact_Number;
    }

    public void setContactNumber(String contactNumber) {
        this.contact_Number = contactNumber;
    }
    
    public String toString() {
        return "Customer Name: " + this.teacher_Name + " Customer Age: " + this.teacher_ID + " Student: " + this.sbjct;
    }

   
}
