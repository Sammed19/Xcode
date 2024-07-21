const locationInput = document.getElementById('location');
const searchBtn = document.getElementById('search-btn');
const output = document.getElementById('output');

let currentSelection = "";

locationInput.addEventListener('input', (event) => {
    currentSelection = event.target.value;
});

function getWeather(location) {
    const apiKey = '3e1809d428c504133e0215dcb88fdc33'; // Insert your API key here
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${location}&appid=${apiKey}`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const city = data.name;
            const temperature = (data.main.temp - 273.15).toFixed(2); // Convert temperature to Celsius
            const description = data.weather[0].description;
            output.textContent = `Weather in ${city}: ${temperature}°C, ${description}`;
        })
        .catch(error => {
            console.error(error);
            output.textContent = "Error fetching weather data";
        });
}

searchBtn.addEventListener('click', () => {
    if (currentSelection) {
        getWeather(currentSelection);
    } else {
        output.textContent = "Please enter a location";
    }
});
