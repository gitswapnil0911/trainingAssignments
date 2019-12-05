(function f1() {

    var txtField = document.getElementById("userName");

    txtField.addEventListener('focus',function () {
        console.log('event fired');

        var para = document.getElementById("msg");
        para.style.display='none';

    });
})();