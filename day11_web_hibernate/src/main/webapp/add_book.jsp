<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="process_form.jsp" method="post">
		<table style="background-color: lightgrey; margin: auto">
			
			<tr>
				<td>Enter Author Email</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Enter Book Title</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>Enter Publish Date</td>
				<td><input type="date" name="pubDate" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Add New Book" /></td>
			</tr>
		</table>
	</form>
</body>
</html>