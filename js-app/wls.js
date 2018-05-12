var span = document.createElement("SPAN");
var txt = document.createTextNode(" close");
span.className = "close";
span.appendChild(txt);
messagearray.push(span);

for (i = 0; i < close.length; i++) {
  close[i].onclick = function() {
    var div = this.parentElement;
    div.style.display = "none";
    messagearray.splice(i,1);
    alert(messagearray.length);
  }
}