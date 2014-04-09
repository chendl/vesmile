$(document).ready(function() {
	
//下拉选择层
	$(".item-drop-list").hide();
	$(".item-drop").click(
		function(){		 
			if(!$(this).children(".item-drop-list").is(":animated")){//判断是否处于动画
				$(this).addClass("hover");
				$(this).children(".item-drop-list").fadeIn();
				$(".item-drop-list").not($(this).children(".item-drop-list")).fadeOut(0);
				return false;
			}			 
		});
	$(".item-drop-list span a").click(function(event){
		var objThis2Parent = $(this).parent().parent();
		objThis2Parent.parent().removeClass("hover");
		var text = $(this).text()
		var svalue = $(this).attr("src");
		var objThis3Parent = objThis2Parent.parent(".item-drop");
		objThis3Parent.children("em").text(text);
		objThis3Parent.children("input[type=hidden]").val(svalue).focus().blur();
		objThis2Parent.fadeOut();
		$("#search_form").attr("action", $(this).attr("target"));
		return false;
	});
	$(document).click(function(event){
		$(".item-drop-list").fadeOut(200);
		$(".item-drop-list").parent().removeClass("hover");
	});	
	
	//文本域文字变色
 $('.textAreaBox textarea').focus(
 	function(){
	    $(this).addClass('btn-hover');
	 });
 $('.textAreaBox textarea').mouseover(
 	function(){
	    $(this).removeClass('btn-hover');
	 });
	 
	 
//个人中心左侧导航收缩
	$('#sideNav h2').toggle(function(){
		$(this).addClass("selected");
		$(this).parent().children("ul").hide();
		return false;
	},function(){
		$(this).removeClass("selected");
		$(this).parent().children("ul").show();
		return false;
		}); 	 
	 
});





	
// JavaScript Document