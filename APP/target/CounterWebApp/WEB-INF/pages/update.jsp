<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

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
    width: 600px;
    box-shadow: 10px 10px 5px #888888;
}
</style>
<h2>Update:</h2>
<form action="update.do" method="get">
<table >
<tr><th>Column</th><th>Old Value</th><th>New Value</th></tr>
<tr><td>UPC:</td><td><input type="text" name="UPC" size="35"></td><td><input type="text" name="UPC2" size="35"></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="Manufacturer" size="35"></td><td><input type="text" name="Manufacturer2" size="35"></td></tr>
<tr><td>Brand:</td><td><input type="text" name="Brand" size="35"></td><td><input type="text" name="Brand2" size="35"></td></tr>
<tr><td>Length:</td><td><input type="number" name="Length" size="35"></td><td><input type="number" name="Length2" size="35"></td></tr>
<tr><td>Height:</td><td><input type="number" name="Height" size="35"></td><td><input type="number" name="Height2" size="35"></td></tr>
<tr><td>Width:</td><td><input type="number" name="Width" size="35"></td><td><input type="number" name="Width2" size="35"></td></tr>
<tr><td>Weight:</td><td><input type="number" name="Weight" size="35"></td><td><input type="number" name="Weight2" size="35"></td></tr>
<tr><td>Size:</td><td><input type="number" name="Size" size="35"></td><td><input type="number" name="Size2" size="35"></td></tr>
<tr><td>Type:</td><td><input type="text" name="Type" size="35"></td><td><input type="text" name="Type2" size="35"></td></tr>
</table>
<button type="submit" value="submit">Update</Button> <button type="reset" value="reset">Reset</Button>

</form>
<br>${backlink}
</body>
</html>