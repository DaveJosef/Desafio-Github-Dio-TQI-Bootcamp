import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './App.css';
import { Aula1 } from './aula-1/Aula1';
import { Aula2 } from './aula-2/Aula2';
import { Aula3 } from './aula-3/Aula3';
import { Aula4 } from './aula-4/Aula4';
import { Home } from './Home';
import Pagina404 from './NotFound';

function App() {
  return (
    <div className="App">
      <BrowserRouter basename='/' >
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/aula-1" exact component={Aula1} />
          <Route path="/aula-2" exact component={Aula2} />
          <Route path="/aula-3" exact component={Aula3} />
          <Route path="/aula-4" exact component={Aula4} />
          <Route path="*" component={Pagina404} />
        </Switch>
      </BrowserRouter>
    
    </div>
  );
}

export default App;
