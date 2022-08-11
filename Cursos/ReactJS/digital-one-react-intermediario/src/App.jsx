import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './App.css';
import { Home } from './Home';

function App() {
  return (
    <div className="App">
      <BrowserRouter basename='/' >
        <Switch>
          <Route path="/" exact component={Home} />
        </Switch>
      </BrowserRouter>
    
    </div>
  );
}

export default App;
