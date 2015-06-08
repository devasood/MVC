<!DOCTYPE html>
<head>
<script src="jquery-1.11.3.min.js"></script>
<meta charset="ISO-8859-1">
</head>
<body onLoad="addResults();next();">

<script >

var clicks = parseInt("${currentPage}");
var no_of_pages=parseInt("${no_of_records}")/10+1;    
var message="${message}";
var stop=1;

if(message.length>0)
alert("${message}");



function next() {        

document.getElementById("jump").setAttribute("max",parseInt(no_of_pages));

if(no_of_pages>1.1)
document.getElementById("test").innerHTML=parseInt(no_of_pages*10-10)+" records displayed in ${stats}";
else
document.getElementById("test").innerHTML=(no_of_pages)*10-10+" record displayed.";

    if(no_of_pages>clicks)    
    document.getElementById("one").innerHTML = clicks;
    else
    document.getElementById("one").innerHTML = "";
    if(no_of_pages>clicks+1)
    document.getElementById("two").innerHTML = clicks+1;
    else
    document.getElementById("two").innerHTML = "";
    if(no_of_pages>clicks+2)
    document.getElementById("three").innerHTML = clicks+2;
    else
    document.getElementById("three").innerHTML = "";
    if(no_of_pages>clicks+3)
    document.getElementById("four").innerHTML = clicks+3;
    else
    document.getElementById("four").innerHTML = "";
    if(no_of_pages>clicks+4)
    document.getElementById("five").innerHTML = clicks+4;
    else
    document.getElementById("five").innerHTML = "";
    if(no_of_pages>clicks+5)
    document.getElementById("six").innerHTML = clicks+5;
    else
    document.getElementById("six").innerHTML = "";
    if(no_of_pages>clicks+6)
    document.getElementById("seven").innerHTML = clicks+6;
    else
    document.getElementById("seven").innerHTML = "";
    if(no_of_pages>clicks+7)
    document.getElementById("eight").innerHTML = clicks+7;
    else
    document.getElementById("eight").innerHTML = "";
    if(no_of_pages>clicks+8)
    document.getElementById("nine").innerHTML = clicks+8;
    else
    document.getElementById("nine").innerHTML = "";
    if(no_of_pages>clicks+9)
    document.getElementById("ten").innerHTML = clicks+9;
    else
    document.getElementById("ten").innerHTML = "";
    if(no_of_pages>=clicks+10)    
    clicks += 10;
    if(stop>1)
    goToPage(document.getElementById("one").innerHTML);
    else
    stop=2;
};
    
function prev() {
	if(clicks>11)
        clicks -= 10;
    else
        clicks=1;
    if(no_of_pages>clicks)    
    document.getElementById("one").innerHTML = clicks;
    else
    document.getElementById("one").innerHTML = "";
    if(no_of_pages>clicks+1)
    document.getElementById("two").innerHTML = clicks+1;
    else
    document.getElementById("two").innerHTML = "";
    if(no_of_pages>clicks+2)
    document.getElementById("three").innerHTML = clicks+2;
    else
    document.getElementById("three").innerHTML = "";
    if(no_of_pages>clicks+3)
    document.getElementById("four").innerHTML = clicks+3;
    else
    document.getElementById("four").innerHTML = "";
    if(no_of_pages>clicks+4)
    document.getElementById("five").innerHTML = clicks+4;
    else
    document.getElementById("five").innerHTML = "";
    if(no_of_pages>clicks+5)
    document.getElementById("six").innerHTML = clicks+5;
    else
    document.getElementById("six").innerHTML = "";
    if(no_of_pages>clicks+6)
    document.getElementById("seven").innerHTML = clicks+6;
    else
    document.getElementById("seven").innerHTML = "";
    if(no_of_pages>clicks+7)
    document.getElementById("eight").innerHTML = clicks+7;
    else
    document.getElementById("eight").innerHTML = "";
    if(no_of_pages>clicks+8)
    document.getElementById("nine").innerHTML = clicks+8;
    else
    document.getElementById("nine").innerHTML = "";
    if(no_of_pages>clicks+9)
    document.getElementById("ten").innerHTML = clicks+9;
    else
    document.getElementById("ten").innerHTML = "";
    goToPage(document.getElementById("one").innerHTML);
};    

function addResults() {
	
	var sr=document.getElementById("searchResults");
	var empty="";
	var text="<table id=\"result\"><tr><th>UPC</th><th>Manufacturer</th><th>Brand</th><th>Update</th><th>Delete</th></tr>";
		if("${s00}".length>0)
		text+="<tr><td>${s00}</td><td>${s01}</td><td>${s02}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s00})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s00})\">Delete</a></td></tr>";
		else
		empty="No Results to display."
		if("${s10}".length>0)
		text+="<tr><td>${s10}</td><td>${s11}</td><td>${s12}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s10})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s10})\">Delete</a></td></tr>";
		if("${s20}".length>0)
		text+="<tr><td>${s20}</td><td>${s21}</td><td>${s22}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s20})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s20})\">Delete</a></td></tr>";
		if("${s30}".length>0)
		text+="<tr><td>${s30}</td><td>${s31}</td><td>${s32}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s30})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s30})\">Delete</a></td></tr>";
		if("${s40}".length>0)
		text+="<tr><td>${s40}</td><td>${s41}</td><td>${s42}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s40})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s40})\">Delete</a></td></tr>";
		if("${s50}".length>0)
		text+="<tr><td>${s50}</td><td>${s51}</td><td>${s52}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s50})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s50})\">Delete</a></td></tr>";
		if("${s60}".length>0)
		text+="<tr><td>${s60}</td><td>${s61}</td><td>${s62}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s60})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s60})\">Delete</a></td></tr>";
		if("${s70}".length>0)
		text+="<tr><td>${s70}</td><td>${s71}</td><td>${s72}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s70})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s70})\">Delete</a></td></tr>";
		if("${s80}".length>0)
		text+="<tr><td>${s80}</td><td>${s81}</td><td>${s82}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s80})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s80})\">Delete</a></td></tr>";
		if("${s90}".length>0)
		text+="<tr><td>${s90}</td><td>${s91}</td><td>${s92}</td><td><a class=\"linksTable\" onClick=\"updateRec(${s90})\">Update</a></td><td><a class=\"linksTable\" onClick=\"deleteRec(${s90})\">Delete</a></td></tr>";
		text+="</table>";
	sr.innerHTML+=text;
	sr.innerHTML+=empty;
		
}

function deleteRec(upc)
{	if(confirm('Are you sure you want to delete?'))
   location.href = URL_add_parameter(location.href, 'Delete', upc);
			
}




function updateRec(upc)
{	var x=URL_add_parameter("/${APP}/update?", 'UPC', upc);
	x=URL_add_parameter(x, 'src', encodeURIComponent(location.href));
   	location.href = x;
			
}

function goToPage(page)
{location.href = URL_add_parameter(location.href, 'Page', page);
}

function URL_add_parameter(url, param, value){
    var hash       = {};
    var parser     = document.createElement('a');

    parser.href    = url;

    var parameters = parser.search.split(/\?|&/);

    for(var i=0; i < parameters.length; i++) {
        if(!parameters[i])
            continue;

        var ary      = parameters[i].split('=');
        hash[ary[0]] = ary[1];
    }

    hash[param] = value;

    var list = [];  
    Object.keys(hash).forEach(function (key) {
        list.push(key + '=' + hash[key]);
    });

    parser.search = '?' + list.join('&');
    return parser.href;
}
</script>

<style type="text/css">
#one {
	color:black;
	font-weight:bold;
}

a.links {
	float: left;
	margin-top: 15px;
	margin-right: 20px;    
    display:inline-block;
    border-style:none;
    font-size: 100%;
    color: blue;
    background-color: white;
}
a.linksTable {
	float: left;
	display:inline-block;
    border-style:none;
    font-size: 100%;
    color: blue;
    background-color: white;
}

a.links:hover,a.linksTable:hover { 
    text-decoration:underline;
}
body {
	padding-left:1em
	
}

button {
	float: left;
	margin-right: 40px;
	margin-top: 20px;
	width=50px;height:30px
}

table,th,td {
	border-collapse: collapse;
	border:1px solid green;
}

table.links,th.links,td.links {
	border-collapse: collapse;
	border:0px;
	padding:10px;
}

th {padding: 5px;
    background-color: green;
    color: white;
}

td {
	text-align: left;
    padding: 5px;
    vertical-align: bottom;
}

div.links {
	display:inline-block;
	height:40px;
	max-width:60%;
	overflow: visible;
}
#nums {
	width:500px;
}
</style>

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