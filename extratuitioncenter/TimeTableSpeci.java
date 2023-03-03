package extratuitioncenter;

import java.util.Date;

public class TimeTableSpeci {
    private int t_ID;
    private Date l_Date;
    private Date l_Time;
    private String subject_Name;
    private String lessonTime_Status;
    private String l_RoomNo;

    public int gettID() {
        return t_ID;
    }

    public void settID(int tID) {
        this.t_ID = tID;
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

    public String getSubjectName() {
        return subject_Name;
    }

    public void setSubjectName(String subjectName) {
        this.subject_Name = subjectName;
    }

    public String getLessonTimeStatus() {
        return lessonTime_Status;
    }

    public void setLessonTimeStatus(String lessonTimeStatus) {
        this.lessonTime_Status = lessonTimeStatus;
    }

    public String getlRoomNo() {
        return l_RoomNo;
    }

    public void setlRoomNo(String lRoomNo) {
        this.l_RoomNo = lRoomNo;
    }
}
