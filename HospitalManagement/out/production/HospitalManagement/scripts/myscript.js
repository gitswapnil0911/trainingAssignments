(function () {

    var txtField = document.getElementById("code");

    txtField.addEventListener('focus',function () {
        console.log('event fired');

        var para = document.getElementById("msg");
        para.style.display='none';

    });
})();