import React, { Fragment } from 'react';
import ReactDOM from 'react-dom';
import './styles.css';

import ComponentA from './components/componentA/ComponentA';
import ComponentB from './components/componentB/ComponentB';
import Button from './components/button/Button';

const sum = (a, b) => alert(a + b);

const App = () => {

  return (
    <Fragment>
      <Button onClick={() => {sum(1, 2)}} name={'David'} />
      <ComponentA>
        <ComponentB>
          <Button onClick={() => {sum(2, 3)}} name={'David'} />
        </ComponentB>
      </ComponentA>
    </Fragment>
  );
}

const rootElement = document.getElementById('root');
ReactDOM.render(<App />, rootElement);
