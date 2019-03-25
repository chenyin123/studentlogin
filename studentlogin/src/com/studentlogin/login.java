package com.studentlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	public static WebDriver driver;
	public static String url;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");//打开路径
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";//定义网址
	}
	@Test
	public void login1() throws InterruptedException {
		driver.get(url);
		//用户名输入
		driver.findElement(By.name("username")).sendKeys("hujianming");//账号
		//密码输入
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//密码
		//选择类型
		WebElement s=driver.findElement(By.name("usertype"));//定位位置
		Select s1=new Select(s);
		//通过索引获取
		s1.selectByIndex(2);
		Thread.sleep(8000);//暂停8s--输入验证码
		driver.findElement(By.className("tm_btn")).click();//点击登录
	}
}
