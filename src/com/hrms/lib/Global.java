package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Global {
//To provide TestData&Objects related to whole application
WebDriver driver=new FirefoxDriver();
//**************TestData
// DT Var VV
public String url="http://183.82.103.245/nareshit/login.php";
public String un="nareshit";
public String pw="nareshit";
public String FN="Selenium";
public String LN="Shiva";

//****************Objects/Elements
public String txt_loginname="txtUserName";
public String txt_password="txtPassword";
public String txt_login="Submit";
public String txt_logout="Logout";
public String EmpInf_frame="rightMenu";
public String btn_Add="//input[@value='Add']";
public String txt_EFN="txtEmpFirstName";
public String txt_ELN="txtEmpLastName";
public String btn_Save="btnEdit";

}


