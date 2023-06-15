package com.hrms.testscript;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;
public class TC001 
{
//public static void main(String args[]) {
@Test
public void tc001(){
	//Test steps
DOMConfigurator.configure("log4j.xml");
General obj=new General();
obj.openApplication();
obj.login();
obj.logout();
obj.closeApplication();
}
}




