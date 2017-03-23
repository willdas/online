/* 加密后的 发布时使用
 * eval(function(p,a,c,k,e,r){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)r[e(c)]=k[c]||e(c);k=[function(e){return r[e]}];e=function(){return'\\w+'};c=1};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p}('F(x(p,a,c,k,e,r){e=x(c){y c.G(a)};z(!\'\'.A(/^/,H)){B(c--)r[e(c)]=k[c]||e(c);k=[x(e){y r[e]}];e=x(){y\'\\\\w+\'};c=1};B(c--)z(k[c])p=p.A(D E(\'\\\\b\'+e(c)+\'\\\\b\',\'g\'),k[c]);y p}(\'4 m(){3 a=5.7.9.n;3 b=5.7.9.l;3 c=a.6(b);3 d=a.8(0,c);3 e=b.8(0,b.w(1).6(\\\'/\\\')+1);t(d+e)}3 g=0;4 h(a,b,c){$("#"+a+"i").j("");o($("#"+a).p()==c){$("#"+a+"i").j(b+"不能为空");g++}}4 q(c){$.r(c,4(a,b){h(b[0],b[1],b[2])})}4 s(a){$("#f").u("v",a);$("#f").k()}\',C,C,\'|||I|x|J|K|L|M|N||||||O|P|Q|R|S|T|U|V|W|z|X|Y|Z|10|y|11|12|13\'.14(\'|\'),0,{}))',62,67,'|||||||||||||||||||||||||||||||||function|return|if|replace|while|33|new|RegExp|eval|toString|String|var|window|indexOf|document|substring|location|from|count|noBlank|_error|text|submit|pathname|getRootPath|href|val|checkBlank|each|toAction|attr|action|substr|split'.split('|'),0,{}))
 */
function getRootPath(){  
    var curWwwPath=window.document.location.href;  
    var pathName=window.document.location.pathname;  
    var pos=curWwwPath.indexOf(pathName);  
    var localhostPaht=curWwwPath.substring(0,pos);  
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);  
    return (localhostPaht+projectName);  
}
var count=0;
function noBlank(id,name,value){
	$("#"+id+"_error").text("");
	if($("#"+id).val() == value){
		$("#"+id+"_error").text(name+"不能为空");
		count++;
	}
}
function checkBlank(arr){
	$.each(arr,function(key,val){
		noBlank(val[0],val[1],val[2]);
	});
}
function toAction(url){
	$("#from").attr("action",url);
	$("#from").submit();
}


