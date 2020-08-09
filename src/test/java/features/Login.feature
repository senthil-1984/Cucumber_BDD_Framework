Feature: Application Login


Scenario: Home page default Login
Given User is on Netbanking Landing page
When User login into application with "senthil" username and password "12345"
Then Home page is populated
And Cards are displayed   


Scenario: Home page default Login
Given User is on Netbanking Landing page
When User login into application with "rohit" username and password "6789"
Then Home page is populated
And Cards are displayed   
