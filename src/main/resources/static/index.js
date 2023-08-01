$(document).ready(function (){
    showData();
});

function showData() {
    $.ajax({
        url: '/sample-data',
        type: 'GET',
        dataType: 'json',
        success: function (json) {
            console.log(json);
            var tableBodyAAA = "";
            $.each(json.commandAAAList,function (index, item){
                tableBodyAAA += `<tr>
                                <th scope="col">${item.id}</th>
                                <th scope="col">${item.command}</th>
                                <th scope="col">${item.sender}</th>
                                <th scope="col">${item.valuesA}</th>
                                <th scope="col">${item.latitude}</th>
                                <th scope="col">${item.longitude}</th>
                                <th scope="col">${item.valuesB}</th>
                                <th scope="col">${item.dataLength}</th>
                                <th scope="col">${item.YN}</th>
                                <th scope="col">${item.active}</th>
                                <th scope="col">${item.valuesC}</th>
                                <th scope="col">${item.valuesD}</th>
                                <th scope="col">${item.onAndOff}</th>
                                <th scope="col">${item.lengthData}</th>
                                <th scope="col">${item.valuesE}</th>
                                <th scope="col">${item.valuesF}</th>
                                <th scope="col">${item.specialData}</th>
                                <th scope="col">${item.fieldData}</th>
                                <th scope="col">${item.totalData}</th>
                                <th scope="col">${item.checksum}</th>
                                </tr>`;
            });
            $('[name="tableBodyAAA"]').html(tableBodyAAA);

            var tableBodyBBB = "";
            $.each(json.commandBBBList,function (index, item){
                tableBodyBBB += `<tr>
                                <th scope="col">${item.id}</th>
                                <th scope="col">${item.command}</th>
                                <th scope="col">${item.sender}</th>
                                <th scope="col">${item.valuesA}</th>
                                <th scope="col">${item.checkYN}</th>
                                <th scope="col">${item.receiveValue}</th>
                                </tr>`;
            });
            $('[name="tableBodyBBB"]').html(tableBodyBBB);

            var tableBodyCCC = "";
            $.each(json.commandCCCList,function (index, item){
                tableBodyCCC += `<tr>
                                <th scope="col">${item.id}</th>
                                <th scope="col">${item.command}</th>
                                <th scope="col">${item.sender}</th>
                                <th scope="col">${item.valuesA}</th>
                                <th scope="col">${item.checkYN}</th>
                                <th scope="col">${item.NEBD}</th>
                                <th scope="col">${item.latitude}</th>
                                <th scope="col">${item.longitude}</th>
                                <th scope="col">${item.valuesB}</th>
                                </tr>`;
            });
            $('[name="tableBodyCCC"]').html(tableBodyCCC);

            var tableBodyDDD = "";
            $.each(json.commandDDDList,function (index, item){
                tableBodyDDD += `<tr>
                                <th scope="col">${item.id}</th>
                                <th scope="col">${item.command}</th>
                                <th scope="col">${item.sender}</th>
                                <th scope="col">${item.checkYN}</th>
                                <th scope="col">${item.returnValue}</th>
                                </tr>`;
            });
            $('[name="tableBodyDDD"]').html(tableBodyDDD);
        },
        error: function (json) {
            alert(json);
        }
    });
}

function sendDataInsert() {
    $.ajax({
        url: '/sample-data-insert',
        type: 'GET',
        dataType: 'json',
        data: {
            sampleData: $('[name="sampleData"]').val(),
        },
        success: function (json) {
            showData();
        },
        error: function (json) {
            alert(json);
        }
    });
}