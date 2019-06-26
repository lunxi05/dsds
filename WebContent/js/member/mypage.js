window.addEventListener("load",function(){
    var section = this.document.querySelector("#section");
    var ul = section.querySelector(".tap-menu-list");
    var div = section.querySelector(".content-list");

    ul.onclick=function(e){
        e.preventDefault();
        if(e.target.tagName !='A')
            return;

        var divs = div.children;
        for(var i = 0 ; i<divs.length; i++){
            divs[i].classList.remove("current");
        }
        var contentId=e.target.href.split("#")[1];

        var contentIddiv = div.querySelector("#"+contentId);
        contentIddiv.classList.add("current");
    };

});