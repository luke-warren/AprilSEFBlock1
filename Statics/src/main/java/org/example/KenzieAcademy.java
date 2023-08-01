package org.example;

public final class KenzieAcademy {

    private final String FOUNDING_DATE = "1/1/2017";
    private final String CA = "California";
    private final String AK = "Alaska";
    private final String SCHOOL_PRESIDENT = "Jack Daniels";
    private final Integer MAX_NUM_STUDENTS = 10000000;
    private Integer enrolledStudents;
    private Integer courses;


    public KenzieAcademy(Integer enrolledStudents, Integer courses) {
        this.enrolledStudents = enrolledStudents;
        this.courses = courses;
    }
}
