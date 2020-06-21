function validate() {
    var memNum = document.getElementById("mem_num");
    var passwd = document.getElementById("passwd");
    var memNumRegEx = /^\d+$/;
    var passwdRegEx = /.....+/;
    if (!memNum.value.match(memNumRegEx)) {
        alert("Please enter a number only!");
        memNum.focus();
        return false;
    }
    if (!passwd.value.match(passwdRegEx)) {
        alert("Please enter a password longer than 4 chars!");
        passwd.focus();
        return false;
    }
}
