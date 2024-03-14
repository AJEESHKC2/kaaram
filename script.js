document.getElementById('accountForm').addEventListener('submit',function(event)
{
 event.preventDefault();

const name=encodeURIComponent(document.getElementById('name').value);
const amount=encodeURIComponent(document.getElementById('amount').value);

const url='http://localhost:8081/splitapp/createaccount?name=${name}&amount=${amount}';

fetch(url).then(response=>response.text()).then(data=>{
    
    console.log(data);
    document.getElementById('response').textContent=data;
    alert('Account created');

}).catch(error=>{console.error('Error:', error);
alert('Error creating account');
}) 
});
