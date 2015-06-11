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

<h2>Delete items:</h2>
<form action="delete.do" method="get">
<div class="round">
<table >
<tr><td>UPC:</td><td><input id="upc" type="text" name="UPC" value="${UPC}" size="35" autofocus  placeholder="100066" >
</td><td><div class="alert" id="demo"></div></td></tr>
<tr><td>Manufacturer:</td><td><input id="manufacturer" type="text" name="Manufacturer" size="35"  placeholder="Frito Lays">
</td><td><div class="alert" id="demo1"></div></td></td></tr>
<tr><td>Brand:</td><td><input id="brand" type="text" name="Brand" size="35"  placeholder="Lays">
</td><td><div class="alert" id="demo2"></div></td></td></tr>
<tr><td>Length:</td><td><input id="length" type="number" min="0" name="Length" size="35"  placeholder="5" >
</td><td><div class="alert" id="demo3"></div></td></td></tr>
<tr><td>Height:</td><td><input id="height" type="number" min="0" name="Height" size="35"  placeholder="12">
</td><td><div class="alert" id="demo4"></div></td></td></tr>
<tr><td>Width:</td><td><input id="width" type="number" min="0" name="Width" size="35"  placeholder="7">
</td><td><div class="alert" id="demo5"></div></td></td></tr>
<tr><td>Weight:</td><td><input id="weight" type="number" min="0" name="Weight" size="35"  placeholder="60">
</td><td><div class="alert" id="demo6"></div></td></td></tr>
<tr><td>Size:</td><td><input id="size" type="number" min="0" name="Size" size="35"  placeholder="235">
</td><td><div class="alert" id="demo7"></div></td></td></tr>
<tr><td>Type:</td><td><input id="type" type="text" name="Type" size="35"  placeholder="Eatables">
</td><td><div class="alert" id="demo8"></div></td></td></tr>
</table>
</div>
<button type="submit" value="submit">Delete</Button> <button type="reset" value="reset">Reset</Button>

</form>

<br><br><br>
${backlink}
</body>
</html>