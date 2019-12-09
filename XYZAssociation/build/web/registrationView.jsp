<%-- 
    Document   : registrationView
    Created on : 22-Nov-2019, 13:07:23
    Author     : joshp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>

        <style>

            #nameid
            {   
                text-align: center;
                height:20px;
                width:200px;
                font-family: Verdana;
                font-size:14pt;
                color: teal;
            }

            #password
            {   
                text-align: center;
                height:20px;
                width:200px;
                font-family: Verdana;
                font-size:14pt;
                color: teal;
            }

            #conf_password
            {   
                text-align: center;
                height:20px;
                width:200px;
                font-family: Verdana;
                font-size:14pt;
                color: teal;
            }

            #address
            {   
                text-align: center;
                height:20px;
                width:200px;
                font-family: Verdana;
                font-size:14pt;
                color: teal;
            }

            #dob
            {   
                text-align: center;
                height:20px;
                width:200px;
                font-family: Verdana;
                font-size:14pt;
                color: teal;
            }

            #textid
            {
                font-family: Verdana;
                font-size:14pt;
                color: white;
            }

        </style>
        
    <h1 style="text-align:center; position:fixed; top:5px; right:5px;"><a id="textid" href="/XYZAssociation/index.html">Log Out</a></h1> 
    </head>

    <body style="background-color: teal">

        <form method="post" action="RegisterUser.do"><p style="text-align:center">
                <br /><label id="textid">Full Name:</label><br />
                <input required pattern =".*\S+.*" id="nameid" type="text" name="name" oninput="checkName(this)">
                <br /><label id="textid">Address: </label><br/>
                <input id="address" type="text" name="address">
                <br /><label id="textid">Date of Birth: </label><br/>
                <input type="date" name="dob">
                <br /><label id="textid">Password: </label><br />
                <input required pattern =".*\S+.*" id="password" type="password" name="pass1" oninput="checkPassword(this)">
                <br /><label id="textid">Confirm Password: </label><br />
                <input required pattern =".*\S+.*" id="conf_password" type="password" name="pass2">

                <script language="javascript" type="text/javascript">

                    function checkName(input) {

                        if ((input.value).length > 32) {
                            input.setCustomValidity("Name Has To Be Less Than 32 Characters");
                        } else if ((input.value).length < 6) {
                            input.setCustomValidity("Name Has To Be More Than 6 Characters");
                        } else {
                            input.setCustomValidity("");
                        }
                    }

                    function checkPassword(input) {
                        var pass1 = document.getElementById("password");
                        var pass2 = document.getElementById("conf_password");

                        if ((input.value).length > 32) {
                            input.setCustomValidity("Password Has To Be Less Than 32 Characters");
                        } else if ((input.value).length < 6) {
                            input.setCustomValidity("Password Has To Be More Than 6 Characters");
                        } else if (pass1.value != pass2.value) {
                            input.setCustomValidity("Passwords Must Match");
                        } else {
                            input.setCustomValidity("");
                        }

                    }
                </script>

                <br><input type="SUBMIT" value="Sign Up" style="color: royalblue">
            </p></form>
    </body>

</html>
