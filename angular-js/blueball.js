
var x,attempt=10;
var att=0;

function myFunction(b){
    att=att+1;
    if(b<x.innerHTML)
    document.getElementById(b).style.backgroundColor= "green";
    else
    document.getElementById(b).style.backgroundColor= "red";
    attempt=attempt-1;
    if(b!=x.innerHTML){
        confirm("attempt left:" +attempt);
    }
    if(b==x.innerHTML){
        document.getElementById(b).style.backgroundColor= "blue";
        confirm("Congradulation u won game in " +att +" attempt");
    }
    if (attempt==0 && b!=x.innerHTML)
    alert("Sorry...try again"); 
    
    
    
}

function generateNumber(){
    x = document.getElementById("demo")
    x.innerHTML= Math.floor((Math.random() * 50) + 1);
    

}

