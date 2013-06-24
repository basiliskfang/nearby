var x=document.getElementById("latlon");

window.onload = function(){
    if(navigator.geolocation)
        navigator.geolocation.getCurrentPosition(showPosition, onError);
}

function onError(){
alert("Error!!!");}

function showPosition(position)
{
    x.innerHTML="Latitude: " + position.coords.latitude + 
        "<br>Longitude: " + position.coords.longitude;  
}
        