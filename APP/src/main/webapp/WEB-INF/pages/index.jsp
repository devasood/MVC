<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
</head>
<body onLoad="addResults();next();">

<script type="text/javascript">

var clicks = parseInt("${currentPage}");
    
function next() {        
        
    document.getElementById("one").innerHTML = clicks;
    document.getElementById("two").innerHTML = clicks+1;
    document.getElementById("three").innerHTML = clicks+2;
    document.getElementById("four").innerHTML = clicks+3;
    document.getElementById("five").innerHTML = clicks+4;
    document.getElementById("six").innerHTML = clicks+5;
    document.getElementById("seven").innerHTML = clicks+6;
    document.getElementById("eight").innerHTML = clicks+7;
    document.getElementById("nine").innerHTML = clicks+8;
    document.getElementById("ten").innerHTML = clicks+9;
    clicks += 10;
};
    
function prev() {
	if(clicks>11)
        clicks -= 10;
    else
        clicks=1;
    document.getElementById("one").innerHTML = clicks;
    document.getElementById("two").innerHTML = clicks+1;
    document.getElementById("three").innerHTML = clicks+2;
    document.getElementById("four").innerHTML = clicks+3;
    document.getElementById("five").innerHTML = clicks+4;
    document.getElementById("six").innerHTML = clicks+5;
    document.getElementById("seven").innerHTML = clicks+6;
    document.getElementById("eight").innerHTML = clicks+7;
    document.getElementById("nine").innerHTML = clicks+8;
    document.getElementById("ten").innerHTML = clicks+9;
};    

function addResults() {
	
	var sr=document.getElementById("searchResults");
	var empty="";
	var text="<table id=\"result\"><tr><th>UPC</th><th>Manufacturer</th><th>Brand</th><th>Length</th><th>Height</th><th>Width</th><th>Weight</th><th>Size</th><th>Type</th><th>Update</th><th>Delete</th></tr>";
		if("${s00}".length>0)
		text+="<tr><td>${s00}</td><td>${s01}</td><td>${s02}</td><td>${s03}</td><td>${s04}</td><td>${s05}</td><td>${s06}</td><td>${s07}</td><td>${s08}</td><td>Update</td><td>Delete</td></tr>";
		else
		empty="No Results to display."
		if("${s10}".length>0)
		text+="<tr><td>${s10}</td><td>${s11}</td><td>${s12}</td><td>${s13}</td><td>${s14}</td><td>${s15}</td><td>${s16}</td><td>${s17}</td><td>${s18}</td><td>Update</td><td>Delete</td></tr>";
		if("${s20}".length>0)
		text+="<tr><td>${s20}</td><td>${s21}</td><td>${s22}</td><td>${s23}</td><td>${s24}</td><td>${s25}</td><td>${s26}</td><td>${s27}</td><td>${s28}</td><td>Update</td><td>Delete</td></tr>";
		if("${s30}".length>0)
		text+="<tr><td>${s30}</td><td>${s31}</td><td>${s32}</td><td>${s33}</td><td>${s34}</td><td>${s35}</td><td>${s36}</td><td>${s37}</td><td>${s38}</td><td>Update</td><td>Delete</td></tr>";
		if("${s40}".length>0)
		text+="<tr><td>${s40}</td><td>${s41}</td><td>${s42}</td><td>${s43}</td><td>${s44}</td><td>${s45}</td><td>${s46}</td><td>${s47}</td><td>${s48}</td><td>Update</td><td>Delete</td></tr>";
		if("${s50}".length>0)
		text+="<tr><td>${s50}</td><td>${s51}</td><td>${s52}</td><td>${s53}</td><td>${s54}</td><td>${s55}</td><td>${s56}</td><td>${s57}</td><td>${s58}</td><td>Update</td><td>Delete</td></tr>";
		if("${s60}".length>0)
		text+="<tr><td>${s60}</td><td>${s61}</td><td>${s62}</td><td>${s63}</td><td>${s64}</td><td>${s65}</td><td>${s66}</td><td>${s67}</td><td>${s68}</td><td>Update</td><td>Delete</td></tr>";
		if("${s70}".length>0)
		text+="<tr><td>${s70}</td><td>${s71}</td><td>${s72}</td><td>${s73}</td><td>${s74}</td><td>${s75}</td><td>${s76}</td><td>${s77}</td><td>${s78}</td><td>Update</td><td>Delete</td></tr>";
		if("${s80}".length>0)
		text+="<tr><td>${s80}</td><td>${s81}</td><td>${s82}</td><td>${s83}</td><td>${s84}</td><td>${s85}</td><td>${s86}</td><td>${s87}</td><td>${s88}</td><td>Update</td><td>Delete</td></tr>";
		if("${s90}".length>0)
		text+="<tr><td>${s90}</td><td>${s91}</td><td>${s92}</td><td>${s93}</td><td>${s94}</td><td>${s95}</td><td>${s96}</td><td>${s97}</td><td>${s98}</td><td>Update</td><td>Delete</td></tr>";
		text+="</table>";
	sr.innerHTML+=text;
	sr.innerHTML+=empty;
		
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
a.links:hover { 
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
	border: 1px solid green;
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

<form action="index#searchResults" method="get">

<table style="width:40%">

<tr><td>UPC:</td><td><input type="text" name="UPC" size="35" ></td><td></td></tr>
<tr><td>Manufacturer:</td><td><input type="text" name="Manufacturer" size="35"></td><td></td></tr>
<tr><td>Brand:</td><td><input type="text" name="Brand" size="35"></td><td></td></tr>
<tr><th>Dimensions</th><th>Min Value</th><th>Max Value</th></tr>
<tr><td>Length:</td><td><input type="text" name="Length" size="35"></td><td><input type="text" name="Length2" size="35"></td></tr>
<tr><td>Height:</td><td><input type="text" name="Height" size="35"></td><td><input type="text" name="Height2" size="35"></td></tr>
<tr><td>Width:</td><td><input type="text"  name="Width"  size="35"></td><td><input type="text" name="Width2"  size="35"></td></tr>
<tr><td>Weight:</td><td><input type="text" name="Weight" size="35"></td><td><input type="text" name="Weight2" size="35"></td></tr>
<tr><th>Info</th><th>Min Value</th><th>Max Value</th></tr>
<tr><td>Size:</td><td><input type="text" name="Size" size="35"></td><td><input type="text" name="Size2" size="35"></td></tr>
<tr><td>Type:</td><td><input type="text" name="Type" size="35"></td><td></td></tr>

</table>

<input type ="hidden"name="Page" value = "1" size="1">
<button type="submit" value="submit" >Search</Button>
<button type="reset" value="reset" >Reset</Button>

</form>

<br><br><br><br><br>

<h2>Search Results:</h2>
<div id="searchResults" ></div>

<div class="links"><a id="prev" class="links" onClick="prev()"><<</a></div>
<div id="nums" class="links">

<a id="one" class="links" onClick="goToPage(this.innerHTML)">1</a>
<a id="two" class="links" onClick="goToPage(this.innerHTML)">2</a>
<a id="three" class="links" onClick="goToPage(this.innerHTML)">3</a>
<a id="four" class="links" onClick="goToPage(this.innerHTML)">4</a>
<a id="five" class="links" onClick="goToPage(this.innerHTML)">5</a>
<a id="six" class="links" onClick="goToPage(this.innerHTML)">6</a>
<a id="seven" class="links" onClick="goToPage(this.innerHTML)">7</a>
<a id="eight" class="links" onClick="goToPage(this.innerHTML)">8</a>
<a id="nine" class="links" onClick="goToPage(this.innerHTML)">9</a>
<a id="ten" class="links" onClick="goToPage(this.innerHTML)">10</a> 

</div>    
<div class="links"><a id="next" class="links" onClick="next()">>></a></div>

<br><br><br>


${backlink}
<br><br>
</body>
</html>