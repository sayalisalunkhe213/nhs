<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Finance Page</title>
    </head>

    <body>
        <form:form
                action="/${pageContext.request.contextPath}/user"
                modelAttribute="regularAmount">
            <label for="amount">Amount: </label>
            <form:input path="amount" id="amount"/>
            <form:errors path="amount" cssClass="error"/>

            <label for="frequency">Frequency: </label>
            <form:input path="frequency" id="frequency"/>
            <form:errors path="frequency" cssClass="error"/>

            <input type="submit" value="Submit"/>
        </form:form>

    </body>
</html>