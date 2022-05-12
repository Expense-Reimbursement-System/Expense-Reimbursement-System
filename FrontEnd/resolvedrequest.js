const url = "http://localhost:3000"; //putting our base URL in a variable for cleaner code below
//eventually, we'll use this in fetch requests and make calls to our server by appending endpoints

//add an event listener to give our buttons functionality (using DOM selection)
//"When the getEmployeeButton gets clicked, execute the getEmployees function"
document.getElementById("getHistoryReimbButton").addEventListener("click", getAllReimbursement);
//document.getElementById("getSubmitButton").addEventListener("click", getSubmit);



//"When the loginButton gets clicked, execute the loginFunction"
//document.getElementById("loginButton").addEventListener("click", loginFunction);


//users is an async function which has a fetch request to get employees from our server
//remember, async makes a function return a Promise (which fetch requests return)
async function getAllReimbursement() {

    //we will send a fetch request to get out employee data
    //by default, fetch requests send GET requests (see how to send others like POST below)
    let response = await fetch(url + "/reimbursement", {
    //body:JSON.stringify,
    credentials: "include"});
    

    //log the response in the console just to see the response object (good for debugging)
    console.log(response);

    //control flow on the status code (which tells us whether the request was successful)
    //we can access the status code (as well as other stuff) through our response variable
    if(response.status === 200) { //"if the response has a status code of 200..."

        //parse the JSON we get back into a JS object
        //.json() is the JS method that takes json and turns it into a JS object
        let data = await response.json();

        //log the actual employee data that's been parsed from JSON (good for debugging)
        console.log(data);

        //For every Employee object we get back from our fetch request, put it in the table
        for(let reimbursements of data){

            //create a table row
            let row = document.createElement("tr");

            //create a data cell for each employee field
            let cell = document.createElement("td");
            //fill the cell with the appropriate employee data
            cell.innerHTML = reimbursements.reimb_id;
            //add the td element (data cell) to the tr element (table row)
            row.appendChild(cell);

            //we do this^^^^ for every column in users

            let cell2 = document.createElement("td");
            cell2.innerHTML = reimbursements.reimb_aumount;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursements.reimb_submitted;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursements.reimb_author;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = reimbursements.reimb_status_id;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursements.reimb_type_id_fk;
            row.appendChild(cell6);

            //append the tr (which we called "row") to the table body (tbody)
            //a new row will be appended FOR every employee that got returned in the fetch()
            document.getElementById("reimbursement").appendChild(row);

        }
        //so here, for every employee object, we create a new row, fill it with data, add it to table

    } else {
        //alert causes a popup!!
        alert("uh oh your session is inactive. Maybe not logged in? :/");
    }



    //remember, async makes a function return a Promise (which fetch requests return)
   
}
