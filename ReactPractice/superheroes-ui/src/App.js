import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import AllHeroes from './components/AllHeroes';
import {Route,Routes} from "react-router-dom";
import Heroform from './components/Heroform';



function App() {
  return (
    <>
     <Navbar expand="lg" className="bg-body-tertiary">
      <Container>
        <Navbar.Brand href="#home">Heroes</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#home">All Heroes</Nav.Link>
            <Nav.Link href="#link">Add Hero</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
      
        <Routes>
          <Route path="/allHeros" element={<AllHeroes/>} />
          <Route path="/addhero" element={<Heroform/>} />
          <Route path="/" element={<AllHeroes/>} />
        </Routes>

    </>
  );
  }

export default App;