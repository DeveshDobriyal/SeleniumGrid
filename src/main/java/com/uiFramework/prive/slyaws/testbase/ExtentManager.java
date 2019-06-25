package com.uiFramework.prive.slyaws.testbase;



import com.relevantcodes.extentreports.ExtentReports;


public class ExtentManager {
    static ExtentReports extent;
    final static String filePath = "C:\\local_repo\\TMNAS-master4\\src\\main\\java\\com\\uiFramework\\prive\\slyaws\\helper\\resource\\reports\\extent.html";
    
    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            extent = new ExtentReports(filePath, true);
        }
        
        return extent;
    }
}
