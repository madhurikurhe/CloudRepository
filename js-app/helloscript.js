

var messages  = [];

function insert ( ) {
    var retrievedData = localStorage.getItem("msg");
    var messages = JSON.parse(retrievedData);   
    messages.push(document.getElementById("messages").value); 
    //msgs.push( document.getElementById("messages").value);
    localStorage.setItem('msg',JSON.stringify(messages));
    document.getElementById("messages").value="";
    show();
}

function show(){
var retrievedData = localStorage.getItem("msg");
var msgs = JSON.parse(retrievedData);
fLen = msgs.length;
text = "<ol>";
for (i = 0; i < fLen; i++) {
    text += "<li>" + msgs[i] + " <input value='x' type='button' onClick='myFunction(this)' ></li>";
}
text += "</ol>";
document.getElementById("messageBox").innerHTML = text

}

function myFunction(btn) {
    var retrievedData = localStorage.getItem("msg");
    var messages = JSON.parse(retrievedData);
    var index=btn.getAttribute('value');
    messages.splice(index-1,1);
    localStorage.setItem('msg',JSON.stringify(messages));
    show();
  }

  window.onload=function(){
  show(); 
    }
  