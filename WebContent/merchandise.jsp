<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
//协议
	String basePath = request.getScheme() + "://"
	//主机名+端口
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品档案</title>
</head>
<body>
<p></p>
<p><font style="font-size: 10pt;">档案管理->商品档案</font></p>
<s:form action="merchandiseAction" method="post" theme="simple">
	<p></p>
	<table border="0" cellpadding="1" cellspacing="1" width="95%">
		<tr>
			<td align="right" width="10%">商品编号</td>
			<td width="20%"><s:textfield name="merchandise.code" /></td>
			<td align="right" width="10%">商品名称</td>
			<td width="20%"><s:textfield name="merchandise.name" /></td>
			<td width="40%">&nbsp;</td>
		</tr>
	</table>
	<p></p>
	<div style="margin-left: 30px; margin-right: 0px">
	<table border="0" cellpadding="0" cellspacing="0" width="95%">
		<tr>
			<td width="10%"><s:submit value="查找" method="findMerchandise" /></td>
			<td width="10%"><input type="button" value="新增"
				onclick="replaceModulUrl('<%=basePath %>addMerchandise.jsp');" /></td>
			<td width="10%"><input type="button" value="删除"
				onclick="deleteRecords('merchandiseAction!deleteMerchandise.action')" /></td>
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
			<td width="9%">选择</td>
			<td width="11%">修改</td>
			<td width="17%">商品编号</td>
			<td width="40%">商品名称</td>
			<td width="23%">商品价格(元)</td>
		</tr>
		<s:iterator var="merchandise" value="merchandises">
			<tr>
				<td><input name="merchandiseId" type="checkbox" title="选中后可进行删除操作"
					value="<s:property value='#merchandise.id' />" /></td>
				<td><a
					href="merchandiseAction!preUpdateMerchandise.action?merchandise.id=<s:property value='#merchandise.id'/>">
				修改</a></td>
				<td><s:property value="#merchandise.code" /></td>
				<td><s:property value="#merchandise.name" /></td>
				<td><s:property value="#merchandise.price" /></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:form>
</body>
</html>