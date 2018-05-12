var messagearray = [];
 
      function newElement() {

        var inputValue = document.getElementById("input").value ;
        
        if (inputValue === '') {
          alert("You must write something!");
        } else {

         messagearray.push(inputValue);
         var length1=messagearray.length;
         alert(length1);
        }
        
        document.getElementById("input").value = "";
 
  document.getElementById("display").innerHTML=messagearray;
  document.body.style.backgroundColor = "pink";
alert("Color is:" + document.body.style.backgroundColor);
  
var removeButton = document.createElement('button');
removeButton.appendChild(document.createTextNode("remove"));
messagearray.push(removeButton);
  
/*
for(var i=0;i<messagearray.length;i++)
  {
      console.log(messagearray[i]);
  }
  */ 
}