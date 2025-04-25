// Input from user using prompt
let num = prompt("Enter a number:");
num = Number(num); // Convert to number

if (num % 2 === 0) {
    alert(num + " is Even");
} else {
    alert(num + " is Odd");
}
