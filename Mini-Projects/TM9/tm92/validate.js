function validatePass() {
    var passwd = document.getElementById("passwd");
    var passwdRegex = /^(?=.*\d)(?=.*[A-Z]).{6,20}$/;
    if (!passwd.value.match(passwdRegex)) {
        alert("Invalid password!");
        passwd.focus();
        return false;
    }
}
