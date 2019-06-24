window.addEventListener("load", function() {
	var banner = document.querySelector("#banner .center");
	var ul = banner.querySelector("ul");

	var prev = banner.querySelector(".prev-banner");
	var next = banner.querySelector(".next-banner");

	prev.onclick = function() {
		var lis = ul.querySelector("li");
		var center = ul.querySelector(".center");
		var left = center.previousElementSibling;
		var right = center.nextElementSibling;


		if (left) {
			
		} else {

		}
	};
	
	next.onclick = function(){
		
	};
})