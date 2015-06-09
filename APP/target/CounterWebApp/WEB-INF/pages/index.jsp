<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/main.js" />"></script>
<meta charset="ISO-8859-1">
</head>
<body onLoad="addResults();next();">



<h2><a href="/${APP}/create">Insert a new Product</a></h2>

<h2>Search repository by:</h2>

<form id="search" action="index#searchResults" method="get">

<table style="width:40%">

<tr><td>UPC:</td><td><input type="text" name="UPC" size="35" ></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="Manufacturer" size="35"></td></tr>
<tr><td>Brand:</td><td><input type="text" name="Brand" size="35"></td></tr>

</table>

<button type="submit" value="submit" >Search</Button>
<button type="reset" value="reset" >Reset</Button>

</form>

<br><br><br><br><br>

<h2>Search Results:</h2>
<div id="searchResults" ></div>


<table class="links" >
<tr>
<td class="links"><a id="first" class="linksTable" onClick="goToPage(1)">First</a></td>
<td class="links"><a id="prev" class="linksTable" onClick="prev()"><<</a></td>
<td class="links"><a id="one" class="linksTable" onClick="goToPage(this.innerHTML)">1</a></td>
<td class="links"><a id="two" class="linksTable" onClick="goToPage(this.innerHTML)">2</a></td>
<td class="links"><a id="three" class="linksTable" onClick="goToPage(this.innerHTML)">3</a></td>
<td class="links"><a id="four" class="linksTable" onClick="goToPage(this.innerHTML)">4</a></td>
<td class="links"><a id="five" class="linksTable" onClick="goToPage(this.innerHTML)">5</a></td>
<td class="links"><a id="six" class="linksTable" onClick="goToPage(this.innerHTML)">6</a></td>
<td class="links"><a id="seven" class="linksTable" onClick="goToPage(this.innerHTML)">7</a></td>
<td class="links"><a id="eight" class="linksTable" onClick="goToPage(this.innerHTML)">8</a></td>
<td class="links"><a id="nine" class="linksTable" onClick="goToPage(this.innerHTML)">9</a></td>
<td class="links"><a id="ten" class="linksTable" onClick="goToPage(this.innerHTML)">10</a></td>
<td class="links"><a id="next" class="linksTable" onClick="next()">>></a></td>
<td class="links"><a id="last" class="linksTable" onClick="goToPage(parseInt(no_of_pages))">Last</a></td>
<td class="links">Goto Page: <input id="jump" name="Page" form="search" type="number" value="1" min="1"max="" /></td>
</tr>
</table>

<p id="test"></p>
<p id="test2"></p>
<br><br><br>
${backlink}
<br><br>
</body>
</html>