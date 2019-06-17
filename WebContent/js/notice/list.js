window.addEventListener("load", function () {
    var main = document.querySelector("#main");
    var pager = document.querySelector("#pager");
    var prvPager = pager.querySelector(".icon-pre");
    var nextPager = pager.querySelector(".icon-next");
    var tbody = main.querySelector(".tbody");

    prvPager.onclick = function(){
    	
        
    	
   
    /*	var page = 1;
        if(txt1.value = null && txt1.value != "")
        page = txt1.value;
        
        var request = new XMLHttpRequest();
        request.open("GET", "/notice/list-ajax?p="+page, false);
        request.send();
        
        var notices = JSON.parse(request.responseText);
        
        //var tr = tbody.children()[0];
        var tr = tbody.firstElementChild;
        //var tr = tbody.querySelector("tr:first-child");
        //tbody.innerHTML= "";
        
        var cloneTr = tr.cloneNode(true);

        var idE1 = cloneTr.querySelector(".num");
        var titleE1 = cloneTr.querySelector(".title a")

        idE1.innerText = "34234";
        titleE1.innerText = "복제된 엘리먼트"

        tbody.append(cloneTr);
	*/

    };
    
});