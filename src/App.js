import "./App.css";
import Home from "./Components/Home";
import About from "./Components/About";
import Work from  "./Components/Work";
import Testimonial from "./Components/Testimonial";
import Contact from "./Components/Contact";
import Footer from "./Components/Footer";
import { BrowserRouter,Routes,Route } from "react-router-dom";
import Navbar from "./Components/Navbar";
import Cart from "./Components/Cart";
import Bookings from "./Components/Bookings";


function App() {
  return (
    
    <BrowserRouter>
     <Navbar/>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/About" element={<About />} />
        <Route path="/Contact" element={<Contact />} />
        <Route path="/Testimonial" element={<Testimonial />} />
        <Route path="/Work" element={<Work />} />
        <Route path="/Footer" element={<Footer />} />
        <Route path="/Cart" element={<Cart />} />
        <Route path="/Bookings" element={<Bookings />} />
      </Routes>
    </BrowserRouter>
    
  );
}

export default App;
