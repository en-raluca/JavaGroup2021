package com.en.diana.homeworkOOP.exercitiul8;

public class StudentAbsolvent extends Student {
    private int anAbsolvire;
    private int notaLicenta;
    private int mediaAnilor;

    public StudentAbsolvent(String nume, int anInscriere, int anAbsolvire, int notaLicenta, int mediaAnilor) {
        super(nume, anInscriere);
        this.anAbsolvire = anAbsolvire;
        this.notaLicenta = notaLicenta;
        this.mediaAnilor = mediaAnilor;
    }

    public int getAnAbsolvire() {
        return anAbsolvire;
    }

    public void setAnAbsolvire(int anAbsolvire) {
        this.anAbsolvire = anAbsolvire;
    }

    public int getNotaLicenta() {
        return notaLicenta;
    }

    public void setNotaLicenta(int notaLicenta) {
        this.notaLicenta = notaLicenta;
    }

    public int getMediaAnilor() {
        return mediaAnilor;
    }

    public void setMediaAnilor(int mediaAnilor) {
        this.mediaAnilor = mediaAnilor;
    }

    @Override
    public void showStudentDetails() {

    }
}

