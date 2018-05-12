

var messageBox  = document.getElementById("display");
var messages  = [];
var index= [];
//var messageInput  = document.getElementById("messages");
function insert ( ) {
    
    messages.push( document.getElementById("messages").value); 
    document.getElementById("messages").value="";
    var span = document.createElement("SPAN");
    var txt = document.createTextNode("Close");
    span.className = "close";
    span.appendChild(txt);
    
    show();
}

function show(){
    
    for(var i=0;i<messages.length;i++){
        console.log("Message:"+messages[i]);
        
    }
    document.getElementById("messageBox").innerHTML = messages;
    
}
