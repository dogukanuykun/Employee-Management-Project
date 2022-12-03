import './App.css';
import ListEmployee from './components/ListEmployee';
import Header from './components/Header';
import Footer from './components/Footer';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import ListDepartment from './components/ListDepartment';


function App() {
  return (
    <div>
    
      <Router>
        
        <Header/>
        <div className="container">
          <Routes>
            <Route path='/' element={<ListEmployee/>}></Route>
            <Route path='/departments' element={<ListDepartment/>}></Route>
          </Routes>
        </div>
        <Footer />
      
      </Router>
    


    </div>
  );
}

export default App;
