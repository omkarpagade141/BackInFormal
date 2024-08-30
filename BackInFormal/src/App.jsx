import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import './App.css'
import Login from './Components/Login/Login';
import Dashboard from './Components/Dashboard/Dashboard';

function App() {
  

  return (
    <>
       <Router>
          <div>
            <Routes>
              <Route path="/" element={<Login   />} />
              <Route path="/dashboard/*" element={<Dashboard /> }  />
            </Routes>
          </div>
        </Router>
    </>
  )
}

export default App
