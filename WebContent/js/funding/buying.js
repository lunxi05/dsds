

window.addEventListener("load", function() {

	var select = document.querySelector("#mySelect");

	select.addEventListener("change", function() {

		var x = document.getElementById("mySelect").value;
		document.getElementById("demo").innerHTML = x;
	})

});

