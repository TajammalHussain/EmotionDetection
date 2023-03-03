package extratuitioncenter;

import java.util.Date;

public class LessonSpecification {
    private int l_ID;
    private int t_ID;
    private int s_ID;
    private String l_Subject;
    private String l_Status;
    private String student_Progress;
    private Date l_Date;
    private Date l_Time;

    public int getlID() {
        return l_ID;
    }

    public void setlID(int lID) {
        this.l_ID = lID;
    }

    public int gettID() {
        return t_ID;
    }

    public void settID(int tID) {
        this.t_ID = tID;
    }

    public int getsID() {
        return s_ID;
    }

    public void setsID(int sID) {
        this.s_ID = sID;
    }

    public String getlSubject() {
        return l_Subject;
    }

    public void setlSubject(String lSubject) {
        this.l_Subject = lSubject;
    }

    public String getlStatus() {
        return l_Status;
    }

    public void setlStatus(String lStatus) {
        this.l_Status = lStatus;
    }

    public String getStudentProgress() {
        return student_Progress;
    }

    public void setStudentProgress(String studentProgress) {
        this.student_Progress = studentProgress;
    }

    public Date getlDate() {
        return l_Date;
    }

    public void setlDate(Date lDate) {
        this.l_Date = lDate;
    }

    public Date getlTime() {
        return l_Time;
    }

    public void setlTime(Date lTime) {
        this.l_Time = lTime;
    }
}
