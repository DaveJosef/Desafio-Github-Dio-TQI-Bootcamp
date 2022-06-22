import React, { Fragment } from 'react';
import ReactDOM from 'react-dom';
import './styles.css';

const elementTitle = <h1>Hello, World!</h1>;
const elementText = <p>Say something</p>;

const App = () => {
  return (
    <Fragment>
      {elementTitle}
      {elementText}
    </Fragment>
  );
}

const rootElement = document.getElementById('root');
ReactDOM.render(<App />, rootElement);
