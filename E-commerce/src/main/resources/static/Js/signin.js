const signin = () => {
    let e = document.getElementById('email').value;
    let p = document.getElementById('password').value;
    let rp = document.getElementById('rpassword').value;

    if(e.length > 0 && p.length > 0)
    {
        if(p === rp)
        {
            window.location.href="./home.html";
        }
        else{
            alert('Enter valid password')
        }
    }
}