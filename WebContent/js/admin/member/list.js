window.addEventListener("load", function() {

	var notice = document.querySelector("#member-list");
	var tbody = notice.querySelector("tbody");

	var pbtn = document.querySelectorAll(".paging li"), n;

	for (n = 0; n < pbtn.length; n++) {

		pbtn[n].onclick = function() {

			var page = 1;
			if (pbtn[n].value != null && pbtn[n].value != "")
				page = pbtn[n].value;

			var request = new XMLHttpRequest();
			request.open("GET", "/admin/member/list-ajax?p=" + page, false);
			request.send();

			console.log(request.responseText);

			var json = JSON.parse(request.responseText);

			var tr = tbody.firstElementChild;

			tbody.innerHTML = "";

			for (var i = 0; i < 10; i++) {
				var cloneTr = tr.cloneNode(true);

				var idEl = cloneTr.querySelector(".id");
				var titleEl = cloneTr.querySelector(".email");
				var writerEl = cloneTr.querySelector(".name");
				var dateEl = cloneTr.querySelector(".regdate");

				idEl.innerText = json[i]["id"];
				titleEl.innerText = json[i]["email"];
				writerEl.innerText = json[i]["name"];
				dateEl.innerText = json[i]["regDate"];

				tbody.append(cloneTr);
			}
		};
	}

})