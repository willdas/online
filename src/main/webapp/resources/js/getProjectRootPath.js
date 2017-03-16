//js获取项目根路径，如： http://localhost:8080/XXX 
function getRootPath(){  
    //获取当前网址，如： http://localhost:8080/XXX/share/meun.jsp  
    var curWwwPath=window.document.location.href;  
    //获取主机地址之后的目录，如： XXX/share/meun.jsp  
    var pathName=window.document.location.pathname;  
    var pos=curWwwPath.indexOf(pathName);  
    //获取主机地址，如： http://localhost:8083  
    var localhostPaht=curWwwPath.substring(0,pos);  
    //获取带"/"的项目名，如：/XXX 
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);  
    return (localhostPaht+projectName);  
}
function getLocalhostPaht(){  
    //获取当前网址，如： http://localhost:8080/XXX/share/meun.jsp  
    var curWwwPath=window.document.location.href;  
    //获取主机地址之后的目录，如： XXX/share/meun.jsp  
    var pathName=window.document.location.pathname;  
    var pos=curWwwPath.indexOf(pathName);  
    //获取主机地址，如： http://localhost:8083  
    var localhostPaht=curWwwPath.substring(0,pos);  
    return localhostPaht;  
}