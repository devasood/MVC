<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<script type="text/javascript">
function f(al) {
	var inpObj= document.getElementById("upc");
	if (inpObj.checkValidity() == false) 
        document.getElementById("demo").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo").innerHTML ="";
}
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
        inpObj = document.getElementById("length");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo3").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo3").innerHTML ="";
        inpObj = document.getElementById("height");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo4").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo4").innerHTML ="";
        inpObj = document.getElementById("width");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo5").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo5").innerHTML ="";
        inpObj = document.getElementById("weight");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo6").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo6").innerHTML ="";
        inpObj = document.getElementById("size");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo7").innerHTML = "*"+inpObj.validationMessage;
    else
        document.getElementById("demo7").innerHTML ="";
        inpObj = document.getElementById("type");
    if (inpObj.checkValidity() == false) 
        document.getElementById("demo8").innerHTML = "*"+inpObj.validationMessage;
	else
        document.getElementById("demo8").innerHTML ="";
} 
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
<tr><td>Length:</td><td><input id="length" type="number" min="0" name="Length" size="35" value="0" readonly placeholder="5" >
</td><td><div class="alert" id="demo3"></div></td></td></tr>
<tr><td>Height:</td><td><input id="height" type="number" min="0" name="Height" size="35" value="0" readonly placeholder="12">
</td><td><div class="alert" id="demo4"></div></td></td></tr>
<tr><td>Width:</td><td><input id="width" type="number" min="0" name="Width" size="35" value="0" readonly placeholder="7">
</td><td><div class="alert" id="demo5"></div></td></td></tr>
<tr><td>Weight:</td><td><input id="weight" type="number" min="0" name="Weight" size="35" value="0" readonly placeholder="60">
</td><td><div class="alert" id="demo6"></div></td></td></tr>
<tr><td>Size:</td><td><input id="size" type="number" min="0" name="Size" size="35" value="0" readonly placeholder="235">
</td><td><div class="alert" id="demo7"></div></td></td></tr>
<tr><td>Type:</td><td><input id="type" type="text" name="Type" size="35" value="0" readonly placeholder="Eatables">
</td><td><div class="alert" id="demo8"></div></td></td></tr>
</table>
</div>
<button type="submit" value="submit" onClick="return myFunction();">Insert</Button> <button type="reset" value="reset">Reset</Button>
</form>

<form action="create.random" method="get">
<button type="submit" value="submit">InsertRandomTestData</Button>
</form>
<br><br><br>
${backlink}
</body>
</html>