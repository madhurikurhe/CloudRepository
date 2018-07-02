var messages=[];

function loadXMLDoc() {
    var response = '';        
    $(document).ready(function(){
                
            var x=$("#number").val();
            $.ajax(
            {type:"GET",
            url:"http://numbersapi.com/"+x,
            async:false,
            success: function(text){
            response=text;
            messages.push = response;
            console.log(messages);
            var s="";
            for(var i=0;i<messages.length;i++){
                s =messages[i].appendChild;
            }

            $("#messageBox").innerHTML=s;
            
            removegif();
        }});
    });
    
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
        var src=$("#x");
        img.height=50;
        img.width=50;
        src.append(img);
    }

    function removegif(){
        var image_x = $("#x");
        image_x.remove();
    }
  