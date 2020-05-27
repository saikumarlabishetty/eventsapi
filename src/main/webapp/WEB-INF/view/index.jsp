<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Github Events App</title>
<body>
	<form name="events" action="/events" method="get">
		<input name="owner" type="text" placeholder="Enter Owner Name" required/> 
		<input name="repo" type="text" placeholder="Enter Repo Name" required/> 
		<input type="submit" value="Get Events"/>
	 <form>
	 <br><br>
	 <table>
	 <tr><th>Id</th><th>Type</th><th>Created at</th></tr>
	 ${data}
	 </table>
	 
</body>
</html>