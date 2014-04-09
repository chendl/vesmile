function Show(id){
    document.getElementById(id).style.display= "block"; 
}

function Hidden(id){
    document.getElementById(id).style.display = "none"; 
}

function addShouCang(){
    var title=document.title;
    var url=window.location.href;
    if(document.all){
        window.external.addFavorite(url,title);
    }else if(window.sidebar){
        window.sidebar.addPanel(title,url+'?utm_source=bookmarks&utm_medium=browser&utm_term=&utm_content=&utm_campaign=bookmarks','');
    }
}

$('.nav_header > ul > li > a').removeClass('green');
var currentUrl=location.href;
if(currentUrl.indexOf("/ershoufang/")!="-1"){
    $('.nav_header > ul').find('a').eq(1).addClass('green');
}else if(currentUrl.indexOf("/zufang/")!="-1"){
    $('.nav_header > ul').find('a').eq(2).addClass('green');
}else if(currentUrl.indexOf("/xiaoqu/")!="-1"){
    $('.nav_header > ul').find('a').eq(3).addClass('green');
}else if(currentUrl.indexOf("/jingjiren/")!="-1"){
    $('.nav_header > ul').find('a').eq(4).addClass('green');
}else if(currentUrl.indexOf("/ask/")!="-1"){
    $('.nav_header > ul').find('a').eq(5).addClass('green');
}else if(currentUrl.indexOf("/pinggu/")!="-1"){
    $('.nav_header > ul').find('a').eq(6).addClass('green');
}
;(function($){$.fn.extend({autocomplete:function(urlOrData,options){var isUrl=typeof urlOrData=="string";options=$.extend({},$.Autocompleter.defaults,{url:isUrl?urlOrData:null,data:isUrl?null:urlOrData,delay:isUrl?$.Autocompleter.defaults.delay:10,max:options&&!options.scroll?10:150},options);options.highlight=options.highlight||function(value){return value;};options.formatMatch=options.formatMatch||options.formatItem;return this.each(function(){new $.Autocompleter(this,options);});},result:function(handler){return this.bind("result",handler);},search:function(handler){return this.trigger("search",[handler]);},flushCache:function(){return this.trigger("flushCache");},setOptions:function(options){return this.trigger("setOptions",[options]);},unautocomplete:function(){return this.trigger("unautocomplete");}});$.Autocompleter=function(input,options){var KEY={UP:38,DOWN:40,DEL:46,TAB:9,RETURN:13,ESC:27,COMMA:188,PAGEUP:33,PAGEDOWN:34,BACKSPACE:8};var $input=$(input).attr("autocomplete","off").addClass(options.inputClass);var timeout;var previousValue="";var cache=$.Autocompleter.Cache(options);var hasFocus=0;var lastKeyPressCode;var config={mouseDownOnSelect:false};var select=$.Autocompleter.Select(options,input,selectCurrent,config);var blockSubmit;$.browser.opera&&$(input.form).bind("submit.autocomplete",function(){if(blockSubmit){blockSubmit=false;return false;}});$input.bind(($.browser.opera?"keypress":"keydown")+".autocomplete",function(event){hasFocus=1;lastKeyPressCode=event.keyCode;switch(event.keyCode){case KEY.UP:event.preventDefault();if(select.visible()){select.prev();}else{onChange(0,true);}
break;case KEY.DOWN:event.preventDefault();if(select.visible()){select.next();}else{onChange(0,true);}
break;case KEY.PAGEUP:event.preventDefault();if(select.visible()){select.pageUp();}else{onChange(0,true);}
break;case KEY.PAGEDOWN:event.preventDefault();if(select.visible()){select.pageDown();}else{onChange(0,true);}
break;case options.multiple&&$.trim(options.multipleSeparator)==","&&KEY.COMMA:case KEY.TAB:case KEY.RETURN:if(selectCurrent()){event.preventDefault();blockSubmit=true;return false;}
break;case KEY.ESC:select.hide();break;default:clearTimeout(timeout);timeout=setTimeout(onChange,options.delay);break;}}).focus(function(){hasFocus++;}).blur(function(){hasFocus=0;if(!config.mouseDownOnSelect){hideResults();}}).click(function(){if(hasFocus++>1&&!select.visible()){onChange(0,true);}}).bind("search",function(){var fn=(arguments.length>1)?arguments[1]:null;function findValueCallback(q,data){var result;if(data&&data.length){for(var i=0;i<data.length;i++){if(data[i].result.toLowerCase()==q.toLowerCase()){result=data[i];break;}}}
if(typeof fn=="function")fn(result);else $input.trigger("result",result&&[result.data,result.value]);}
$.each(trimWords($input.val()),function(i,value){request(value,findValueCallback,findValueCallback);});}).bind("flushCache",function(){cache.flush();}).bind("setOptions",function(){$.extend(options,arguments[1]);if("data"in arguments[1])cache.populate();}).bind("unautocomplete",function(){select.unbind();$input.unbind();$(input.form).unbind(".autocomplete");}).bind("input",function(){onChange(0,true);});function selectCurrent(){var selected=select.selected();if(!selected)return false;var v=selected.result;if(v.match("<div class='sousuoa' tag='(.*?)' value='(.*?)'><span><strong>(.*?)</strong></span><span>")){var s=v.match("<div class='sousuoa' tag='(.*?)' value='(.*?)'><span><strong>(.*?)</strong></span><span>");var tag_str='<input type="hidden" id="tag" value="'+s[1]+'" />';var tag_val_str='<input type="hidden" id="tag_val" value="'+s[2]+'" />';if($('#tag_val').val()){$('#tag').val(s[1]);$('#tag_val').val(s[2]);}else{$('body').append(tag_str);$('body').append(tag_val_str);}
v=s[3];}
previousValue=v;if(options.multiple){var words=trimWords($input.val());if(words.length>1){var seperator=options.multipleSeparator.length;var cursorAt=$(input).selection().start;var wordAt,progress=0;$.each(words,function(i,word){progress+=word.length;if(cursorAt<=progress){wordAt=i;return false;}
progress+=seperator;});words[wordAt]=v;v=words.join(options.multipleSeparator);}
v+=options.multipleSeparator;}
$input.val(v);hideResultsNow();$input.trigger("result",[selected.data,selected.value]);return true;}
function onChange(crap,skipPrevCheck){if(lastKeyPressCode==KEY.DEL){select.hide();return;}
var currentValue=$input.val();if(!skipPrevCheck&&currentValue==previousValue)return;previousValue=currentValue;currentValue=lastWord(currentValue);if(currentValue.length>=options.minChars){$input.addClass(options.loadingClass);if(!options.matchCase)currentValue=currentValue.toLowerCase();request(currentValue,receiveData,hideResultsNow);}else{stopLoading();select.hide();}};function trimWords(value){if(!value)return[""];if(!options.multiple)return[$.trim(value)];return $.map(value.split(options.multipleSeparator),function(word){return $.trim(value).length?$.trim(word):null;});}
function lastWord(value){if(!options.multiple)return value;var words=trimWords(value);if(words.length==1)return words[0];var cursorAt=$(input).selection().start;if(cursorAt==value.length){words=trimWords(value)}else{words=trimWords(value.replace(value.substring(cursorAt),""));}
return words[words.length-1];}
function autoFill(q,sValue){if(options.autoFill&&(lastWord($input.val()).toLowerCase()==q.toLowerCase())&&lastKeyPressCode!=KEY.BACKSPACE){$input.val($input.val()+sValue.substring(lastWord(previousValue).length));$(input).selection(previousValue.length,previousValue.length+sValue.length);}};function hideResults(){clearTimeout(timeout);timeout=setTimeout(hideResultsNow,200);};function hideResultsNow(){var wasVisible=select.visible();select.hide();clearTimeout(timeout);stopLoading();if(options.mustMatch){$input.search(function(result){if(!result){if(options.multiple){var words=trimWords($input.val()).slice(0,-1);$input.val(words.join(options.multipleSeparator)+(words.length?options.multipleSeparator:""));}else{$input.val("");$input.trigger("result",null);}}});}};function receiveData(q,data){if(data&&data.length&&hasFocus){stopLoading();select.display(data,q);autoFill(q,data[0].value);select.show();}else{hideResultsNow();}};function request(term,success,failure){if(!options.matchCase)term=term.toLowerCase();var data=cache.load(term);if(false){success(term,data);}else if((typeof options.url=="string")&&(options.url.length>0)){var extraParams={timestamp:+new Date()};$.each(options.extraParams,function(key,param){extraParams[key]=typeof param=="function"?param():param;});var flag=$(input).attr("flag");$.ajax({mode:"abort",port:"autocomplete"+(flag?"&flag="+flag:""),dataType:options.dataType,url:options.url+"&flag="+flag,data:$.extend({q:lastWord(term),limit:options.max},extraParams),success:function(data){var parsed=options.parse&&options.parse(data)||parse(data);cache.add(term,parsed);success(term,parsed);}});}else{select.emptyList();failure(term);}};function parse(data){var parsed=[];var rows=data.split("\n");for(var i=0;i<rows.length;i++){var row=$.trim(rows[i]);if(row){row=row.split("|");parsed[parsed.length]={data:row,value:row[0],result:options.formatResult&&options.formatResult(row,row[0])||row[0]};}}
return parsed;};function stopLoading(){$input.removeClass(options.loadingClass);};};$.Autocompleter.defaults={inputClass:"ac_input",resultsClass:"ac_results",loadingClass:"ac_loading",minChars:1,delay:400,matchCase:false,matchSubset:true,matchContains:false,cacheLength:10,max:100,mustMatch:false,extraParams:{},selectFirst:true,formatItem:function(row){return row[0];},formatMatch:null,autoFill:false,width:0,multiple:false,multipleSeparator:", ",highlight:function(value,term){return value;},scroll:true,scrollHeight:180};$.Autocompleter.Cache=function(options){var data={};var length=0;function matchSubset(s,sub){if(!options.matchCase)s=s.toLowerCase();var i=s.indexOf(sub);if(options.matchContains=="word"){i=s.toLowerCase().search("\\b"+sub.toLowerCase());}
if(i==-1)return false;return i==0||options.matchContains;};function add(q,value){if(length>options.cacheLength){flush();}
if(!data[q]){length++;}
data[q]=value;}
function populate(){if(!options.data)return false;var stMatchSets={},nullData=0;if(!options.url)options.cacheLength=1;stMatchSets[""]=[];for(var i=0,ol=options.data.length;i<ol;i++){var rawValue=options.data[i];rawValue=(typeof rawValue=="string")?[rawValue]:rawValue;var value=options.formatMatch(rawValue,i+1,options.data.length);if(value===false)continue;var firstChar=value.charAt(0).toLowerCase();if(!stMatchSets[firstChar])stMatchSets[firstChar]=[];var row={value:value,data:rawValue,result:options.formatResult&&options.formatResult(rawValue)||value};stMatchSets[firstChar].push(row);if(nullData++<options.max){stMatchSets[""].push(row);}};$.each(stMatchSets,function(i,value){options.cacheLength++;add(i,value);});}
setTimeout(populate,25);function flush(){data={};length=0;}
return{flush:flush,add:add,populate:populate,load:function(q){if(!options.cacheLength||!length)return null;if(!options.url&&options.matchContains){var csub=[];for(var k in data){if(k.length>0){var c=data[k];$.each(c,function(i,x){if(matchSubset(x.value,q)){csub.push(x);}});}}
return csub;}else if(data[q]){return data[q];}else if(options.matchSubset){for(var i=q.length-1;i>=options.minChars;i--){var c=data[q.substr(0,i)];if(c){var csub=[];$.each(c,function(i,x){if(matchSubset(x.value,q)){csub[csub.length]=x;}});return csub;}}}
return null;}};};$.Autocompleter.Select=function(options,input,select,config){var CLASSES={ACTIVE:"ac_over"};var listItems,active=-1,data,term="",needsInit=true,element,list;function init(){if(!needsInit)return;element=$("<div/>").hide().addClass(options.resultsClass).css("position","absolute").appendTo(document.body);list=$("<ul/>").appendTo(element).mouseover(function(event){if(target(event).nodeName&&target(event).nodeName.toUpperCase()=='LI'){active=$("li",list).removeClass(CLASSES.ACTIVE).index(target(event));$(target(event)).addClass(CLASSES.ACTIVE);}}).click(function(event){$(target(event)).addClass(CLASSES.ACTIVE);select();input.focus();return false;}).mousedown(function(){config.mouseDownOnSelect=true;}).mouseup(function(){config.mouseDownOnSelect=false;});if(options.width>0)element.css("width",options.width);needsInit=false;}
function target(event){var element=event.target;while(element&&element.tagName!="LI")element=element.parentNode;if(!element)return[];return element;}
function moveSelect(step){listItems.slice(active,active+1).removeClass(CLASSES.ACTIVE);movePosition(step);var activeItem=listItems.slice(active,active+1).addClass(CLASSES.ACTIVE);if(options.scroll){var offset=0;listItems.slice(0,active).each(function(){offset+=this.offsetHeight;});if((offset+activeItem[0].offsetHeight-list.scrollTop())>list[0].clientHeight){list.scrollTop(offset+activeItem[0].offsetHeight-list.innerHeight());}else if(offset<list.scrollTop()){list.scrollTop(offset);}}};function movePosition(step){active+=step;if(active<0){active=listItems.size()-1;}else if(active>=listItems.size()){active=0;}}
function limitNumberOfItems(available){return options.max&&options.max<available?options.max:available;}
function fillList(){list.empty();var max=limitNumberOfItems(data.length);for(var i=0;i<max;i++){if(!data[i])continue;var formatted=options.formatItem(data[i].data,i+1,max,data[i].value,term);if(formatted===false)continue;var li=$("<li/>").html(options.highlight(formatted,term)).addClass(i%2==0?"ac_even":"ac_odd").appendTo(list)[0];$.data(li,"ac_data",data[i]);}
listItems=list.find("li");if(options.selectFirst){listItems.slice(0,1).addClass(CLASSES.ACTIVE);active=0;}
if($.fn.bgiframe)list.bgiframe();}
return{display:function(d,q){init();data=d;term=q;fillList();},next:function(){moveSelect(1);},prev:function(){moveSelect(-1);},pageUp:function(){if(active!=0&&active-8<0){moveSelect(-active);}else{moveSelect(-8);}},pageDown:function(){if(active!=listItems.size()-1&&active+8>listItems.size()){moveSelect(listItems.size()-1-active);}else{moveSelect(8);}},hide:function(){element&&element.hide();listItems&&listItems.removeClass(CLASSES.ACTIVE);active=-1;},visible:function(){return element&&element.is(":visible");},current:function(){return this.visible()&&(listItems.filter("."+CLASSES.ACTIVE)[0]||options.selectFirst&&listItems[0]);},show:function(){var offset=$(input).offset();element.css({width:typeof options.width=="string"||options.width>0?options.width:$(input).width(),top:offset.top+input.offsetHeight,left:offset.left}).show();if(options.scroll){list.scrollTop(0);list.css({maxHeight:options.scrollHeight,overflow:'auto'});if($.browser.msie&&typeof document.body.style.maxHeight==="undefined"){var listHeight=0;listItems.each(function(){listHeight+=this.offsetHeight;});var scrollbarsVisible=listHeight>options.scrollHeight;list.css('height',scrollbarsVisible?options.scrollHeight:listHeight);if(!scrollbarsVisible){listItems.width(list.width()-parseInt(listItems.css("padding-left"))-parseInt(listItems.css("padding-right")));}}}},selected:function(){var selected=listItems&&listItems.filter("."+CLASSES.ACTIVE).removeClass(CLASSES.ACTIVE);return selected&&selected.length&&$.data(selected[0],"ac_data");},emptyList:function(){list&&list.empty();},unbind:function(){element&&element.remove();}};};$.fn.selection=function(start,end){if(start!==undefined){return this.each(function(){if(this.createTextRange){var selRange=this.createTextRange();if(end===undefined||start==end){selRange.move("character",start);selRange.select();}else{selRange.collapse(true);selRange.moveStart("character",start);selRange.moveEnd("character",end);selRange.select();}}else if(this.setSelectionRange){this.setSelectionRange(start,end);}else if(this.selectionStart){this.selectionStart=start;this.selectionEnd=end;}});}
var field=this[0];if(field.createTextRange){var range=document.selection.createRange(),orig=field.value,teststring="<->",textLength=range.text.length;range.text=teststring;var caretAt=field.value.indexOf(teststring);field.value=orig;this.selection(caretAt,caretAt+textLength);return{start:caretAt,end:caretAt+textLength}}else if(field.selectionStart!==undefined){return{start:field.selectionStart,end:field.selectionEnd}}};})(jQuery);
jQuery.cookie=function(H,D,A){if(typeof D!="undefined"){A=A||{};if(D===null){D="";A.expires=-1}var G="";if(A.expires&&(typeof A.expires=="number"||A.expires.toUTCString)){var B;if(typeof A.expires=="number"){B=new Date();B.setTime(B.getTime()+(A.expires*24*60*60*1000))}else{B=A.expires}G="; expires="+B.toUTCString()}var K=A.path?"; path="+(A.path):"";var C=A.domain?"; domain="+(A.domain):"";var I=A.secure?"; secure":"";document.cookie=[H,"=",encodeURIComponent(D),G,K,C,I].join("")}else{var F=null;if(document.cookie&&document.cookie!=""){var L=document.cookie.split(";");for(var J=0;J<L.length;J++){var E=jQuery.trim(L[J]);if(E.substring(0,H.length+1)==(H+"=")){F=decodeURIComponent(E.substring(H.length+1));break}}}return F}};
function add_key(){var e=$("#search").attr("href"),t=$.trim($("#keyw").val());if(t==""||t=="请输入房源特征,地点或小区名..."){alert("请输入房源特征,地点或小区名..."),$("#keyw").val(""),$("#keyw").focus();return}var n=/[\u4e00-\u9fa5 a-z A-Z 0-9]/g,r=t.match(n);if(r){var i="";i=r.join(","),t=i.replace(/,/g,"")}t!=""&&t!="请输入房源特征,地点或小区名..."&&(e+="rs"+t+"/",location.href=e);var e=$("#search").attr("href"),t=$.trim($("#keyw").val());if(t==""||t=="请输入房源特征,地点或小区名..."){alert("请输入房源特征,地点或小区名..."),$("#keyw").val(""),$("#keyw").focus();return}var n=/[\u4e00-\u9fa5 a-z A-Z 0-9]/g,r=t.match(n);if(r){var i="";i=r.join(","),t=i.replace(/,/g,"")}t!=""&&t!="请输入房源特征,地点或小区名..."&&(e+="rs"+t+"/",location.href=e)}function auto(){var e=$("#search").attr("href"),t=$.trim($("#keyw").val()),n=$("#tag").val(),r=$("#tag_val").val();if(e=="/ershoufang/" || e=="/ershoufang/ditie/" || e=="/zufang/"){if(n=="1")e+="c"+r+"/"}else if(e=="/sold/"){if(n=="1")e+="c"+r+"/"}else if(n=="0"){r=r.split("*");var i=r[0],s=r[1];e+="db"+s+"/"}e+="rs"+t+"/",location.href=e}function Show(e){document.getElementById(e).style.display="block"}function Hidden(e){document.getElementById(e).style.display="none"}jQuery(function(){$("#keyw").focus(function(){var e=$("#keyw").val();e=="请输入房源特征,地点或小区名..."&&$("#keyw").val("")}).blur(function(){var e=$("#keyw").val();e==""&&$("#keyw").val("请输入房源特征,地点或小区名...")}).keydown(function(){var e=$("#keyw").val().length;if(e>50){var t=$("#keyw").val(),n=t.substr(0,50);$("#keyw").val(n)}}),$("#keyw").autocomplete("/load.php?from=header",{width:260,scrollHeight:400,max:15,selectFirst:!0}).result(auto)});$(function(){$('.nav_h > ul > li > a').removeClass('green');var currentUrl=location.href;if(currentUrl.indexOf("/jingjiren/")!="-1"){$('.nav_h ul li a').eq(4).addClass('green')}else if(currentUrl.indexOf("/xiaoqu/")!="-1"||currentUrl.indexOf("/c-")!="-1"){$('.nav_h ul li a').eq(3).addClass('green')}else if(currentUrl.indexOf("/ask/")!="-1"){$('.nav_h ul li a').eq(5).addClass('green')}else if(currentUrl.indexOf("/pinggu/")!="-1"){$('.nav_h ul li a').eq(6).addClass('green')}else{$('.nav_h ul li a').eq(0).addClass('green')}});
(function($){$.fn.lazyload=function(options){var settings={threshold:0,failure_limit:0,event:"scroll",effect:"show",container:window,skip_invisible:true};if(options){if(null!==options.failurelimit){options.failure_limit=options.failurelimit;delete options.failurelimit;}
$.extend(settings,options);}
var elements=this;if(0==settings.event.indexOf("scroll")){$(settings.container).bind(settings.event,function(event){var counter=0;elements.each(function(){if(settings.skip_invisible&&!$(this).is(":visible"))return;if($.abovethetop(this,settings)||$.leftofbegin(this,settings)){}else if(!$.belowthefold(this,settings)&&!$.rightoffold(this,settings)){$(this).trigger("appear");}else{if(++counter>settings.failure_limit){return false;}}});var temp=$.grep(elements,function(element){return!element.loaded;});elements=$(temp);});}
this.each(function(){var self=this;self.loaded=false;$(self).one("appear",function(){if(!this.loaded){$("<img />").bind("load",function(){$(self).hide().attr("src",$(self).data("original"))[settings.effect](settings.effectspeed);self.loaded=true;}).attr("src",$(self).data("original"));};});if(0!=settings.event.indexOf("scroll")){$(self).bind(settings.event,function(event){if(!self.loaded){$(self).trigger("appear");}});}});$(settings.container).trigger(settings.event);return this;};$.belowthefold=function(element,settings){if(settings.container===undefined||settings.container===window){var fold=$(window).height()+$(window).scrollTop();}else{var fold=$(settings.container).offset().top+$(settings.container).height();}
return fold<=$(element).offset().top-settings.threshold;};$.rightoffold=function(element,settings){if(settings.container===undefined||settings.container===window){var fold=$(window).width()+$(window).scrollLeft();}else{var fold=$(settings.container).offset().left+$(settings.container).width();}
return fold<=$(element).offset().left-settings.threshold;};$.abovethetop=function(element,settings){if(settings.container===undefined||settings.container===window){var fold=$(window).scrollTop();}else{var fold=$(settings.container).offset().top;}
return fold>=$(element).offset().top+settings.threshold+$(element).height();};$.leftofbegin=function(element,settings){if(settings.container===undefined||settings.container===window){var fold=$(window).scrollLeft();}else{var fold=$(settings.container).offset().left;}
return fold>=$(element).offset().left+settings.threshold+$(element).width();};$.extend($.expr[':'],{"below-the-fold":function(a){return $.belowthefold(a,{threshold:0,container:window})},"above-the-fold":function(a){return!$.belowthefold(a,{threshold:0,container:window})},"right-of-fold":function(a){return $.rightoffold(a,{threshold:0,container:window})},"left-of-fold":function(a){return!$.rightoffold(a,{threshold:0,container:window})}});})(jQuery);
var option = {};
option.path = '/';

function selectTaga(showContent,selfObj){
	// 操作标签
	var tag = document.getElementById("tagsa").getElementsByTagName("li");
	var taglength = tag.length;
	for(i=0; i<taglength; i++){
		tag[i].className = "";
	}
	selfObj.parentNode.className = "selectTaga";
	// 操作内容
	for(i=0; j=document.getElementById("tagContenta"+i); i++){
		j.style.display = "none";
	}
	document.getElementById(showContent).style.display = "block";
}

//border color
$(function(){
	$("#listData div").hover(	
	  function () {
	    $(this).addClass("indetailbg");
	  },
	  function () {
	    $(this).removeClass("indetailbg");
	  }
	); 

	$("#keyw").keydown(function(event){
	  if (event.keyCode==13){
			add_key();
	  }
	});
	
	$(".smp > dd").hover(
	  function () {
        var th = $(this).index();
		//alert(th);
		th++;
		$(this).parent().parent().find('ul img').hide();
		$(this).parent().parent().find('ul img').eq(th).show();
	  },
	  function () {
		$(this).parent().parent().find('ul img').hide();
		$(this).parent().parent().find('ul img').eq(0).show();
	  }
	);

	
	$('input[name="duibi[]"]').click(function(i){
		var id_str = $.cookie('id_str_zufang');
		if($(this).attr('checked')){
			//选中
			if(id_str==null){
				id_str = $(this).val();
			}else{
				var tmp = id_str.split(',');
				if(tmp){
					var tmp_size = tmp.length;
					if(tmp_size>=4){
						var rbpeat = 4;
					}else{
						var index = id_str.indexOf($(this).val());
						if(index == -1){//当前的id没在cookie里
							id_str = $(this).val()+','+id_str;
						}else{
							id_str = id_str.replace($(this).val(),'');
							id_str = $(this).val()+','+id_str;					
						}					
					}
				}
			}
		}else{
			//取消选中
			id_str = id_str.replace($(this).val(),'');
		}
		var id_arr = id_str.split(',');
		if(id_arr){
			id_str = '';
			var j=0;
			var size = id_arr.length;
			for(var i=0; i<size; i++){
				if(id_arr[i]){
					//alert(id_arr[i]);
					id_str += id_arr[i] + ',';
					j++;
					if(j>=4){
						break;
					}
				}
			}
			id_str=id_str.substr(0,id_str.length-1);
		}
		$.cookie('id_str_zufang',id_str,option);
		if(!id_str){
			$('#contrast').hide();
			return;
		}else{
			$.ajax({
					type: "POST",
					url: "/load_lg.php?from=duibi_zf",
					data: "ids="+id_str,
					success: function(msg){
						if(msg!='-1'){
							$('#duibi').html(msg);
							$('#contrast').show();
							if(rbpeat==4){
								$('#tip').html('最多只能对比4套房源');
								$('#tip').show();
							}
						}
					}
			})
	    }
    })
})

function savesearch(){
	var shuzi = $('#hassave').html();
	shuzi = shuzi.replace('(','').replace(')','');
	if(shuzi==3){
		var truthBeTold = window.confirm('保存的条件已达到3个，将会删除最早保存的条件，确定吗？');
		if (!truthBeTold) {
			return;
		}
	}
	var url=location.href;
	var str='';
	var b_name = $('#b_name').val();
	var d_name = $('#d_name').val();
	var li_name = $('#li_name').val();
	var s_name = $('#s_name').val();	
	var p_name = $('#p_name').val();
	var a_name = $('#a_name').val();
	var l_name = $('#l_name').val();
	var mt_name = $('#mt_name').val();
	var rs = $('#rs').val();
	if(rs) str+=rs+'、';
	if(b_name) str+=b_name+'、';
	if(d_name) str+=d_name+'、';
	if(li_name) str+=li_name+'、';
	if(s_name) str+=s_name+'、';	
	if(p_name) str+=p_name+'、';
	if(a_name) str+=a_name+'、';
	if(l_name) str+=l_name+'、';
	if(mt_name) str+=mt_name+'、';
	if(str!=''){
		var len=str.length;
		str=str.substr(0,len-1);
		str='<a href="'+url+'">'+str+'</a>|';
		var str_conf=$.cookie(scf);
		if(str_conf==null){
			$.cookie(scf,str,option);
		}else{//has cookie
			str_conf=str_conf.split('|');
			var size=str_conf.length;
			if(size>=3) size=2;
			for(var i=0; i<size; i++){
				if(str_conf[i]){
					str+=str_conf[i]+'|';
				}
			}
			$.cookie(scf,str,option);
		}
		$('#bczf').attr('onclick','javascript:void(0)');
		$('#bczf').html('当前条件已经保存');
		$('#bczf').addClass('aeli');
	}else{
		alert('至少请选1个条件');
		return;
	}
}

//method=1:价格区间搜索；method=2:降价房；method=3:免税房
function esf_search(method){
	var sp=$('#sp').val();
	var bp=$('#bp').val();
	
	var downp=0;
	if($("#downp").attr("checked")==true){
		downp=1;
	}
	
	var frebp=0;
	if($("#frebp").attr("checked")==true){
		frebp=1;
	}
	
	if(method==1){
		if(sp=='' && bp==''){
			alert('请输入正确的租金范围');
			return;		
		}
		if(parseInt(sp)<0 || parseInt(bp)<0){
			alert('请输入正确的租金范围');
			return;
		}
		if(parseInt(bp)<parseInt(sp)){
			var tmp = sp;
			sp = bp;
			bp = tmp;			
		}
	}
	
	var url=location.href;
	var pos=url.indexOf('zufang/');
	pos=pos+7;
	url=url.substr(0,pos);
	var ditie = $('#ditie').val();
	if(ditie=='is_ditie'){
		url += 'ditie/'
	}

	var p=$('#p').val();
	var a=$('#a').val();
	var l=$('#l').val();
	var f=$('#f').val();
	var rs=$('#rs').val();
        var tt=$('#tt').val();
        var tn=$('#tn').val();
        var tk=$('#tk').val();
        var to=$('#to').val();
	
	if(ditie){
		var li=$('#li').val();
		var s=$('#s').val();	
		var mt=$('#mt').val();
		if(li){
			url+='li'+li;
			if(s){
				url+='s'+s;
			}
			url+='/';
		}
	}else{
		var db=$('#db').val();
		var cid=$('#cid').val();
		var d=$('#d').val();
		var b=$('#b').val();
		if(d){
			url+='d'+d;
			if(b){
				url+='b'+b;
			}
			url+='/';
		}
		if(db) url+='db'+db+'/';
		if(cid) url+='cid'+cid+'/';
	}


	if(sp||bp||a||l||downp||frebp||p||f||rs||mt|tt|tn|tk|to){
		if(sp){
			url+='sp'+sp;
			url+='bp'+bp;
		}else{
			url+='p'+p;
		}
		if(a) url+='a'+a;
		if(l) url+='l'+l;
		if(mt) url+='mt'+mt;
		if(f) url+='f'+f;
		if(downp) url+='dp1';
		if(frebp) url+='fp1';
                if(tt) url+='tt'+tt;
                if(tn) url+='tn'+tn;
                if(tk) url+='tk'+tk;
                if(to) url+='to'+to;
		if(rs) url+='rs'+rs;
		url+='/';
	}		
	location.href=url;
}

//取所有商圈
function getAllSQ(){
	var id_str = 'sq';
	$.ajax({
			type: "POST",
			url: "/load_lg.php?from=AllSQ",
			data: "ids="+id_str+'&zf=1',
			success: function(msg){
				$('#citylist2').html(msg);
			}
	})
}

//房源对比
function duibi(obj){
	var hn = parseInt($('#hasselectednum').html());
	if(hn<2){
		$('#tip').show('请最少选择2条房源进行对比');
		//$('#tip').show();
		return;
	}else{
		window.open('/zufang/duibi/','_blank');
	}
}

//对比弹层中删除某个房源
function del_duibi(obj,hid){
	$('input[value="'+hid+'"]').attr('checked',false);
	var hn = parseInt($('#hasselectednum').html());
	del_cookie(hid);
	$(obj).parent().parent().parent().remove();
	hn--;
	if(hn==0) $('#contrast').hide();
	$('#hasselectednum').html(hn);
	$('#tip').hide();
}

//从id_str cookie中删除某个房源
function del_cookie(hid,go){
	var id_str = $.cookie('id_str_zufang');
	var id_arr = id_str.split(',');
	if(id_arr){
		id_str = '';
		var size = id_arr.length;
		for(var i=0; i<size; i++){
			if(id_arr[i] && hid!=id_arr[i]){
				id_str += id_arr[i] + ',';
			}
		}
		id_str=id_str.substr(0,id_str.length-1);
		$.cookie('id_str_zufang',id_str,option);
	}
	if(go==1){
		location.reload();
	}
}

function guanzhu(e) {
	$.ajax({
		type: "POST",
		url: "/load_lg.php?from=guanzhu",
		data: "hid=" + e + "&type=2",
		success: function(t) {
			if (t == "-1") {
				opennewpage(389, 249, "/themes/2010a/template/inc/tologin.html");
				return
			}
			t == "true" ? ($("#favorite" + e).html("<label onmouseover=\"Show('star" + e + "');$(this);\" onmouseout=\"Hidden('star" + e + '\');$(this);"><div id="star' + e + '" class="star"><div class="prompta">已关注</div></div></label>'), $("#guanzhu" + e).html('<li class="one" onmouseover="Show(\'attention' + e + "');$(this);\" onmouseout=\"Hidden('attention" + e + '\');$(this);" ><a class="res" href="javascript:void(0);" onclick="javascript:void(0);"><i class="two"></i><span>已关注</span></a><div id="attention' + e + '" class="buguan"><dl></dl><ol><strong>您已关注!</strong><br /><a href="/center/myfavorite.php" target="_blank">查看您已关注的所有房源>></a></ol></div></li>'), $("#attention" + e).show()) : alert("关注失败")
		}
	})
}