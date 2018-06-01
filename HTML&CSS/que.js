
var randNum;
var ints=[];
var num=5;
var min=1;
var max=10;
   
      function getRandomInts() {   
        while (ints.length < num) {
           randNum = getRandomInt(0, 9);
          if(!ints.indexOf(randNum) > -1){
            ints.push(randNum);
            console.log(randNum);
      
          }
      
        }
       
        return ints;
      }
      
      function existingNumber(){
        for(var i=0;i<5;i++){
            if(ints[i]==randNum)
            return true;
        }
        return false;
        }
        function getRandomInt(min, max) {
            return Math.floor(Math.random() * (max - min)) + min;
          }
    