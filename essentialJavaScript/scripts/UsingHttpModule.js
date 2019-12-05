
var http = require('http');

    var server = http.createServer(function(request, response){
        if(request.url==='/welcome') {
            response.setHeader("content-type", "text/text");
            response.status = 200;

            response.end("Hello World from Node JS");
        }
        if(request.url==='/info') {
            response.setHeader("content-type", "application/json");
            response.status = 200;

            response.end(JSON.stringify({"bookName":"Mastering Node"}));
        }
});

        server.listen(3000,function () {

            console.log("Sever running in port number 3000");
        })