
var Client = require('node-rest-client').Client;

var myClient = new Client();

myClient.get("http://localhost:5050/customer",function (data,resp) {

    console.log(JSON.stringify(data));

});