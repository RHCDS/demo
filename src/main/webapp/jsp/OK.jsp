    <%@ page language="java" contentType="text/html; charset=UTF-8"  
        pageEncoding="UTF-8"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>OK</title>  
    </head>  
    <body>  
    	 OK！<br>
    	 welcome: ${username}  !<br><br><br>
    	 
    	 <form action="articlepublish" method="post">
		<table>
			<tr>
				<td>Article Title: </td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>Article Content:</td>
				<td><input type="text" name="content" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Publish" /></td>
			</tr>
		</table>
	</form>
    </body>  
    </html>  