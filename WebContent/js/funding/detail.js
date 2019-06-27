window.addEventListener("load",function(){
    var section = this.document.querySelector("#funding-tab");
    var ul = section.querySelector("ul");
    var div = this.document.querySelector("#tab-content");
    ul.onclick = function(e){
   
        if(e.target.tagName !='A')
            return;
            
        var divs = div.children;
        for(var i = 0; i<divs.length; i++)
        divs[i].classList.remove("current");
        
        var contentId = e.target.href.split('#')[1];
        
        var contentIdsection = div.querySelector('#'+contentId);
        contentIdsection.classList.add("current");
    };
});