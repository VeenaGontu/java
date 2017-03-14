<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="salary"  value="${2000*2}"/>
<p>Your salary is : <c:out value="${salary}"/></p>
<c:choose>
    <c:when test="${salary <= 0}">
       Salary is very low to survive.
    </c:when>
    <c:when test="${salary > 1000}">
        Salary is very good.
    </c:when>
    <c:otherwise>
        No comment...
    </c:otherwise>
</c:choose>