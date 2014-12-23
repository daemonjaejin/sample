<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>handlebars</title>
	<script src="/resources/script/handlebars-v2.0.0.js"></script>
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script id="entry-template" type="text/x-handlebars-template">
    <div class="entry">
        <h1>{{title}}</h1>
        <div class="body">
            {{body}}
        </div>
    </div>
	</script>
	
</head>
<body>
<h1>
	${handlebars } 
</h1>

<div id="context">

</div>

	<script type="text/javascript">
	    var source = $("#entry-template").html(); // ID 값으로 템플릿을 가져옴
	    var template = Handlebars.compile(source); // Handlebars.compile을 이용하여 컴파일
	 
	    var context = {title: "My New Post", body: "This is my first post!"}; 
	    var html = template(context); // context를 파라미터로 전달
	    console.log(html);
	    $('#context').html(html);
	</script>

</body>
</html>
