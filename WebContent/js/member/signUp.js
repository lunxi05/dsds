window.addEventListener("load", function(){
    var signUp = document.querySelector('.signUp');
    
    var email = document.getElementsByName('email').values;
    var name = document.getElementsByName('name').values;
    var pw = document.getElementsByName('pw').values;
    var phone = document.getElementsByName('phone').values;
    
    signUp.onclick = function(){

    console.log(email);
    console.log(name);
    console.log(pw);
    console.log(phone);

    };
});