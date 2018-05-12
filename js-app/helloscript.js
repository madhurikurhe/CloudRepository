


var messages  = [];

function insert ( ) {
    
    messages.push( document.getElementById("messages").value); 
    document.getElementById("messages").value="";
    show();
    //buttonAdd();
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


function buttonAdd(){
    flen=messages.length;
    for(i=1;i<=flen;i++){
    var element = document.createElement("input");
    element.setAttribute("type", "button");
    element.setAttribute("value", i);
    element.setAttribute("id", i);
    element.setAttribute("name", "button");
    element.setAttribute('onClick', 'myFunction(this)');
  
    var bar = document.getElementById("messageBox");
    bar.appendChild(element);
    }
}

function myFunction(btn) {
 //   alert(btn.getAttribute('value') + " button clicked");
    var index=btn.getAttribute('value');
    messages.splice(index-1, 1);
    show();
    //buttonAdd();

  }