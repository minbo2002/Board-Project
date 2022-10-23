<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Board</title>
</head>

<script src="/js/jQuery-2.1.4.min.js"></script>

<script>

    $(document).ready(function() {
        var formObj = $("#board");

        $("#btnRegister").on("click", function() {
            formObj.attr("action", "/board/register");
            formObj.attr("method", "post");
            formObj.submit();
        });

        $("#btnList").on("click", function() {
            self.location = "/board/list";
        });
    });

</script>

<body>
<h2>게시판 등록</h2>

<form:form modelAttribute="board" action="register">
    <table>
        <tr>
            <td>Title</td>
            <td><form:input path="title" /></td>
        </tr>
        <tr>
            <td>Writer</td>
            <td><form:input path="writer" /></td>
        </tr>
        <tr>
            <td>Content</td>
            <td><form:textarea path="content" /></td>
        </tr>
    </table>
</form:form>

<div>
    <button type="submit" id="btnRegister">등록</button>
    <button type="submit" id="btnList">목록</button>
</div>
</body>
</html>
