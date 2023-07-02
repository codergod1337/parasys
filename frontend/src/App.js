import { useEffect, useState } from 'react';
import './App.css';

import axios from 'axios';

function App() {
  const [results, setResults] = useState([]);

  useEffect(() => {
    async function getData(){
      const response = await fetch("http://localhost:8080/insert");
      const data = await response.json();
      setResults(data);
    }
    getData();
    console.log(results, "blabber");
  }, []);

  
  return (
    <div className="App">
      <header className="App-header">
        <h1>Meine Wunschliste</h1>
        <p>neuer Wunsch: <input id="69"></input> <button>add</button></p>
        <p></p>
      </header>
    </div>
  );
}







function eintragen(){
  alert(document.getElementById(69).value);
  document.getElementById(69).value = '';

}





export default App;
