import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './App.css';
import { Home } from './Home';
import Pagina404 from './NotFound';

function App() {
  return (
    <div className="App">
      <BrowserRouter basename='/' >
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="*" component={Pagina404} />
        </Switch>
      </BrowserRouter>
    
    </div>
  );
}

export default App;
