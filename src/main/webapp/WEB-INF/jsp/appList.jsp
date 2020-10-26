<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">

</head>
<body>
  app列表页面
  
  <table id="test2" lay-filter="test2"></table>
  
  <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
  <script>
    layui.use('table', function(){
	   var table = layui.table;
	   
	   table.render({
		    elem: '#test2'
		    ,url: 'getAppTableData'
		  
		    /*
		    ,page: { 
		      curr: 5
		      ,groups: 1
		      ,first: false
		      ,last: false
		      ,layout: ['limit', 'prev', 'page', 'next', 'count'] //自定义分页布局
		    }
	       */
	        ,page: true
            ,limit:5
		    //,height: 300
		    ,cellMinWidth: 80
		    //,skin: 'line'
		    ,toolbar: true
		    ,cols: [[
		      {field: 'id', hide: true}
		      ,{field: 'userName', title: '用户名'}
		      ,{field: 'userpassword', title: '密码'}
		      ,{field: 'email', title: '邮箱'}
		      ,{title:'操作', align:'center', toolbar: '#barDemo'}
		    ]]
		  });
 
    })
  </script>
</body>
</html>