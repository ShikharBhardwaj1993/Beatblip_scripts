package Webapp.BeatBlip;

import org.testng.annotations.Test;

import Webapp.BeatBlip.Base.baseclass;
import Webapp.BeatBlip.Pages.Homepage;
import Webapp.BeatBlip.Pages.Addscripts;
import Webapp.BeatBlip.Pages.login;

public class TS004_Automateclick extends baseclass {

	
	
	
	
	@Test
	public void deleteprojectscript(){
	
		login logn3 = new login(driver);
		logn3.loginBB();
		Addscripts open1 = new Addscripts(driver);
		open1.opentestsuite();
		open1.Action();
		open1.deletescript();
		//log.info("Project Deleted");
	}
	
	
	
	
	
	
	
	
	
	
}
