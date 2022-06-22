import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import './styles.css';

class App extends Component {

  constructor(props) {
    super(props);
    this.state = {
      copo: 'refrigerante',
      clock: 1000,
    };
  }

  componentDidMount() {
    setTimeout(() => {
      this.setState({
        copo: 'suco'
      })
    }, 3000);
  }

  alterarCopo = () => {
    this.setState({
      copo: 'agua',
    });
  }

  render() {
    const { clock, copo } = this.state;

    return (
      <div className='presentation'>
        <h1>Clock value: {clock}</h1>
        <button onClick={this.alterarCopo}><h1>{copo}</h1></button>
      </div>
    );
  }
}

const rootElement = document.getElementById('root');
ReactDOM.render(<App />, rootElement);
