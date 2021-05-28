
 
function signup(event){
    console.log(event);
    event.preventDefault();
    var usernam = document.getElementById("username");
  var pasword = document.getElementById("password");
  var emil = document.getElementById("email");
    console.log(usernam.value +" "+pasword.value);
  
 
    const obj = {
        email:emil.value,
        username:usernam.value,
        password:pasword.value
    }
 
     fetch('http://localhost:8080/api/auth/signup',{
        method: 'POST',
        headers:{
            
            'Content-Type':'application/json'
        },
        body:JSON.stringify(obj),})
        .then(res=> res.status)
        .then(data =>{
            if(data==200){
            window.alert("user registered please login");
            location.reload();
            }
            else if(data==500){
                window.alert("Username or email already in use please try another username or email or login");
            }
            
        });
       

}
   

 
  
