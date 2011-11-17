/**
 * 
 */

function loginsubmit()
{
  if(document.form.username.value==""){
	  	  alert("用户名不能为空!");
	  	document.form.username.value.focus();
	  }
}