<html>
<body>
<h2>Search a range of products by:<h2>
<form action="search" method="get">
<table style="width:40%">
<tr><td>UPC:</td><td><input type="text" name="UPC" size="35"></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="Manufacturer" size="35"></td></tr>
<tr><td>Brand:</td><td><input type="text" name="Brand" size="35"></td></tr>
<tr><th>Dimensions</th><th>Min Value</th><th>Max Value</th></tr>
<tr><td>Length:</td><td><input type="text" name="Length" size="35"></td><td><input type="text" name="Length2" size="35"></td></tr>
<tr><td>Height:</td><td><input type="text" name="Height" size="35"></td><td><input type="text" name="Height2" size="35"></td></tr>
<tr><td>Width:</td><td><input type="text"  name="Width"  size="35"></td><td><input type="text" name="Width2"  size="35"></td></tr>
<tr><td>Weight:</td><td><input type="text" name="Weight" size="35"></td><td><input type="text" name="Weight2" size="35"></td></tr>
<tr><th>Info</th><th>Min Value</th><th>Max Value</th></tr>
<tr><td>Size:</td><td><input type="text" name="Size" size="35"></td><td><input type="text" name="Size2" size="35"></td></tr>
<tr><td>Type:</td><td><input type="text" name="Type" size="35"></td></tr>
</table>
<input name="Page" value ="0" size="1">
<button type="submit" value="submit">Search</Button> <button type="reset" value="reset">Reset</Button>

</form>

Search Results:<br><br>


<table style="width: 50%" border="1px">
<tr><th>UPC</th><th>Manufacturer</th><th>Brand</th><th>Length</th><th>Height</th><th>Width</th><th>Weight</th><th>Size</th><th>Type</th></tr>
<tr><td><a href="${app}${s00}">${s00}</td><td>${s01}</td><td>${s02}</td><td>${s03}</td><td>${s04}</td><td>${s05}</td><td>${s06}</td><td>${s07}</td><td>${s08}</td></tr>
<tr><td><a href="${app}${s10}">${s10}</td><td>${s11}</td><td>${s12}</td><td>${s13}</td><td>${s14}</td><td>${s15}</td><td>${s16}</td><td>${s17}</td><td>${s18}</td></tr>
<tr><td><a href="${app}${s20}">${s20}</td><td>${s21}</td><td>${s22}</td><td>${s23}</td><td>${s24}</td><td>${s25}</td><td>${s26}</td><td>${s27}</td><td>${s28}</td></tr>
<tr><td><a href="${app}${s30}">${s30}</td><td>${s31}</td><td>${s32}</td><td>${s33}</td><td>${s34}</td><td>${s35}</td><td>${s36}</td><td>${s37}</td><td>${s38}</td></tr>
<tr><td><a href="${app}${s40}">${s40}</td><td>${s41}</td><td>${s42}</td><td>${s43}</td><td>${s44}</td><td>${s45}</td><td>${s46}</td><td>${s47}</td><td>${s48}</td></tr>
<tr><td><a href="${app}${s50}">${s50}</td><td>${s51}</td><td>${s52}</td><td>${s53}</td><td>${s54}</td><td>${s55}</td><td>${s56}</td><td>${s57}</td><td>${s58}</td></tr>
<tr><td><a href="${app}${s60}">${s60}</td><td>${s61}</td><td>${s62}</td><td>${s63}</td><td>${s64}</td><td>${s65}</td><td>${s66}</td><td>${s67}</td><td>${s68}</td></tr>
<tr><td><a href="${app}${s70}">${s70}</td><td>${s71}</td><td>${s72}</td><td>${s73}</td><td>${s74}</td><td>${s75}</td><td>${s76}</td><td>${s77}</td><td>${s78}</td></tr>
<tr><td><a href="${app}${s80}">${s80}</td><td>${s81}</td><td>${s82}</td><td>${s83}</td><td>${s84}</td><td>${s85}</td><td>${s86}</td><td>${s87}</td><td>${s88}</td></tr>
<tr><td><a href="${app}${s90}">${s90}</td><td>${s91}</td><td>${s92}</td><td>${s93}</td><td>${s94}</td><td>${s95}</td><td>${s96}</td><td>${s97}</td><td>${s98}</td></tr>
</table>

<br>
${backlink}
</body>
</html>