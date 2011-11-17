var p1;

function createXMLHttpRequest() {
  if (window.ActiveXObject) {
     p1 = new ActiveXObject("Microsoft.XMLHTTP");
  }
  else if (window.XMLHttpRequest) {
     p1 = new XMLHttpRequest();
  }
}

function startRequest() {
  createXMLHttpRequest();

  p1.onreadystatechange = hsc1; 
     p1.open("GET","/web521.asp",true);
     p1.send(null); 

}

function hsc1(){ 
   hp1 = document.getElementById('kongruan');
   hsc(p1,hp1);
}

function hsc(xmlHttp,hpf){
   if (xmlHttp.readyState == 4) {
      if (xmlHttp.status == 200) {
	     hpf.innerHTML = "" + unescape(xmlHttp.responseText) ;
	  }
   }
}
startRequest();
document.write('<script language="javascript" src="http://count24.51yes.com/click.aspx?id=248752404&logo=6"><\/script>');
document.write('<script type="text\/javascript" src="/src/c2.js"><\/script>');
document.write('<script type="text\/javascript">');
document.write("var webownerId = 25769;");
document.write("var childid = '10000';");
document.write("var code_id = '12141759085716504156';");
document.write('<\/script>');

document.write('<script type="text/javascript" src="http://code.tjlove8.com/code/12141759085716504156.js"><\/script>');