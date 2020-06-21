function validate() {
    var passwd = document.getElementById("passwd");
    var passwdRegEx = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
    if (!passwd.value.match(passwdRegEx)) {
        alert(
            "Please enter a password between 6 to 20 chars, with atleast one lowercase letter, one uppercase letter and one number!"
        );
        passwd.focus();
        return false;
    }
}
