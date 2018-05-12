var select = document.getElementById('select');
select.onchange = function() {
  select.options[select.selectedIndex].style.backgroundColor = 'red';
}

var clean = document.getElementById('clean');
clean.onclick = function() {
    for(var i = 0; i < select.options.length; i++) {
      select.options[i].style.backgroundColor = '';  
    }
}