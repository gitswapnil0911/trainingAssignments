(function f2() {

    var txtField = document.getElementById("code");

    txtField.addEventListener('focus',function () {
        console.log('event fired');

        var para = document.getElementById("msg1");
        para.style.display='none';

    });
})();
