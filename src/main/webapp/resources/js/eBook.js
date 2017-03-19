/* 操作电子书js */ 
$(function(){
	// 清空
	$("#reset").on('click',function(){
		$("input[type='text']").val("");
		$("#describes").val("");
		window.location.reload();
	});
	// 修改电子书
	$("#updateEBook").click(function(){
		$.ajax({
			type : "POST",
			url : getRootPath()+"/eBook/updateEBook",
			data : {
				"id" : $("#bookNum").val(),
				"bookName":$("#bookName").val(),
				"type":$("#selectType").val(),
				"author":$("#author").val(),
				"price":$("#price").val(),
				"buyLink":$("#buyLink").val(),
				"fileUrl":$("#fileUrl").val(),
				"publishDate":$("#publishDate").val(),
				"describes":$("#describes").val()
			},
			success : function(data){
				if(data == 1){
					$("#message").html("修改成功!");
				}else{
					$("#message").html("修改失败!");
				}
			},
			error:function(errorData){
				console.log("状态码=="+errorData);
				alert("网络连接失败");
			}
		});
	});
});

