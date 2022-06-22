import React from 'react';
import ReactDOM from 'react-dom';
import './styles.css';

class App extends React.Component {
  render () {

    return <div className="App">
      <h1 className='title'>Hello, World!</h1>
    </div>
  }
}

const rootElement = document.getElementById('root');
ReactDOM.render(<App />, rootElement);
