Mydialog.prototype = {
	constructor: Mydialog,
	close: function(){ //关闭弹窗
		$(".my-msg").remove();
		$(".my-dialog").remove();
	},
	hide: function(){ //隐藏弹窗
		$(".my-msg").hide();
		$(".my-dialog").hide();
	},
	show: function(){ //显示弹窗
		$(".my-msg").show();
		$(".my-dialog").show();
	},
	autoClose: function(){ //自动关闭
		var time = this.settings.autoCloseTime,
			that = this;
			setTimetext = function(){
				if(time > 1){
					time -= 1;
					$("span.time").html(Math.ceil(time));
				}else{
				    that.close();
				    clearInterval(timer);
					that.settings.redirectTo && (window.location.href = that.settings.redirectTo);
				}
			};
			
		$("span.time").html(time);
		timer = setInterval(setTimetext, 1000);
	},
	bind: function(){ //绑定事件
		var that = this;
		
		//点击关闭
		$(".my-msg").delegate(".close", "click", function(){
			that.close();
		});
	},
	defaultSettings:{	//默认设置
		closeButton: true,
		autoCloseTime: false,
		redirectTo: false,
		background: "#000"
	},
	defaultCSS:{	//默认设置
		
	},
	init: function(settings, css){ //初始化
		this.settings = $.extend(this.defaultSettings, settings);
		this.css = $.extend(this.defaultCSS, css);
	},
	create: function(msg, settings, css, callback){
		var msgWidth,
			msgHeight,
			closeHTML;
			
		this.init(settings, css);
		
		//关闭按钮
		closeHTML = this.settings.closeButton ? '<div class="close">×</div>' : '';
		$("body").prepend('<div class="my-msg">'+msg+closeHTML+'</div>');
		//设定弹窗样式
		$(".my-msg").css(this.css);
		//自适应居中
		msgWidth = $(".my-msg").outerWidth();
		msgHeight = $(".my-msg").outerHeight();
		$(".my-msg").css({"margin-left": -msgWidth/2 + "px", "margin-top": -msgHeight/2 + "px"});
		$("body").prepend('<div class="my-dialog"></div>');
		
		$(".my-dialog").css({height:$(document).height()});		
		//var top = $(window).scrollTop() + $(window).height()/2;
		//$(".my-msg").css({"top":top+"px"});
		this.bind();
		this.settings.autoCloseTime && this.autoClose();
		
		$(".my-msg").show();
		$(".my-dialog").show();
		
		//IE6 PNG
		if($.browser.msie && $.browser.version === "6.0"){
			// DD_belatedPNG.fix('.my-dialog');	
		}
		
		if(typeof callback == "function"){
			callback();
		}
	}
}

function Mydialog(settings, css){
	var settings, css;
	this.init(settings, css);
}