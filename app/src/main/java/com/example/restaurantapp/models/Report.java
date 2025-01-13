package com.example.restaurantapp.models;

public class Report {

    private String reportTitle;
    private String reportDescription;
    private String reportDate;
    private String reportData;

    // Constructor
    public Report(String reportTitle, String reportDescription, String reportDate, String reportData) {
        this.reportTitle = reportTitle;
        this.reportDescription = reportDescription;
        this.reportDate = reportDate;
        this.reportData = reportData;
    }

    // Getters and Setters
    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportData() {
        return reportData;
    }

    public void setReportData(String reportData) {
        this.reportData = reportData;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportTitle='" + reportTitle + '\'' +
                ", reportDescription='" + reportDescription + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", reportData='" + reportData + '\'' +
                '}';
    }
}
