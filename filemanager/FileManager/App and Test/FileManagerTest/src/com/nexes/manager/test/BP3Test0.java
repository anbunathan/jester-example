package com.nexes.manager.test;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.view.KeyEvent;

import com.nexes.manager.Main;

public class BP3Test0 extends
		ActivityInstrumentationTestCase2<Main> {

	private Solo driver;

	//-- test cases -----------------------------------//
	
 	/**
	 * Default Testcase
	 *
	 * 
	 */
	@Smoke 
	public void test_t0(){
		try {
			// Trigger web events
			for (int i = 0; i < 1; i++){
			try {
					// Trigger web events
					driver.clickOnImageButton(1);
					driver.sendKey(Solo.MENU);
					driver.sendKey(KeyEvent.KEYCODE_MENU);
					driver.clickOnMenuItem("New Directory");
					driver.sleep(1000);
					driver.enterText(0, "f"+i);
					driver.clickOnButton("Create");
					driver.sleep(5000);
					driver.clickOnMenuItem("Settings");
					driver.sleep(1000);
					driver.clickOnImageButton(1);
					driver.clickOnText("Type");
					driver.goBack();
					driver.goBack();
					driver.sleep(5000);

				} catch(Exception exc){
					exc.printStackTrace();
				}
			}
			driver.sendKey(Solo.MENU);
			driver.sendKey(KeyEvent.KEYCODE_MENU);
			driver.clickOnMenuItem("Search");
			driver.sleep(1000);
			driver.clickOnButton("Search");
			driver.goBack();


		} catch(Exception e){
			e.printStackTrace();
		}
	}

	//-------------------------------------------------//

	public BP3Test0(){
		super("com.nexes.manager", Main.class);
	}

	@Override
	public void setUp() throws Exception {
		driver = new Solo(getInstrumentation(), getActivity());
	}


	@Override
	public void tearDown() throws Exception {
		// Robotium will finish all the activities that have been opened
		driver.finishOpenedActivities();
	}
}