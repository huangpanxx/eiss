var code_width = 256;
var code_height = 152;
var code_float = 1;
var fromurl =location.href;
if (document.referrer){
	fromurl = document.referrer;
}else{
	try {
  		if (window.opener && window.opener.location) {
			fromurl = window.opener.location.href;
		}
  	}
	catch (e) {
	}
}
fromurl = typeof encodeParamodeURIComponent == "function" ? encodeParamodeURIComponent(fromurl) : escape(fromurl);
var code_gourl = [100024];
var code_resource = ['/msimages/201012141759673.gif'];
var code_gopage = [0];

document.write("<script type=\"text/javascript\" src=\"http://img.woairing.cn/js/float.js\"><"+"/script>");
