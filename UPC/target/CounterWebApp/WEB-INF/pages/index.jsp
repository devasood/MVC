<html>
<body>

Search by:<br>

<form action="form.asp" method="get">
<table style="width:100%">
<tr><td>UPC:</td><td><input type="text" name="UPC" size="35"></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="Manufacturer" size="35"></td></tr>
<tr><td>Brand:</td><td><input type="text" name="Brand" size="35"></td></tr>
<tr><td>Size:</td><td><input type="text" name="Size" size="35"></td></tr>
</table>
<button type="submit" value="submit">Search</Button> <button type="reset" value="reset">Reset</Button>
</form>

<br>Insert into table:<br>

<form action="formI.asp" method="post">
<table style="width:100%">
<tr><td>UPC:</td><td><input type="text" name="UPCI" size="35"></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="ManufacturerI" size="35"></td></tr>
<tr><td>Brand:</td><td><input type="text" name="BrandI" size="35"></td></tr>
<tr><td>Size:</td><td><input type="text" name="SizeI" size="35"></td></tr>
</table>
<button type="submit" value="submitI">Insert</Button> <button type="reset" value="resetI">Reset</Button>
</form>

<table style="width:100%" border="1" >
<tr><th><b>UPC</th>
<th><b>Manufacturer</th>
<th><b>Brand</th>
<th><b>Size</th>
</tr>
${glob}
</table>

<h2>Operation : ${op}</h2>
</body>
</html>