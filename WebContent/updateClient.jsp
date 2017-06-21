<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<sx:head extraLocales="en-us" />
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript">
function formSubmit(){
	var chk = false;
	var chkRetName = out_chkMaxLength('name','msg_name','名称小于10位且不能为空!',10);
	var chkRetAddress = out_chkMaxLength('address','msg_address','地址小于50位且不能为空!',50);
	var chkRetPhone = out_chkPhone('phone','msg_phone','电话只能输入11位或12位数字!');
	var chkRetEmail = out_chkEmail('email','msg_email','Email小于30位且不能为空!',30);
	if(chkRetName && chkRetAddress && chkRetPhone && chkRetEmail){
		chk = true;
	}
	return chk;
}
</script>
</head>
<body>
<p></p>
<p><font style="font-size: 10pt;">档案管理->客户档案->修改</font></p>
<s:form action="clientAction" method="post" theme="simple"
	onsubmit="return formSubmit();">
	<s:hidden name="client.id" />
	<p></p>
	<table border="0" cellpadding="1" cellspacing="1" width="95%">
		<tr>
			<td align="right" width="10%">客户编号</td>
			<td width="20%"><s:textfield name="client.code" disabled="true" />
			</td>
			<td align="right" width="10%">客户名称</td>
			<td width="20%"><s:textfield name="client.name" id="name"
				onfocus="show_message('msg_name','2','请输入名称！');"
				onblur="out_chkMaxLength('name','msg_name','名称小于10位且不能为空!',10)" />
			</td>
			<td align="right" width="10%">客户Email</td>
			<td width="20%"><s:textfield name="client.email" id="email"
				onfocus="show_message('msg_email','2','请输入Email！');"
				onblur="out_chkEmail('email','msg_email','Email小于30位且不能为空!',30)" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>
			<div style="display: show;" id="msg_code" class="box_div_right">&nbsp;</div>
			</td>
			<td>&nbsp;</td>
			<td>
			<div style="display: show;" id="msg_name" class="box_div_right">&nbsp;</div>
			</td>
			<td>&nbsp;</td>
			<td>
			<div style="display: show;" id="msg_email" class="box_div_right">&nbsp;</div>
			</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td align="right">客户电话</td>
			<td><s:textfield name="client.telephone" id="phone"
				onfocus="show_message('msg_phone','2','请输入电话11位或12位数字！');"
				onblur="out_chkPhone('phone','msg_phone','电话只能输入11位或12位数字!')" /></td>
			<td align="right">客户地址</td>
			<td><s:textfield name="client.address" id="address"
				onfocus="show_message('msg_address','2','请输入地址！');"
				onblur="out_chkMaxLength('address','msg_address','地址小于50位且不能为空!',50)" /></td>
			<td width="10%">&nbsp;</td>
		</tr>
		<tr>
			<td align="right">&nbsp;</td>
			<td>
			<div style="display: show;" id="msg_phone" class="box_div_right">&nbsp;</div>
			</td>
			<td align="right">&nbsp;</td>
			<td>
			<div style="display: show;" id="msg_address" class="box_div_right">&nbsp;</div>
			</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
	</table>
	<p></p>
	<div style="margin-left: 30px; margin-right: 0px;">
	<table border="0" cellpadding="0" cellspacing="0" width="95%">
		<tr>
			<td width="10%"><s:submit value="保存" method="updateClient" /></td>
			<td width="10%"><input type="button" value="返回"
				onclick="history.go(-1);" /></td>
			<td width="80%">&nbsp;</td>
		</tr>
	</table>
	</div>
</s:form>
</body>
</html>