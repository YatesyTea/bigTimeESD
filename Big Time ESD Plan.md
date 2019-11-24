# Big Time ESD Plan



## Table of Contents

1. [Actors](#actors)
2. [Feature List](#feature-list)
   1. [Feature 1: Main Home Page](#feature-1:-main-home-page)
   2. [Feature 2: Login Page](#feature-2:-login-page)
   3. [Feature 3: Registration](#feature-3:-registration-page)
   4. [Feature 4: Registration Approval Upon Payment](#feature-4:-registration-approval-upon-payment)
   5. [Feature 5: Standard User Dashboard](#feature-5:-standard-user-dashboard)
   6. [Feature 6: Admin User Dashboard](#feature-6:-admin-user-dashboard)
   7. [Feature 7: Claim Eligibility](#feature-7:-claim-eligibility)
3. [User Stories](#user-stories)
4. [Member Preferences](#member-preferences-for-mvc)



# Actors

* Admin
* Normal User



# Feature List



## Feature 1: Main home page

Just a bit welcome sign that has a few buttons on it to give access to all points



View:

​	

Controller:

​	



## Feature 2: Login page

Have two text inputs for username and password, then a login button.
Have another button input that redirects to the registration page.

Also requires a model for login, access to db in order to login



Model:

​	

View:

​	

Controller:



## Feature 3: Registration page

Accessed by client

Takes in name, address, dob, date of registration.

Returns: 

* a username
* auto generated password
* grant provisional membership
* requests to charge fee for membership



## Feature 4: Registration approval upon payment

Accessed by admin

* admin confirms fee paid

* suspends if not paid

  



## Feature 5: Standard User Dashboard

Images to fill whitespace

Displays page for user with buttons to access:

* Payment Options

* Claims Page

  



View:



Controller:



## Feature 6: Admin User Dashboard

Displays page for admin:

* Manage Members
* 



View:



Controller:



## Feature 6: Session for members to stay logged in until timeout

Requires access to previous information, cookies/session established



Model:



View:



Controller:





## Feature 7: Claim Eligibility

Uses Web Service to determine whether someone is eligible for a claim



Model:

​	The backend, what are the rules for assessing?

​	Are these claims legit/ within bounds?

​	What Costs for the year will occur? (Update membership costs)

View:

​	

Controller

​	Only displays if the claims are made  by someone of longer membership of 6 months



# User Stories



# Member Preferences for MVC

Bayan: Model, View

Cris: Model, Controller 

Dan: View, Controller

Jason: Any

Josh: Any 

[back to top](#table-of-contents)
