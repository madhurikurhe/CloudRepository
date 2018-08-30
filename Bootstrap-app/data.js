var globalID;

$(document).ready(function () {
    load1();
    $('form').on('change', function () {
        $.ajax({
            url: 'http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students',
            type: 'post',
            data: { 'id': $('select[name=id]').val() },
            success: function (data) {
                $('form').html(data);
            }
        });
    });


});


function load1() {
    $('#userdata tbody').empty();
    $.getJSON("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students", function (result) {
        $.each(result, function (i, f) {
            console.log(f);
            var tblRow = "<tr>" + "<td id=" + i + ">" + f.rollNo + "</td>" +
                "<td>" + f.name + "</td>" +
                "<td>" + f.age + "</td>" +
                "<td>" + f.email + "</td>" +
                "<td>" + f.date + "</td>" +
                "<td>" + f.isMale + "</td>" +
                "<td>" + "<input type='button' class='button' value='Delete' id= " + i + " onclick='deleterow(this)'>" + "</td>" +
                "<td>" + "<input type='button' class='button' value='Edit' id=" + i + " onclick='editrow(this)' style.backgoundcolor='red'>" + "</td>" +

                "</tr>"

            i++;
            $(tblRow).appendTo("#userdata tbody");
            $("#update").hide();
        });
    });
}

function editrow(id) {
    globalID = id;
    $(id).hide();
    $("#update").show();
    var currentRow = $(id).closest("tr");
    var rollnumber1 = currentRow.find("td:eq(0)").text();
    var name1 = currentRow.find("td:eq(1)").text();
    var age1 = currentRow.find("td:eq(2)").text();
    var email1 = currentRow.find("td:eq(3)").text();
    var date1 = currentRow.find("td:eq(4)").text();
    var gender1 = currentRow.find("td:eq(5)").text();

    $('#roll').val(rollnumber1);
    $('#name').val(name1);
    $('#age').val(age1);
    $('#email').val(email1);
    $('#date').val(date1);
    if (gender1 == 'true') {
        $("#male").prop("checked", true);
        $("#female").prop("checked", false);

    }
    else {
        $("#female").prop("checked", true);
        $("#male").prop("checked", false);

    }
}

function update(id) {
    id = globalID;
    var currentRow = $(id).closest("tr");
    var rollnumber1 = currentRow.find("td:eq(0)").text();
    var rollNumber = $('#roll').val();
    var age1 = $('#age').val();
    var name1 = $('#name').val();
    var email1 = $('#email').val();
    var date1 = $('#date').val();
    var gender;

    if ($('#male').is(':checked')) {
        gender = true;
    }
    else {
        gender = false;
    }
    var dataObject = { rollNo: rollNumber, name: name1, age: age1, email: email1, date: date1, isMale: gender };
    $.ajax({
        url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/" + rollnumber1,
        type: 'PUT',
        data: JSON.stringify(dataObject),
        contentType: 'application/json',
        success: function (result) {
            alert("Data updated successfully");
            load1();
        }
    });
}

function deleterow(id) {
    var currentRow = $(id).closest("tr");
    var rollnumber1 = currentRow.find("td:eq(0)").text();
    $.ajax({
        url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/" + rollnumber1,
        type: 'DELETE',
        success: function (result) {
            $(id).closest('tr').remove();
            alert(" Record Deleted");

        }
    });
}

function add() {
    var stat = true;
    $('input').each(function () {
        if (!$(this).val()) {
            return stat = false;
        }

        else {
            stat = true;
        }
    });

    if (stat == true) {

        var rollNumber = $('#roll').val();
        var age1 = $('#age').val();
        var name1 = $('#name').val();
        var email1 = $('#email').val();
        var date1 = $('#date').val();

        var gender;

        if ($('#male').is(':checked')) {
            gender = true;
        }
        else {
            gender = false;
        }

        var myKeyVals = { rollNo: rollNumber, name: name1, age: age1, email: email1, date: date1, isMale: gender }
        var saveData = $.ajax({
            type: 'POST',
            url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students",
            data: myKeyVals,
            dataType: "text",
            success: function (result) {
                load1();

            }
        });

        alert("Record Added");

    }
    else
        alert("Some fields are empty");


}

