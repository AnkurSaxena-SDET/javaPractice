/*package com.company;

import javax.swing.*;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlywait(duration.ofseconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window.maximize();
    }
    @Test
    Run | Debug
    void testLogin()
    {
     LoginPage lp =new loginPage(driver);
     lp.setUserName("Admin");
     lp.setPassword("admin");
     lp.clickLogin();
     Assert.assertEqual(driver.gettitle(),"OrangeHRM");
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}*/
