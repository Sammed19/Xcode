import './App.css';
import About from './components/About';
import Navbar from './components/Navbar';
import TextForm from './components/TextForm';
function App() {
  return (
    <>
   <Navbar title= "Zomato" abouttext="AboutZomato"/>
   <div className="container">
   
   <TextForm heading="Enter the text to Visualize"/> 
   </div>
    </>
  );
 
}

export default App;
