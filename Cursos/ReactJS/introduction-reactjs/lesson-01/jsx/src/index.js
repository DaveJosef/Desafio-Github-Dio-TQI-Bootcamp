import React from 'react';
import ReactDOM from 'react-dom';
import './styles.css';

const sum = (a, b) => a + b;

function renderizaJSX() {
  return (
    <div className='presentation' >
      <h1>Hello, World! I'm José David.</h1>
      <p>Result of sum equals {sum(1, 2)}</p>
    </div>
  );
}

const App = () => {

  return (
    <div>
      {renderizaJSX()}
    </div>
  );
}

const rootElement = document.getElementById('root');
ReactDOM.render(<App />, rootElement);
