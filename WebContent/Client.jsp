<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
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
<title>客户档案</title>
<!-- 引入js -->
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
<p></p>
<p><font style="font-size: 10pt;">档案管理->客户档案</font></p>
<s:form action="clientAction" method="post" theme="simple">
	<p></p>
	<table border="0" cellpadding="1" cellspacing="1" width="95%">
		<tr>
			<td align="right" width="10%">客户编号</td>
			<td width="20%"><s:textfield name="client.code" /></td>
			<td align="right" width="10%">客户名称</td>
			<td width="20%"><s:textfield name="client.name" /></td>
			<td width="40%">&nbsp;</td>
		</tr>
	</table>
	<p></p>
	<div style="margin-left: 30px; margin-right: 0px">
	<table border="0" cellpadding="0" cellspacing="0" width="95%">
		<tr>
			<td width="10%"><s:submit value="查找" method="findClient" /></td>
			<td width="10%"><input type="button" value="新增"
				onclick="replaceModulUrl('<%=basePath %>addClient.jsp');" /></td>
			<td width="10%"><input type="button" value="删除"
				onclick="deleteRecords('clientAction!deleteClient.action')" /></td>
			<td width="10%"><input type="reset" value="重置" /></td>
			<td width="60%">&nbsp;</td>
		</tr>
	</table>
	</div>
	<p></p>
	<div style="margin-left: 30px; margin-right: 0px">
	<table border="1" cellpadding="0" cellspacing="0" width="90%"
		style="text-align: center;">
		<tr>
			<td width="6%">选择</td>
			<td width="8%">修改</td>
			<td width="10%">客户编号</td>
			<td width="18%">客户名称</td>
			<td width="24%">客户地址</td>
			<td width="16%">客户电话</td>
			<td width="18%">客户Email</td>
		</tr>
		<s:iterator var="client" value="clients">
			<tr>
				<td><input name="clientId" type="checkbox" title="选中后可进行删除操作"
					value="<s:property value='#client.id' />" /></td>
				<td><a
					href="clientAction!preUpdateClient.action?client.id=<s:property value='#client.id'/>">
				修改</a></td>
				<td><s:property value="#client.code" /></td>
				<td><s:property value="#client.name" /></td>
				<td><s:property value="#client.address" /></td>
				<td><s:property value="#client.telephone" /></td>
				<td><s:property value="#client.email" /></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:form>
</body>
</html>