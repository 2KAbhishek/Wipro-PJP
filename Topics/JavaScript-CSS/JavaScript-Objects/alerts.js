let today = new Date();
let dd = String(today.getDate()).padStart(2, "0");
let mm = String(today.getMonth() + 1).padStart(2, "0");
let yy = String(today.getFullYear()).substring(2);

today = dd + "/" + mm + "/" + yy;

alert("Today's Date : " + today);

let name = prompt("Enter your name : ");
alert("Hello " + name);

let nums = prompt("Enter two numbers (space seperated) :");

let sum = Number(nums.split(" ")[0]) + Number(nums.split(" ")[1]);

alert("Sum is : " + sum);
