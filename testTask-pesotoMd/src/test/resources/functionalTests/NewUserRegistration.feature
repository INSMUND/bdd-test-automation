Feature: New user registration 

Scenario: User browses from Homepage to RegistrationForm page 
	Given User is on the website Homepage 
	When I find a link to register and click the link 
	Then Registration form is opening 
	
Scenario Outline:User successfully submits Registration form steps with valid credentials 
	Given User is on the RegistrationForm Page 
	When User fills  name in romanian <UserNameRom>, surname in romanian as <UserSurameRom> 
	And fills  name in english <UserNameEng>, surname in english as  <UserSurameEng> 
	And fills  gender as <Gender>,city as <City>, address as <Address> 
	And fills  phone as <Phone>,email as  <Email> 
	And fills  password as <Password>, confirmed password as <ConfirmedPassword> 
	And accepts terms, fills captcha 
	And user clicks the link to submit 
	Then the webpage with message Inregistrare in romanian version or Регистрация in russian appears
	
	
	Examples: 
		|UserNameRom | UserSurameRom |UserNameEng |UserSurameEng | Gender |City    |Address             |Phone   |Email                            |Password      |ConfirmedPassword|
		| Danu       | Stirbu        | Dan        |Shtirbu       | 0      |Chisinau|str.Calea Iesilor 10|79668599|mailf.ortests16082019@gmail.com  |testpesoto2019|testpesoto2019   |  
		| Maxim      | Gutu          | Max        |Gutsu         | 0      |Chisinau|str.Paris 10        |79668809|mailfo.rtests16082019@gmail.com  |testpesoto2019|testpesoto2019   |  
		
		
Scenario Outline: User activates account by using link from confirmation email 
	Given user finds confirmation email in list of inbox email noticed in Registration form <IMAP_AUTH_EMAIL> password <IMAP_AUTH_PWD> server <IMAP_Server> port <IMAP_Port> 
	When  user finds in email confirmation a link to activate account 
	And   user get the link 
	Then  the webpage with message Pagina activata in romanian version or Страница активирована in russian appears 
	
	Examples: 
		|IMAP_AUTH_EMAIL                  |IMAP_AUTH_PWD   |IMAP_Server   |IMAP_Port   |
		|mailf.ortests16082019@gmail.com|mailForTests2019|imap.gmail.com|993         |
		|mailfo.rtests16082019@gmail.com|mailForTests2019|imap.gmail.com |993         |
		
		
    