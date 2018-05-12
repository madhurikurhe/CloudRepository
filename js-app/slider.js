function add(numberOfButtons) {
    for(var i=0;i<numberOfButtons;i++)
    {
    var element = document.createElement("input");
    element.setAttribute("type", "button");
    element.setAttribute("value", "button");
    element.setAttribute("name", "button");
    var bar = document.getElementById("buttonBar");
    bar.appendChild(element);
    }
    }