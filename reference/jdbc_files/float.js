var kkn_img_url = "http://kkn.lovekkn.cn";
var qm_img_url = "http://code.i-qianming.cn";
var zd_img_url = "http://www.feichang71.com";
var mms_img_url = "http://www.woairing.com";
var cts_img_url = "http://code.feichang71.net";
var lm_img_url = "http://code.aizhuanlove.cn";
var xz_img_url = "http://code.youdayxingzuo.com.cn";
var yk_img_url = "http://code.uokor.com/";
var ys_img_url = "http://code1.lovekkn.cn/";
var dq_img_url = "http://code.2010qianming.com/";
var na_img_url = "http://code.woai3g.net/"
var ivr_img_url = "http://code.woaitaojin.com/"
var ms_img_url = "http://code.tjlove8.com/"
var yp_img_url = "http://code.zhangbilin.cn/"
var yq_img_url = "http://code.zhangbilin.com/"

var kkn_url = "http://www.iqmofa.cn";
var qm_url = "http://c.yppdiy.com/click.jsp?type=2";
var zd_url = "http://www.feichang71.com/";
var mms_url = "http://www.woairing.com";
var cts_url = "http://c.yppdiy.com/click.jsp?type=2";
var lm_url = "http://c.yppdiy.com/click.jsp?type=2";
var xz_url = "http://www.youdayxingzuo.com.cn/";
var yk_url = "http://www.u-ker.cn/";
var ys_url = "http://c.yppdiy.com/click.jsp?type=2";
var dq_url = "http://c.yppdiy.com/click.jsp?type=2";
var na_url = "http://c.yppdiy.com/click.jsp?type=2";
var ivr_url = "http://c.yppdiy.com/click.jsp?type=2";
var ms_url = "http://www.miaoshass.com/";
var yp_url = "http://c.yppdiy.com/click.jsp?type=2";
var yq_url = "http://c.yppdiy.com/click.jsp?type=2";
var eqf_url = "http://c.yppdiy.com/click.jsp?type=1&flag=1";


if (typeof webownerId == "undefined") {webownerId=10001;}
if (typeof childid == "undefined") { childid=10000; }
if (typeof productid == "undefined") { productid=""; }
if (typeof youdayflag == "undefined") { youdayflag=0; }
if (typeof code_width == "undefined") {code_width=200;}
if (typeof code_height == "undefined") {code_height=130;}
if (typeof code_float == "undefined") {code_float = 1;}
if (typeof code_close == "undefined") {code_close = false;}
if (typeof code_autoPlay == "undefined") {code_autoPlay = 0;}

if (typeof code_id == "undefined") {code_id= "";}
if (typeof code_gourl == "undefined") {code_gourl = [];}
if (typeof code_resource == "undefined") {code_resource = [];}
if (typeof code_gopage == "undefined") {code_gopage = [];}
if (typeof fromurl == "undefined") {fromurl = "";}

var id=code_id;
var resource="";
var gourl="";
var gopage="";
var img_base_url="";
if (typeof siteurl == "undefined") {siteurl = GetSiteurl();}

function GetSiteurl(){
	var url = YoudayQueryString("siteurl");
	if(url == "") {
	    if(document.referrer){ 
	         url = document.referrer; 
	    } else if(window.opener && window.opener.location){ 
	         try{ 
	              url = window.opener.location.href 
	         }catch(e){ 
	              url = ""; 
	         } 
	    } 
	    if (self == top){
	    	url = location.href;
	    }
	    if(url=="") 
	         url = "http://"+location.host+location.pathname; 
	    try{ 
	        var re = /http[^\?]+/i; url = url.match(re) 
	    }catch(e){ 
	    } 
	}
    return url; 
} 

var display_element_id = 'youday_'+code_float+'_'+id;
var cookieName = display_element_id+"_code_index";
var code_index=0;
if(code_resource.length > 1) {
	code_index = getCookie(cookieName);
	if(code_index == null) 
		code_index = -1;
	if(code_index < 0 || code_index >= code_resource.length-1)
		code_index = -1;
	code_index++;
	setCookie(cookieName, code_index);
}

resource=code_resource[code_index];
gopage=code_gopage[code_index];
	
gourl = getBaseUrl(code_gourl[code_index]);
img_base_url = getBaseImgUrl(code_gourl[0]);
	
var paras = ['webownerId='+webownerId,'serviceId='+code_gourl[code_index], 'childid='+childid, 'gopage='+gopage, 'id='+id ,'productid='+productid,'flag='+youdayflag, 'siteurl='+siteurl, 'gourl='+fromurl];
var args = paras.join('&');
if(gourl.indexOf("?") == -1)
	gourl += "?";
else
	gourl += "&";
gourl += args;

document.writeln("<div id='"+display_element_id+"' style='width: "+code_width+"px; height: "+code_height+"px; z-index:1000; overflow: hidden; position:absolute; display:none;'>");
document.writeln("<div style='position: absolute; z-index: 1; left: 0px;'>");
if(code_close) {
	var m_x1=code_width-35;
	var m_y1=1;
	var m_x2 = code_width-5;
	var m_y2 = 18;
	document.writeln("<map name=\""+display_element_id+"_Map\" id=\"Map\"><area shape='rect' coords='"+m_x1+",1,"+m_x2+","+m_y2+"' href='javascript:void(0);' onclick=\"closeDiv('"+display_element_id+"');\" /><area id='"+display_element_id+"_url' shape='polygon' coords='0, 0, "+m_x1+", 0, "+m_x1+", "+m_y2+", "+code_width+","+m_y2+","+code_width+","+code_height+", 0, "+code_height+"' href='"+gourl+"' target='_blank'/></map>");
	document.writeln("<img id='"+display_element_id+"_img' src='"+img_base_url+resource+"' border='0' usemap='#"+display_element_id+"_Map'/>");
} else 
	document.writeln("<a id='"+display_element_id+"_url' href='"+gourl+"' target='_blank'><img id='"+display_element_id+"_img' src='"+img_base_url+resource+"' border='0' /></a>");
document.writeln("</div>");
document.writeln("</div>");

function closeDiv(display_element_id){
	var st = document.getElementById(display_element_id).style;
	st.visibility='hidden';
	//window.open(gourl);
}

function setCookie(name,value) {
    var exp  = new Date();
    exp.setTime(exp.getTime() + 5*60*1000);
    document.cookie = name + "="+ escape (value) + ";path=/;expires=" + exp.toGMTString();
}

function getCookie(name) {
    var arr = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));
    if(arr != null)
    	return unescape(arr[2]); 
    return null;
}

function getBaseUrl(serviceid) {
	if(serviceid==100008) {
		return kkn_url;
	}
	if(serviceid==100005) {
		return qm_url;
	}
	if(serviceid==100010) {
		return zd_url;
	}
	if(serviceid==100011) {
		return ivr_url;
	}	
	if(serviceid==100001) {
		return mms_url;
	}
	if(serviceid==100006) {
		return cts_url;
	}
	if(serviceid==100013) {
		return lm_url;
	}
	if(serviceid==100015) {
		return xz_url;
	}
	if(serviceid==100016) {
		return yk_url;
	}
	if(serviceid==100018) {
		return ys_url;
	}
	if(serviceid==100019) {
		return dq_url;
	}
	if(serviceid==100021) {
		return na_url;
	}
	if(serviceid==100024) {
		return ms_url;
	}	
	if(serviceid==100027) {
		return yp_url;
	}
	if(serviceid==100028 || serviceid==100029 || serviceid==100030) {
		return yq_url;
	}
	if(serviceid==100017 || serviceid==100031) {
		return eqf_url;
	}	
}

function getBaseImgUrl(serviceid) {
	if(serviceid==100008) {
		return kkn_img_url;
	}
	if(serviceid==100005) {
		return qm_img_url;
	}
	if(serviceid==100010) {
		return zd_img_url;
	}
	if(serviceid==100011) {
		return ivr_img_url;
	}	
	if(serviceid==100001) {
		return mms_img_url;
	}
	if(serviceid==100006) {
		return cts_img_url;
	}
	if(serviceid==100013) {
		return lm_img_url;
	}
	if(serviceid==100015) {
		return xz_img_url;
	}
	if(serviceid==100016) {
		return yk_img_url;
	}
	if(serviceid==100018) {
		return ys_img_url;
	}
	if(serviceid==100019) {
		return dq_img_url;
	}
	if(serviceid==100021) {
		return na_img_url;
	}
	if(serviceid==100024) {
		return ms_img_url;
	}
	if(serviceid==100027) {
		return yp_img_url;
	}
	if(serviceid==100028 || serviceid==100029 || serviceid==100030) {
		return yq_img_url;
	}	
	if(serviceid==100017 || serviceid==100031) {
		return qm_img_url;
	}	
}

function moveR(id, code_width, code_height) {
	var floagfrm = ( document.compatMode.toLowerCase()=="css1compat" ) ? document.documentElement : document.body;
	var st = document.getElementById(id).style;
	st.top = ( floagfrm.scrollTop + floagfrm.clientHeight - code_height) + "px";
	st.left = ( floagfrm.scrollLeft + floagfrm.clientWidth - code_width) + "px";
}

function moveL(id, code_width, code_height) {
	var floagfrm = ( document.compatMode.toLowerCase()=="css1compat" ) ? document.documentElement : document.body;
	var st = document.getElementById(id).style;
	st.top = ( floagfrm.scrollTop + floagfrm.clientHeight - code_height) + "px";
	st.left = "0px";
}

function start(type, id, code_width, code_height) {
	if(type == 1) {
		moveR(id, code_width, code_height);
		setInterval('moveR(\''+id+'\', '+code_width+', '+code_height+')', 80);
	}
	if(type == 2) {
		moveL(id, code_width, code_height);
		setInterval('moveL(\''+id+'\', '+code_width+', '+code_height+')', 80);
	}
	document.getElementById(id).style.display="";
}

start(code_float, display_element_id, code_width, code_height);

function showNextCode(display_element_id) {
	code_index = getCookie(cookieName);
	if(code_index == null) 
		code_index = -1;
	if(code_index < 0 || code_index >= code_resource.length-1)
		code_index = -1;
	code_index++;
	setCookie(cookieName, code_index);
	
	resource=code_resource[code_index];
	gopage=code_gopage[code_index];
	
	gourl = getBaseUrl(code_gourl[code_index]);
	img_base_url = getBaseImgUrl(code_gourl[0]);
	
	
	var paras = ['webownerId='+webownerId,'serviceId='+code_gourl[code_index], 'childid='+childid, 'gopage='+gopage, 'id='+id, 'productid='+productid,'flag='+youdayflag, 'siteurl='+siteurl, 'gourl='+fromurl];
	var args = paras.join('&');
	if(gourl.indexOf("?") == -1)
		gourl += "?";
	else
		gourl += "&";
	gourl += args;
	
	var codeimgurl = document.getElementById(display_element_id+"_url");
	codeimgurl.href=gourl;
	var codeimg = document.getElementById(display_element_id+"_img");
	codeimg.src=img_base_url+resource;
}

function YoudayQueryString(qs){ 
    var s = location.href; 
    s = s.replace("?","?&").split("&"); 
    var re = ""; 
    for(i=1;i<s.length;i++) 
       if(s[i].indexOf(qs+"=")==0) 
           re = s[i].replace(qs+"=",""); 
    return re; 
}

if(code_autoPlay > 0)
	setInterval('showNextCode(\''+display_element_id+'\');', code_autoPlay*1000);