<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
</head>
<body onLoad="doT()">

<script>
function doT() {
	document.getElementById("src").setAttribute("value","${src}");
}
</script>

<style type="text/css">
body {
	margin-left: 1em;
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
    width: 700px;
    box-shadow: 10px 10px 5px #888888;
}
</style>
<h2>Update:</h2>
<form action="update.do" method="POST">
<div class="round">
<table >

<tr><th>Column</th><th>Value</th></tr>
<tr><td>UPC:</td><td><input type="text" name="UPC" value="${upc}" size="35" ></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="Manufacturer" value="${manufacturer}" size="35"  autofocus></td></tr>
<tr><td>Brand:</td><td><input type="text" name="Brand" value="${brand}" size="35" ></td></tr>
</table>
</div>
<input type="hidden" id="src" name="src" value="" />
<button type="submit" value="submit">Update</Button> <button type="reset" value="reset">Reset</Button>

</form>
<p id="test"></p>
<br><br><br>
<a href="${src}">Go Back</a>
</body>
</html>