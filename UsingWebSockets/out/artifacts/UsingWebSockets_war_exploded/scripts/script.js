(function () {

    var websocket =
        new WebSocket("ws://localhost:8069/UsingWebSockets_war_exploded/wserver/mumbai");


    var button = document.getElementById("submit");

    var endButton = document.getElementById("end");

    endButton.addEventListener("click", function () {
        websocket.close();
    })

    var txtField = document.getElementById("textMessage");

    var textArea = document.getElementById("resp");

    button.addEventListener("click",function () {

        var message = txtField.value;

        var obj = {
            "partnerCode" : 101,
            "partnerName" : "Ramesh",
            "mobileNumber" : 6272782
        }
        websocket.send(JSON.stringify(obj));
        //websocket.send(message);

    })

    function captureTextArea(message){
        var existing = textArea.value;
        if(existing === 'undefined'){
            textArea.value=message.data;
        }
        else{
            textArea.value = existing.concat(message.data);
        }

    }

    websocket.onmessage = function(message) {

        captureTextArea(message);

    }

        websocket.onopen =  function (message) {

            captureTextArea(message);

        }

            websocket.onclose = function (message) {
        textArea.value="Connection closed!";
            }

                websocket.onerror = function (message) {  }

})();