<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Struts的标签库 -->
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <!-- request.getContextPath()获取项目名 -->
    <!-- request.getScheme()获取协议名 -->
    <!-- request.getServerName()获取主机名 -->
    <!-- request.getServerPort()获取端口号 -->
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工档案</title>
<!-- 引入javascript文件 -->
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
<p></p>
<p><font style="font-size: 10pt;">档案管理->员工档案</font></p>

<!-- 表单 --><!-- 提交到employeeAction -->
<s:form action="employeeAction" method="post" theme="simple">
<p></p>


<!-- 表格 -->
<table border="0" cellpadding="1" cellspacing="1" width="95%">
<tr>
<td align="right" width="10%">员工编号</td>
<td width="20%"><s:textfield name="employee.code"></s:textfield></td>
<td width="10%" align="right">员工名称</td>
<td width="20%"><s:textfield name="employee.name"></s:textfield></td>
<td width="40%">&nbsp;</td>
</tr>
</table>
<p></p>


<!-- 盒子 -->
<div  style="margin-left: 30px; margin-right: 0px">
<!-- 表格 -->
<table border="0" cellpadding="0" cellspacing="0" width="95%">
		<tr>
			<td width="10%"><s:submit value="查找" method="findEmployee" /></td>
			<td width="10%"><input type="button" value="新增"
				onclick="replaceModulUrl('<%=basePath %>addEmployee.jsp');" /></td>
			<td width="10%"><input type="button" value="删除"
				onclick="deleteRecords('employeeAction!deleteEmployee.action')" /></td>
			<td width="10%"><input type="reset" value="重置" /></td>
			<td width="60%">&nbsp;</td>
		</tr>
	</table>
</div>
<p></p>


<!-- 盒子 -->
	<div style="margin-left: 30px; margin-right: 0px">
	<!-- 表格 -->
	<table border="1" cellpadding="0" cellspacing="0" width="90%"
		style="text-align: center;">
		<tr>
			<td width="6%">选择</td>
			<td width="8%">修改</td>
			<td width="10%">员工编号</td>
			<td width="12%">员工名称</td>
			<td width="15%">出生日期</td>
			<td width="8%">员工性别</td>
			<td width="15%">员工电话</td>
			<td width="18%">员工Email</td>
		</tr>
		<s:iterator var="employee" value="employees">
			<tr>
				<td><input name="employeeId" type="checkbox" title="选中后可进行删除操作"
					value="<s:property value='#employee.id' />" /></td>
				<td><a
					href="employeeAction!preUpdateEmployee.action?employee.id=<s:property value='#employee.id'/>">
				修改</a></td>
				<td><s:property value="#employee.code" /></td>
				<td><s:property value="#employee.name" /></td>
				<td><s:property value="#employee.birthday" /></td>
				<td><s:if test="#employee.sex==true">男</s:if> <s:if
					test="#employee.sex==false">女</s:if></td>
				<td><s:property value="#employee.telephone" /></td>
				<td><s:property value="#employee.email" /></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:form>
</body>
</html>