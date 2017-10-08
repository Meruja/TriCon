package TriCon.model;

import org.springframework.data.annotation.Id;

public class InspectionReport

{  @Id
    private String id;
    private String JournalId;
    private String LectId;
    private String Date;
    private String Review ;
    private String LectSign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJournalId() {
        return JournalId;
    }

    public void setJournalId(String journalId) {
        JournalId = journalId;
    }

    public String getLectId() {
        return LectId;
    }

    public void setLectId(String lectId) {
        LectId = lectId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }

    public String getLectSign() {
        return LectSign;
    }

    public void setLectSign(String lectSign) {
        LectSign = lectSign;
    }
}