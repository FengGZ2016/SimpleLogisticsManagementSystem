<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加客户</title>
<sx:head extraLocales="en-us" />
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="dwr/util.js"></script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="dwr/interface/clientAction.js"></script>
<script type="text/javascript">
var textCode;//编号
var codeChk = false;
//初始化
function init(){
	textCode = document.getElementById("code");
	textCode.focus();
}
function out_code(){
	codeChk = false;
	if(trimString(textCode.value).length>0 && trimString(textCode.value).length<4){
		clientAction.findClientByCode(textCode.value,callback);
	}else{
		show_message("msg_code","0","编号不能为空且不能超过3位长度！");
		codeChk = false;
	}
}
function callback(ret){
	if(ret > 0){
		show_message("msg_code","0","输入的编号["+textCode.value+"]重复请重新输入！");
		codeChk = false;
	}else{
		show_message("msg_code","1","输入正确!");
		codeChk = true;
	}
}
function formSubmit(){
	var chk = false;
	var chkRetName = out_chkMaxLength('name','msg_name','名称小于10位且不能为空!',10);
	var chkRetAddress = out_chkMaxLength('address','msg_address','地址小于50位且不能为空!',50);
	var chkRetPhone = out_chkPhone('phone','msg_phone','电话只能输入11位或12位数字!');
	var chkRetEmail = out_chkEmail('email','msg_email','Email小于30位且不能为空!',30);
	if(codeChk && chkRetName && chkRetAddress && chkRetPhone && chkRetEmail){
		chk = true;
	}
	return chk;
}
window.onload = init;
</script>
</head>
<body>

</body>
</html>