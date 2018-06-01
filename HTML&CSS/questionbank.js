
var randNum;
var questions = [
  {id:1,
   questionText: "Capital of India?",
   options: ["Delhi","Mumbai","Pune","Hydrabad"],
    answer: "a" },
  
    {id:2,
   questionText: "Capital of Maharashtra?",
   options: ["Delhi","Mumbai","Pune","Hydrabad"],
    answer: "b" },
    
    {id:3,
   questionText: "Capital of Jammu and kashmir?",
   options: ["Delhi","Shrinagar","Pune","Hydrabad"],
    answer: "b" },


    {id:4,
   questionText: "Capital of Goa?",
   options: ["Panji","Mumbai","Pune","Hydrabad"],
    answer: "a" },
    
    {id:5,
   questionText: "Capital of MadhyaPradesh?",
   options: ["Delhi","Mumbai","Bhopal","Hydrabad"],
    answer: "c" },    

{id:6,
   questionText: "Capital of Gujrat?",
   options: ["Delhi","Gandhinagar","Pune","Hydrabad"],
    answer: "b" },    

{id:7,
   questionText: "Capital of Himachal Pradesh?",
   options: ["Delhi","Mumbai","Pune","Shimla"],
    answer: "d" },    

    {id:8,
   questionText: "Capital of Meghalaya?",
   options: ["Delhi","Mumbai","Shillong","Hydrabad"],
    answer: "c" },    

{id:9,
   questionText: "Capital of Nagaland?",
   options: ["Delhi","Mumbai","Kohima","Hydrabad"],
    answer: "c" },    

{id:10,
   questionText: "Capital of Sikkim?",
   options: ["Delhi","Mumbai","Gangtok","Hydrabad"],
    answer: "c" },    

];

function init(){
    randNum=getRandomInt(0,9);
    alert(randNum);
    if(randNum<5)
    array1=[randNum,randNum+1,randNum+2,randNum+3,randNum+4];
 else
 array1=[randNum,randNum-1,randNum-2,randNum-3,randNum-4];
for(var i=0;i<5;i++){
var k=array1[i];
document.write(questions[k].id +"]. " +questions[k].questionText+"<br >");
//document.getElementById("demo").innerHTML=questions[k].id +"]. " +questions[k].questionText+"<br >";
if(i==0)
    createradio("option1",k);
    else if(i==1)
    createradio("option2",k);
    else if(i==2)
    createradio("option3",k);
    else if(i==3)
    createradio("option4",k);    
    else
    createradio("option5",k);    
    
}

    var x = document.createElement("INPUT");
    x.setAttribute("type", "button");
    x.setAttribute("name", "button");
    x.setAttribute("value", "submitTest");
    document.body.appendChild(x);
    x.addEventListener("click", checkanswers);
    
}

function checkanswers(){
    
    var flag=0;
    var count=0;
    var m=0;
    var optionss=["option1","option2","option3","option4","option5"];
    for(var s=0;s<5;s++){
    var radios=[];
    var radios = document.getElementsByName(optionss[m]);
    for (var i = 0; i < 4; i++) {
    if(radios[i].checked){
    if (radios[i].id==questions[array1[m]].answer) {
        flag==1;
        count=count+1;
        break;
    }
    }
}
m++;
    }
alert(count +" answers correct");

}

function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min)) + min;
}


function createradio(options,k){
var x = document.createElement("INPUT");
    x.setAttribute("type", "radio");
    x.setAttribute("name", options);

    x.setAttribute("id", "a");
    x.setAttribute("checked",true);
    document.body.appendChild(x);
     document.write(questions[k].options[0]+"<br >");
    //document.getElementById("demo").innerHTML=questions[k].options[0]+"<br >";
    
    var x = document.createElement("INPUT");
    x.setAttribute("type", "radio");
    x.setAttribute("name", options);
    x.setAttribute("id", "b");
    
    document.body.appendChild(x);
    document.write(questions[k].options[1]+"<br >");
    //document.getElementById("demo").innerHTML=questions[k].options[1]+"<br >";

    var x = document.createElement("INPUT");
    x.setAttribute("type", "radio");
    x.setAttribute("name", options);
    
    x.setAttribute("id", "c");
    document.body.appendChild(x);
    document.write(questions[k].options[2]+"<br >");
   // document.getElementById("demo").innerHTML=questions[k].options[2]+"<br >";
    var x = document.createElement("INPUT");
    x.setAttribute("type", "radio");
    x.setAttribute("name",options);
    
    x.setAttribute("id", "d");
    document.body.appendChild(x); 
    document.write(questions[k].options[3]+"<br >");    
   // document.getElementById("demo").innerHTML=questions[k].options[3]+"<br >";
}