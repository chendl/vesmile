$(document).ready(function() {
	
//����ѡ���
	$(".item-drop-list").hide();
	$(".item-drop").click(
		function(){		 
			if(!$(this).children(".item-drop-list").is(":animated")){//�ж��Ƿ��ڶ���
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
	
	//�ı������ֱ�ɫ
 $('.textAreaBox textarea').focus(
 	function(){
	    $(this).addClass('btn-hover');
	 });
 $('.textAreaBox textarea').mouseover(
 	function(){
	    $(this).removeClass('btn-hover');
	 });
	 
	 
//����������ർ������
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