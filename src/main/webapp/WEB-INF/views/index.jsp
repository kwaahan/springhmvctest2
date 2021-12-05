<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DataTables in Spring MVC Framework and Spring Data JPA</title>
<link href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" type="text/css" rel="stylesheet" />
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#employeeList').DataTable({
			pageLength : 2,
			ajax : {
				url : '${pageContext.request.contextPath}/api/emp/findAll',
				dataSrc : ''
			},
			columns : [ {
				title : 'Id',
				data : 'id'
			}, {
				title : 'Employee Name',
				data : 'employee_name'
			}, {
				title : 'Address',
				data : 'address'
			}, {
				title : 'Salary',
				data : 'emp_salary'
			}
			,
			{
				title : 'Department',
				data : 'dept_name'
			},
			{
				title : 'Department Address',
				data : 'dept_add'
			}
			
			
			 ]
		});
	});
</script>
</head>
<body>

	<table id="employeeList" class="display" style="width: 100%"></table>

</body>
</html>