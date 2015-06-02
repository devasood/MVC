<html>
<body>
Insert new Products:<br>
<form action="create.do" method="get">
<table style="width:100%">
<tr><td>UPC:</td><td><input type="text" name="UPC" size="35"></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="Manufacturer" size="35"></td></tr>
<tr><td>Brand:</td><td><input type="text" name="Brand" size="35"></td></tr>
<tr><td>Length:</td><td><input type="text" name="Length" size="35"></td></tr>
<tr><td>Height:</td><td><input type="text" name="Height" size="35"></td></tr>
<tr><td>Width:</td><td><input type="text" name="Width" size="35"></td></tr>
<tr><td>Weight:</td><td><input type="text" name="Weight" size="35"></td></tr>
<tr><td>Size:</td><td><input type="text" name="Size" size="35"></td></tr>
<tr><td>Type:</td><td><input type="text" name="Type" size="35"></td></tr>
</table>
<button type="submit" value="submit">Insert</Button> <button type="reset" value="reset">Reset</Button>
</form>

<form action="create.random" method="get">
<button type="submit" value="submit">InsertRandom</Button>
</form>
<br>${backlink}
</body>
</html>