window.addEventListener("load", function() {
	var banner = document.querySelector("#banner .center");
	var ul = banner.querySelector("ul");

	var prev = banner.querySelector(".prev-banner");
	var next = banner.querySelector(".next-banner");

	prev.onclick = function() {
		var li = ul.querySelector("li");
		var front = ul.querySelector(".front");
		var n = front.nextElementSibling;

		if (n) {
			front.classList.remove("front");
			front.classList.add("back");
			n.classList.remove("back");
			n.classList.add("front");
		} else {
			front.classList.remove("front");
			front.classList.add("back");
			li.classList.remove("back");
			li.classList.add("front");
		}
	};
	
	next.onclick = function(){
//		var li = ul.lastChild;
//		
//		alert(li.className);
//		
//		var front = ul.querySelector(".front");
//		var n = front.previousElementSibling;
//
//		if (n) {
//			front.classList.remove("front");
//			front.classList.add("back");
//			n.classList.remove("back");
//			n.classList.add("front");
//		} else {
//			front.classList.remove("front");
//			front.classList.add("back");
//			li.classList.remove("back");
//			li.classList.add("front");
//		}		
	};
})