let num = prompt("Enter Number : ");
document.write("Entered Number : " + num + "<br>");
let revNum = num.split("").reverse().join("");

if (revNum.charAt(revNum.length - 1) == "-") {
    revNum = "-" + revNum.substring(0, revNum.length - 1);
}

document.write("Reversed Number : " + revNum);
