package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import org.jetbrains.annotations.NotNull;
import org.testng.ITestResult;

import java.time.LocalDateTime;

public class reportGenerator {
    protected ExtentTest test;
    protected ExtentReports extent;
    protected ExtentSparkReporter spark;

    public reportGenerator(String reportName){
        this.extent = new ExtentReports();
        this.spark = new ExtentSparkReporter("target/reports/"+reportName+"-"+getDate()+".html");
        this.spark.config().setDocumentTitle(reportName);
        this.spark.config().setReportName(reportName);
        this.spark.config().setTheme(Theme.STANDARD);
        this.spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        this.extent.attachReporter(spark);

    }

    public void getResult(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            this.getTest().log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
            this.getTest().fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            this.getTest().log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else {
            this.getTest().log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            this.getTest().skip(result.getThrowable());
        }
    }

    //setter of test
    public void setTestName(String testName){
        this.test = extent.createTest(testName);
    }
    //getter of test
    public ExtentTest getTest(){
        return this.test;
    }

    public void finishReport(){
        this.extent.flush();
    }

    public String getDate (){
//fomato de fecha para el documento
        LocalDateTime date = LocalDateTime.now();
        String formattedDate = "D"+date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+date.getYear()+"-H"+date.getHour()+"-"+date.getMinute();
        return formattedDate;

    }



}