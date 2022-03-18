Feature: Login functionality

Background: User is successfully LaunchedAppplication
When user opens "webdriver.chrome.driver" browser with exe as "C:\\Users\\SHREE\\March2022Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user open URL as "https://www.flipkart.com"

@SmokeTest
Scenario: Login functionality with valid credentials 
When user click on cancel button
When user navigate on login
When user click on MyProfile
When user enter username as "9881891149"
When user enter valid password as "Reshma123" 
When user click on login 
Then Application shows login successfully  
 