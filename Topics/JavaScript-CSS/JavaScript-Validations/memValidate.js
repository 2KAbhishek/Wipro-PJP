function validate() {
    var memNum = document.getElementById("mem_num");
    var passwd = document.getElementById("passwd");
    if (memNum.value == null || memNum.value == "" || isNaN(memNum.value)) {
        alert("Please enter a number only!");
        memNum.focus();
        return false;
    }
    if (passwd.value == "" || passwd.value.length < 4) {
        alert("Please enter a password longer than 4 chars!");
        passwd.focus();
        return false;
    }
}
