 $(window).load(function() {
        $('#bnrslider').nivoSlider();
    });

 
 $(document).ready(function() {
	    // find all the input elements with title attributes
		$('input[title!=""]').hint();
	});

 $(document).ready(function() {
	    // find all the input elements with title attributes
	 $("a[rel^='prettyPhoto']").prettyPhoto();
	});

 $(document).ready(function(){
		$('#zoommer').zoom();
	});
 

 $(document).ready(function() {
		$("img.imgthnail").mouseover(function(e) {
			  var imgName = $(this).attr("src");
			   var altName = $(this).parent().attr("href");
			  $(this).css({
					border: 'solid 1px red'
			  });

			  $("#loadimg").css({
					display: 'none'
			  });			

			  $("#loadimg").attr('src', imgName).load(function() {
				
					$("#loadimg").css({
						  display: 'block'
					});
			  });
			  $("#loadimg").parent().attr('href', altName).load();
			  
		});

		$("img.imgthnail").mouseout(function(e) {
			  $(this).css({
					border: 'solid 1px #014464'
			  });
			  $('#zoommer').zoom();
		});
		
		
 });
 
 $(document).ready(function() {
		$("#acontent div").hide(); // Initially hide all content
		$("#tabs li:first").attr("id","current"); // Activate first tab
		$("#acontent div:first").fadeIn(); // Show first tab content
	    
	    $('#tabs a').click(function(e) {
	        e.preventDefault();        
	        $("#acontent div").hide(); //Hide all content
	        $("#tabs li").attr("id",""); //Reset id's
	        $(this).parent().attr("id","current"); // Activate this
	        $('#' + $(this).attr('title')).fadeIn(); // Show content for current tab
	    });
	})();