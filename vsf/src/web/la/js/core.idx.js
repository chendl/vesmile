$(document).ready(function() {
     // Expand Panel
     $(".uname label,.upass label").click(function(){ 
         $(this).hide();
		 $(this).prevAll("input").focus();		 
     }); 
	 
	 $("#username11,#password11").focus(function(){
         $(this).nextAll("label").hide();   
     }); 

     $("#username11,#password11").blur(function(){   
         if($.trim($(this).val()) === ""){
				$(this).val("");
                $(this).nextAll("label").show();
            }		 
     }); 	 

     $(".btn").click(function(){
        window.location.href = 'main.html';  
     });	 
});



