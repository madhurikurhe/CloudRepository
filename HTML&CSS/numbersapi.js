var messages=[];

    function loadXMLDoc() {
        
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
          if (this.readyState == 4 && this.status == 200) {
            messages.push = this.responseText;
            console.log(messages);
            var s="";
            for(var i=0;i<messages.length;i++){
                s =messages[i].appendChild;
            }
            document.getElementById("messageBox").innerHTML=s;
            removegif();
          }
      }
        var x=document.getElementById("number").value;
        var url1="http://numbersapi.com/"+x;
        xhttp.open("GET", url1, true);
        xhttp.send();
    };
    
    
    
    function init(){
        showgif();
        setTimeout(function(){
 
      loadXMLDoc();
      },5000);
    }

    function showgif(){
        var img = document.createElement("img");
        img.src ="demo_wait.gif";
        var src = document.getElementById("x");
        img.height=50;
        img.width=50;
        src.appendChild(img);
    }

    function removegif(){
        var image_x = document.getElementById('x');
        image_x.parentNode.removeChild(image_x);
    }
  