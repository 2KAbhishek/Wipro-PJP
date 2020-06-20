let txt = prompt("Enter Text :");
let num = Number(prompt("Remove How Many Characters?"));
document.write("Entered Text : " + txt + "<br>");

function removeChars(text, number) {
    return text.substring(number);
}

document.write("After Removing " + num + " Chars : " + removeChars(txt, num));
