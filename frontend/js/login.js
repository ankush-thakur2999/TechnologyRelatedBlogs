
 
function login(event){
    console.log(event);
    event.preventDefault();
    var usernam = document.getElementById("username");
  var pasword = document.getElementById("password");
    console.log(usernam.value +" "+pasword.value);
  
 
    const obj = {
        username:usernam.value,
        password:pasword.value
    }
 
     fetch('http://localhost:8080/api/auth/login',{
        method: 'POST',
        headers:{
            
            'Content-Type':'application/json'
        },
        body:JSON.stringify(obj),})
        .then(res=> {
            if(res.status==200){
            window.alert("logged in");
            return res.json();
            }
            else {
                window.alert(" User not registered ,Please check you credentials or Register");
                return Promise.reject(response);
            }
            
        }).then(data => console.log(data));
     
       

}
   

 
  
