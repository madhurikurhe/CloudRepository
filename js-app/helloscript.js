


var messages  = [];

function insert ( ) {
    
    messages.push( document.getElementById("messages").value); 
    document.getElementById("messages").value="";
    show();
}


function show(){

fLen = messages.length;
text = "<ol>";
for (i = 0; i < fLen; i++) {
    text += "<li>" + messages[i] + " <input value='x' type='button' id='i' onClick='myFunction(this)' ></li>";
}


text += "</ol>";
document.getElementById("messageBox").innerHTML = text

}

function myFunction(btn) {
    var index=btn.getAttribute('value');
    messages.splice(index-1, 1);
    show();    

  }