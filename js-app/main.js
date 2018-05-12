    var messages=[];
    var messageinput=document.getElementById("message");
    var messageBox=document.getElementById("display");
    function insert(){
    
    messages.push(messageinput.nodeValue);
    clearAndShow();
}

function clearAndShow(){
    messageinput.nodeValue="";
    messageBox.innerHTML = "";
    var content="<b>All Elements of the Arrays :</b><br>";
    messageBox.innerHTML += "Messages: " +  "<br/>";
    for(var i=0;i<messages.length;i++){
        content +=messages[i]+"<br>";
    }
    document.getElementById('display').innerHTML = content; 
    messages.toString();
    document.getElementById("display").innerHTML = messages
    var fruits, text, fLen, i;

fruits = ["Banana", "Orange", "Apple", "Mango"];
fLen = fruits.length;
text = "<ul>";
for (i = 0; i < fLen; i++) {
    text += "<li>" + fruits[i] + "</li>";
}
text += "</ul>";
document.getElementById("display").innerHTML = text;
}