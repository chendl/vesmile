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
})

