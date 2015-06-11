<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<script type="text/javascript">

function myFunction() {
    var inpObj = document.getElementById("upc");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo").innerHTML ="";
        inpObj = document.getElementById("manufacturer");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo1").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo1").innerHTML ="";    
        inpObj = document.getElementById("brand");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo2").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo2").innerHTML ="";
        inpObj = document.getElementById("description");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo3").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo3").innerHTML ="";
        inpObj = document.getElementById("itemSize");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo4").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo4").innerHTML ="";} 
</script>

<style type="text/css">
div.alert {
	color:red;
	font-size:50%;
}
table,th,td {
	text-align: left;
    padding: 5px;
    vertical-align: bottom;
}

button {
	float: left;
	margin-right: 40px;
	margin-top: 20px;
	width=50px;height:30px
}
div.round{
	border: 1px solid brown;
    border-radius: 25px;
    width: 600px;
    box-shadow: 10px 10px 5px #888888;
}
.links {
	color:blue;
}
.links:hover {
	text-decoration:underline;
}
</style>


<h2>Insert new Products:</h2>
<form action="create.do" method="get">
<div class="round">
<table >
<tr><td>UPC:</td><td><input id="upc" type="text" name="UPC" size="35" autofocus required placeholder="100066" >
</td><td><div class="alert" id="demo"></div></td></tr>
<tr><td>Manufacturer:</td><td><input id="manufacturer" type="text" name="Manufacturer" size="35" required placeholder="Frito Lays">
</td><td><div class="alert" id="demo1"></div></td></td></tr>
<tr><td>Brand:</td><td><input id="brand" type="text" name="Brand" size="35" required placeholder="Lays">
</td><td><div class="alert" id="demo2"></div></td></td></tr>
<tr><td>Description:</td><td><input id="description" type="text" name="Description" size="35" required placeholder="Tasty Chips">
</td><td><div class="alert" id="demo3"></div></td></td></tr>
<tr><td>ItemSize:</td><td><input id="itemSize" type="text" name="ItemSize" size="35" required placeholder="1 oz">
</td><td><div class="alert" id="demo4"></div></td></td></tr>
</table>
</div>
<button type="submit" value="submit" onClick="return myFunction();">Insert</Button> <button type="reset" value="reset">Reset</Button>
</form>

<form action="create.random" method="get">
<button type="submit" value="submit">InsertRandomTestData</Button>
</form>

<br><br>

<br><br><br>
<a class="links" onclick="history.go(-1)">Go Back</a>
</body>
</html>