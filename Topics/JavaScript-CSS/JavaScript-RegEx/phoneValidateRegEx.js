function validate() {
    var phone = document.getElementById("phone");
    var phone_regex = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;

    if (phone.value.match(phone_regex)) {
        return true;
    } else {
        alert("Re-enter number in XXX XXX XXXX or XXX-XXX-XXXX or XXX.XXX.XXXX formats");
        phone.focus();
        return false;
    }
}
