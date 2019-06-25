window.addEventListener("load",function(){
    var section = this.document.querySelector("#category");
    var tbody = section.querySelector("tbody")
    var addBtn = this.document.querySelector("input[type=button]");
    var name = this.document.querySelector("input[type=text]");

    addBtn.onclick=function(){
        
        var name1 = name.value;
        if(name.value== null || name.value==""){
            alert('새로운 카테고리를 입력해');
            return;
        }
        var request = new XMLHttpRequest();
        request.open("GET","category-ajax?n="+name1,false);      
        request.send();
        
        alert(request.responseText);
        var json = JSON.parse(request.responseText);
        var tempate = section.querySelector(".list-template");
        var tempate2 = section.querySelector(".sum-template");
        //var key2 = Object.keys(json[json.lenth]);
    
        tbody.innerHTML="";
        
        var key = Object.keys(json.list[0]);
        var key1 = Object.keys(json);
        alert(json.sum);
        console.log(json.list.lenth);
       
        for(var i = 0; i<json.list.length;i++){
           // alert("추가");
           var cloneTr = document.importNode(tempate.content,true);
           
            var nameEl = cloneTr.querySelector(".name");
            var count = cloneTr.querySelector(".count");
            
            nameEl.innerText=json.list[i][key[1]];
            count.innerText=json.list[i][key[0]];
            
            tbody.append(cloneTr);
        }
        var cloneTr = document.importNode(tempate2.content,true);
        var sumEl = cloneTr.querySelector(".sum");
        var summEl = cloneTr.querySelector(".summ");
        
        summEl.innerText ='합계';
        sumEl.innerText=json.sum;
       
        tbody.append(cloneTr);
        
        name.value = '';
        
    };
});