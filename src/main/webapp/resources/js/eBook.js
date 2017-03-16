/* 添加电子书 */ 
$(function(){
	$("#addEBook").click(function(){
		alert(getRootPath());
		$.ajax({
			type : "POST",
			url : getRootPath()+"/eBook/addEBook",
			data : {
				"id" : $("#bookNum").val(),
				"bookName":$("#bookName").val(),
				"type":$("#selectType").val(),
				"author":$("#author").val(),
				"price":$("#price").val(),
				"publishDate":$("#publishDate").val(),
				"describes":$("#describes").val()
			},
			success : function(data){
				if(data == 1){
					alert("添加成功");
				}else{
					alert("添加失败");
				}
			},
			error:function(errorData){
				alert("添加失败");
			}
		});
	});
	
	// 清空
	$("#reset").on('click',function(){
		history.go(0);
		$("input[type='text']").val("");
		$("#describes").val("");
	});
	
 
	
});

