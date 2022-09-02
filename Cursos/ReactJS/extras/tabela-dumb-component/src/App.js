import React from 'react';
import './App.css';
//import Form from './Components/form/Form';
import Table from './Components/table/Table';

class App extends React.Component {

  constructor(props) {
      super(props);
      this.state = {
          entries: [
            {
              id: 0,
              nome: "David",
              idade: 20,
              peso: 48,
            },
            {
              id: 1,
              nome: "Daniel",
              idade: 19,
              peso: 52,
            },
            {
              id: 2,
              nome: "Debora",
              idade: 21,
              peso: 55,
            },
            {  },
          ],
      };

  }

  render () {
    return (
    <>
      <div className="App">
          <Table entries={this.state.entries}></Table>
        
        <footer className="footer">
          Made by José David.
        </footer>
      </div>
      
    </>);
  };
}

export default App;
