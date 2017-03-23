/* 加密后的发布时使用
 * eval(function(p,a,c,k,e,r){e=function(c){return c.toString(a)};if(!''.replace(/^/,String)){while(c--)r[e(c)]=k[c]||e(c);k=[function(e){return r[e]}];e=function(){return'\\w+'};c=1};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p}('$(1(){$("#2").9(1(){$("#8").5("")})});1 b(){6([["2","职位","请输入你的职位"]]);7(3>0){3=0;a 4}c(d()+"/e/f/g.h")}',18,18,'|function|occupationName|count|false|text|checkBlank|if|occupationName_error|focus|return|enter|toAction|getRootPath|book|read|EBooks|html'.split('|'),0,{}))
 */
$(function(){
	$("#occupationName").focus(function(){
		$("#occupationName_error").text("");
	});
});
function enter(){
	checkBlank([["occupationName","职位","请输入你使用的语言 例如:JAVA"]]);
	if(count > 0){
		count = 0;
		return false;
	}
	toAction(getRootPath()+"/book/read/EBooks.html");
}