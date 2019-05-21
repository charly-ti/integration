<html>
<head>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 70%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
<body>
<h2 style="color: #2e6c80;">Hi ${headers.sureName},</h2>
<h3 style="color: #2e6c80;">As per your request,the registration details from the RESCO API is Fetched.</h3>
<h3 style="color: #2e6c80;">The Guest Registration details are as follows:</h3>
<table id="customers">
<tr>
<th>Registration Details</th>
<th>Value</th>
</tr>
<tbody>
<tr>
<td>Folio ID</td>
<td><#if (headers.folioId)??>${headers.folioId}<#else> NA</#if></td>
</tr>
<tr>
<td>Greeting</td>
<td><#if (headers.greeting)??>${headers.greeting}<#else> NA</#if></td>
</tr>
<tr>
<td>Name</td>
<td>${headers.sureName}
 <#if (headers.middleName)??>${headers.middleName}<#else> &nbsp; </#if>
 <#if (headers.foreName)??>${headers.foreName}<#else> &nbsp; </#if> 
</td>
</tr>
<tr>
<td>Email</td>
<td><#if (headers.email)??>${headers.email}<#else> NA </#if></td>
</tr>
<tr>
<td>Gender</td>
<td><#if (headers.gender)??>${headers.gender}<#else> NA </#if></td>
</tr>
<tr>
<td>Phone No</td>
<td><#if (headers.phone)??>${headers.phone}<#else> NA </#if></td>
</tr>
<tr>
<td>Postal Code</td>
<td><#if (headers.postal)??>${headers.postal}<#else> NA </#if></td>
</tr>
<tr>
<td>Country</td>
<td><#if (headers.country)??>${headers.country}<#else> NA </#if></td>
</tr>
<tr>
<td>Currency</td>
<td><#if (headers.currency)??>${headers.currency}<#else> NA </#if></td>
</tr>
<tr>
<td>Language</td>
<td><#if (headers.lang)??>${headers.lang}<#else> NA </#if></td>
</tr>
<tr>
<td>Access Level</td>
<td><#if (headers.access)??>${headers.access}<#else> NA </#if></td>
</tr>
<tr>
<td>Type</td>
<td><#if (headers.type)??>${headers.type}<#else> NA </#if></td>
</tr>
<tr>
<td>Flag Code</td>
<td><#if (headers.flag)??>${headers.flag}<#else> NA </#if></td>
</tr>
<tr>
<td>Modified date</td>
<td><#if (headers.modified)??>${headers.modified}<#else> NA </#if></td>
</tr>
<tr>
<td>Privacy 1</td>
<td><#if (headers.privacy1)??>${headers.privacy1}<#else> NA</#if></td>
</tr>
 <tr>
<td>Privacy 2</td>
<td><#if (headers.privacy2)??>${headers.privacy2}<#else> NA</#if></td>
</tr> 
<tr>
<td>Privacy 3</td>
<td><#if (headers.privacy3)??>${headers.privacy3}<#else> NA</#if></td>
</tr> 
<tr>
<td>Privacy 4</td>
<td><#if (headers.privacy4)??>${headers.privacy4}<#else> NA</#if></td>
</tr>
 <tr>
<td>Privacy 5</td>
<td><#if (headers.privacy5)??>${headers.privacy5}<#else> NA</#if></td>
</tr> 
<tr>
<td>Privacy 6</td>
<td><#if (headers.privacy6)??>${headers.privacy6}<#else> NA</#if></td>
</tr> 
<tr>
<td>Privacy 7</td>
<td><#if (headers.privacy7)??>${headers.privacy7}<#else> NA</#if></td>
</tr>
 <tr>
<td>Privacy 8</td>
<td><#if (headers.privacy8)??>${headers.privacy8}<#else> NA</#if></td>
</tr>
</tbody>
</table>
<h3 style="color: #2e6c80;">Verify your details and ensure the safety of your data.
<br />Thank you!<br /> RCG Team</h3>
<p><strong>&nbsp;</strong></p>
</body>
</html> 