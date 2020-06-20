function getTime() {
    let now = new Date();
    let hours = String(now.getHours()).padStart(2, "0");
    let minutes = String(now.getMinutes()).padStart(2, "0");
    let seconds = String(now.getSeconds()).padStart(2, "0");
    let time = hours + ":" + minutes + ":" + seconds;
    // time = now.toLocaleTimeString();
    document.getElementById("clock").innerHTML = time;
    updateTime();
}

function updateTime() {
    var ref = 1000;
    let update = setInterval("getTime()", ref);
}

getTime();
