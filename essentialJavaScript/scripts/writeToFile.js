
const fs = require("fs");
let app={};
app.write = function(text) {

    fs.appendFile("Sample.txt", text, (err) => {

        if (err) {
            console.log(err);
        } else {
            console.log('File Write -Done');
        }
        fs.close(0,function () {

            console.log('File-Closed')

        });
    });
}

app.read = function(){

    fs.readFile('Sample.txt','utf-8',(data,err)=>{

        if(err){
            console.log(err);

        }
        else{
            console.log(data);
        }
        fs.close(0,function () {
            console.log('file closed');
        });
    });

}

app.write("Hello India");
app.read();