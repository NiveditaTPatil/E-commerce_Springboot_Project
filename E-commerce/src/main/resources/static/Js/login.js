const login = () =>{
    let u = document.getElementById('email').value;
    let pw = document.getElementById('password').value;
    if(u.length > 0 && pw.length> 0)
    {
        window.location.href="./home.html";
    }
}