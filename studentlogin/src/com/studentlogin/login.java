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
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");//��·��
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";//������ַ
	}
	@Test
	public void login1() throws InterruptedException {
		driver.get(url);
		//�û�������
		driver.findElement(By.name("username")).sendKeys("hujianming");//�˺�
		//��������
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//����
		//ѡ������
		WebElement s=driver.findElement(By.name("usertype"));//��λλ��
		Select s1=new Select(s);
		//ͨ��������ȡ
		s1.selectByIndex(2);
		Thread.sleep(8000);//��ͣ8s--������֤��
		driver.findElement(By.className("tm_btn")).click();//�����¼
	}
}
