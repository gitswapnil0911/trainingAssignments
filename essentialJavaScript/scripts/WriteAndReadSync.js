
let fs = require("fs");
let app={};
app.write = function() {

    var resp = fs.writeFileSync("Sample2.txt", 'Hello India');

    console.log('File Write -Done');

}

app.read = function(){
    console.log('File Read -Start')
    var data = fs.readFileSync('Sample2.txt','utf-8');

    console.log(data);
}

app.write();
app.read();