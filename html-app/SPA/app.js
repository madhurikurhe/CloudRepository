var Anchors = document.getElementsByTagName("a");

for (var i = 0; i < Anchors.length ; i++) {
    Anchors[i].addEventListener("click", 
        function (event) {
            event.preventDefault();
            if (confirm('Are you sure?')) {
                window.location = this.href;
            }
        }, 
        false);
}