var nmarray=["murtaza","gaurav","sagar","rahul"];
var agearray=[22,21,19,20];
var gdarray=["male","male","male","male"];
var emarray=["khilawala62@gmail.com","gauravkamble019@gmail.com","sagar.kirtane1999@gmail.com","dalvi69@gmail.com"];
var unArray = ["mutuz786", "grv1998", "sgk123", "dissrdx"];
var pwArray = ["murtazazaa", "12345678", "kirtane", "riot"];
var score=[0,0,0,0];
var count;

function validate() 
{
	
	var myClass=new Package.com.techlab.practice.TestBox()
	var text=myClass.display();
	alert(text);
    var un = document.getElementById("username").value;
    var pw = document.getElementById("password").value;
    var valid = false;

    for (var i=0; i <unArray.length; i++) 
    {
        if ((un == unArray[i]) && (pw == pwArray[i])) 
       {
            valid = true;
            break;
        }
    }

    if (valid) 
   {
        alert ("Login was successful");
	window.location = "basm/1.html";
    }
    else 
   {
        alert("Invalid Username and/or Password! Please try again. You will not be able to submit this form without a successful login")
        document.getElementById("password").value = "";
        document.getElementById("username").value = "";
        document.getElementById("username").focus();
    }
}