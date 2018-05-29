

    function loadXMLDoc() {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
          if (this.readyState == 4 && this.status == 200) {
            document.getElementById("demo").innerHTML =this.responseText;
            removeSpinner($('body'));
            removegif();
          }
      }
        var x=document.getElementById("number").value;
        var url1="http://numbersapi.com/"+x;
        xhttp.open("GET", url1, true);
        xhttp.send();
      
      };
      
      function init(){
        addSpinner($('body'));
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

function addSpinner(el, static_pos)
{
  var spinner = el.children('.spinner');
  if (spinner.length && !spinner.hasClass('spinner-remove')) return null;
  !spinner.length && (spinner = $('<div class="spinner' + (static_pos ? '' : ' spinner-absolute') + '"/>').appendTo(el));
  animateSpinner(spinner, 'add');
}

function removeSpinner(el, complete)
{
  var spinner = el.children('.spinner');
  spinner.length && animateSpinner(spinner, 'remove', complete);
}

function animateSpinner(el, animation, complete)
{
  if (el.data('animating')) {
    el.removeClass(el.data('animating')).data('animating', null);
    el.data('animationTimeout') && clearTimeout(el.data('animationTimeout'));
  }
  el.addClass('spinner-' + animation).data('animating', 'spinner-' + animation);
  el.data('animationTimeout', setTimeout(function()
   { animation == 'remove' && el.remove(); 
   complete && complete();}, parseFloat(el.css('animation-duration')) * 1000));
}