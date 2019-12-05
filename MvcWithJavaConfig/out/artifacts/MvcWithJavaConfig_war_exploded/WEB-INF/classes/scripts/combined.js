var combined=(function(){


    addmedicine = function(){
        var txtField = document.getElementById("code");

        txtField.addEventListener('focus',function () {
            console.log('event fired');

            var para = document.getElementById("msg3");
            para.style.display='none';

        });
    }

    return{
        addMedicine:addmedicine
    }
})();

combined.addMedicine();