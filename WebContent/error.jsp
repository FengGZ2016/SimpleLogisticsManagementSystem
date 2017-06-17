<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统异常</title>
</head>
<body>
<div align="center"><font color="red"> 系统异常请联系管理员！ <span
	onclick="history.back();" style="cursor: hand; color: #0000a0">点击返回</span>
<s:fielderror /><s:actionerror /><s:actionmessage /> </font></div>
</body>
</html>