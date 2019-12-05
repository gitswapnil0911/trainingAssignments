function outer() {

    var name = "Hello World";

    return  function(){

        return name;
    }
}

function displayName() {

    var funcRef = outer();
    console.log(funcRef);

   var capturedPrivate = funcRef();
    console.log(capturedPrivate);
   //console.log(name);
}

displayName();