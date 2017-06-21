<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 引入struts -->
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品档案</title>
<sx:head extraLocales="en-us" />
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript">
var textAmount;
//初始化
function init(){
	textAmount = document.getElementById("amount");
}
function out_amount(){
	var chk = false;
	if(!isNaN(textAmount.value) && textAmount.value>0 && textAmount.value<999){
		show_message("msg_amount","1","输入正确！");
		chk = true;
	}else{
		show_message("msg_amount","0","价格输入为0～999之间！");
	}
	return chk;
}
function formSubmit(){
	var chk = false;
	var chkRetName = out_chkMaxLength('name','msg_name','名称小于10位且不能为空!',10);
	var chkRetAmount = out_amount();
	if(chkRetName && chkRetAmount){
		chk = true;
	}
	return chk;
}
window.onload = init;
</script>
</head>
<body>
<p></p>
<p><font style="font-size: 10pt;">档案管理->商品档案->修改</font></p>
<s:form action="merchandiseAction" method="post" theme="simple"
	onsubmit="return formSubmit();">
	<s:hidden name="merchandise.id" />
	<p></p>
	<table border="0" cellpadding="1" cellspacing="1" width="95%">
		<tr>
			<td align="right" width="10%">商品编号</td>
			<td width="20%"><s:textfield name="merchandise.code"
				disabled="true" /></td>
			<td align="right" width="10%">商品名称</td>
			<td width="20%"><s:textfield name="merchandise.name" id="name"
				onfocus="show_message('msg_name','2','请输入名称！');"
				onblur="out_chkMaxLength('name','msg_name','名称小于10位且不能为空!',10)" />
			</td>
			<td align="right" width="14%">商品价格(元)</td>
			<td width="20%"><s:textfield name="merchandise.price" id="amount"
				onfocus="show_message('msg_amount','2','请输入商品价格！');"
				onblur="out_amount()" />
			</td>
			<td width="6%">&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>
			<div style="display: show; color: red;" id="msg_code"
				class="box_div_right">&nbsp;</div>
			</td>
			<td>&nbsp;</td>
			<td>
			<div style="display: show; color: red;" id="msg_name"
				class="box_div_right">&nbsp;</div>
			</td>
			<td>&nbsp;</td>
			<td>
			<div style="display: show; color: red;" id="msg_amount"
				class="box_div_right">&nbsp;</div>
			</td>
			<td>&nbsp;</td>
		</tr>
	</table>
	<p></p>
	<div style="margin-left: 30px; margin-right: 0px;">
	<table border="0" cellpadding="0" cellspacing="0" width="95%">
		<tr>
			<td width="10%"><s:submit value="保存" method="updateMerchandise" /></td>
			<td width="10%"><input type="button" value="返回"
				onclick="history.go(-1);" /></td>
			<td width="80%">&nbsp;</td>
		</tr>
	</table>
	</div>
</s:form>
</body>
</html>