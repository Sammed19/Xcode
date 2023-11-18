 let api="https://www.omdbapi.com/?apikey=3c1d79c&t="
let title=document.getElementById('title')
let ratings=document.getElementById('ratings')
let director =document.getElementById('director')
let writer =document.getElementById('writer')
let genre=document.getElementById('genre')
let desc=document.getElementById('desc')
let awards=document.getElementById('awards')
let collection=document.getElementById('collection')
let date=document.getElementById('date')
let poster=document.getElementById('poster')
let actors=document.getElementById('actors')

function searchMovie(){
    let movieName=document.getElementById('movieName')
    let query=api+movieName.value;
fetch(query).then((data)=>{return data.json()}).then((data)=>{
    title.innerText=data.Title;
    date.innerText=data.Released;
    poster.innerText=data.poster;
    genre.innerText=data.genre;
    director.innerText=data.Director;
    desc.innerText=data.Plot;
    awards.innerText=data.Awards;
    collection.innerText=data.BoxOffice;
    ratings.innerText=data.imdbRating;
    actors.innerText=data.Actors;
    writer.innerText=data.writer;
    poster.src=data.poster;
})



}