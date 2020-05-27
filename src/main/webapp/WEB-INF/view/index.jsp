<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Github Events App</title>
<body>
	<form name="events" action="/github/events" method="post">
		<input name="owner" type="text" placeholder="Enter Owner Name"/> 
		<input name="repo" type="text" placeholder="Enter Repo Name"/> 
		<input type="submit" value="Get Events"/>
	 <form>
	 
	 ${id}
</body>
</html>