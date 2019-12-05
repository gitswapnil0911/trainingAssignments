var converterRef = require("./Converter");
var interestCal = require('./SimpleInterest');
var areaOfCircle = require('./AreaOfCircle').areaOfCircle();
var acr = require('./AreaOfCircle');

console.log(converterRef.currencyConverter(200));

console.log(converterRef.farenToCel(32));
console.log(interestCal);
console.log(interestCal.simpleInterest(500,2,8));
console.log(areaOfCircle);
console.log(acr);
console.log(acr.areaOfCircle());