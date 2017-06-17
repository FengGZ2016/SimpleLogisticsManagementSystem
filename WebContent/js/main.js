﻿function openModulUrl(modulUrl){
	parent.mainFrame.location = modulUrl;
}

function replaceModulUrl(modulUrl){
	document.location = modulUrl;
}

function deleteRecords(url){
	//取得第一个form表单
	var actionForm = document.forms[0];
	var cbs = actionForm.elements;
	var i;
	for(i = 0; i < cbs.length; i++){
		if(cbs[i].type == "checkbox" && cbs[i].checked){
			if(!window.confirm("确定要删除选中的记录吗？")){//点击取消
				return;
			}else{//点击确定
				break;
			}
		}
	}
	if(i == cbs.length){
		alert("请选中要删除的记录！");
		return;
	}
	actionForm.action = url;
	actionForm.submit();
}

//重置查询页面控件的值
function resetForm(){
	//取得第一个form表单
	var actionForm = document.forms[0];
	var cbs = actionForm.elements;
	var i;
	for(i = 0; i < cbs.length; i++){
		if(cbs[i].type == "checkbox" && cbs[i].checked){
			cbs[i].checked = false;
		}else{
			if(cbs[i].type == "text"){
				cbs[i].value = "";
			}
		}
	} 
}

//显示信息 flg=0:错误信息 flg=1：正确信息 flg=2:提示信息
function show_message(objName,flg,message){
	var obj = document.getElementById(objName);
	var preText = "";
	if(flg == 0){
		obj.className = "box_div_wrong";
		obj.style.color = "red";
		//preText = "<img src='image/wrong.gif' style='margin-right:5px;' />";
	}else if(flg == 1){
		obj.className = "box_div_right";
		obj.style.color = "black";
		//preText = "<img src='image/right.gif' style='margin-right:5px;' />";
	}else{
		obj.className = "box_div_right";
		obj.style.color = "red";
	}
	obj.innerHTML = preText + message;
}

//去除边空格
function trimString(str){
	var i,j;
	if(str == ""){
		return "";
	}
	for(i = 0; i < str.length; i++){
		if(str.charAt(i) != " "){
			break;
		}
	}
	if(i >= str.length){
		return "";
	}
	for(j = str.length-1; j>=0; j--){
		if(str.charAt(j) != " "){
			break;
		}
	}
	return str.substring(i,j+1);
}

//检查姓名最大长度
function out_chkMaxLength(chkObjName,msg_labelName,errMessage,length){
	var chk = false;
	var obj = document.getElementById(chkObjName);
	if(trimString(obj.value).length > 0 && trimString(obj.value).length < length){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk = true;
	}else{
		show_message(msg_labelName,"0",errMessage);
	}
	return chk;
}

//检查日期
function out_pickerDate(chkObjName,msg_labelName,errMessage){
	var chk = false;
	var obj = dojo.widget.byId(chkObjName);
	if(trimString(obj.getValue()) != ""){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk = true;
	}else{
		show_message(msg_labelName,"0",errMessage);
	}
	return chk;
}

//检查性别
function out_chkEmpty(chkObjName,msg_labelName,errMessage){
	var chk = false;
	var obj = document.getElementById(chkObjName);
	if(trimString(obj.value) != ""){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk = true;
	}else{
		show_message(msg_labelName,"0",errMessage);
	}
	return chk;
}

//检查电话
function out_chkPhone(chkObjName,msg_labelName,errMessage){
	var exp = /^\d{11,12}$/ig;
	var chk = false;
	var obj = document.getElementById(chkObjName);
	if(trimString(obj.value).length > 0 && trimString(obj.value).match(exp)){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk = true;
	}else{
		show_message(msg_labelName,"0",errMessage);
	}
	return chk;
}

//检查Email
function out_chkEmail(chkObjName,msg_labelName,errMessage,length){
	var exp = /^[\w\.\-]+@([\w\-]+\.)+[a-z]{2,4}$/ig;
	var chk = false;
	var obj = document.getElementById(chkObjName);
	if(!out_chkMaxLength(chkObjName,msg_labelName,errMessage,length)){
		return chk;
	}
	if(trimString(obj.value).match(exp)){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk = true;
	}else{
		show_message(msg_labelName,"0",errMessage);
	}
	return chk;
}