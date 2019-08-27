import React from 'react';
import './App.css';
import AppBar from '@material-ui/core/AppBar';
import TextField from '@material-ui/core/TextField';
import {BrowserRouter as Router, Link, Route} from 'react-router-dom';

import DungeonInfo from './components/DungeonInfo';
import HomePage from './components/HomePage';

function App() {
  return (
    <div className="app">
        <div className="header-bar">
          <AppBar className="header-bar" style={{"background-color":"#272e2b"}}>
            <div className="header-title"> Puzzle and Dungeons </div>
          </AppBar>
        </div>
        <div className="body">
          <Router>
            <Route path="/" exact render={() => <HomePage/>}/>
            <Route path="/dungeon/:id" exact render={() => <DungeonInfo/>}/>
          </Router>
        </div>
    </div>
  );
}

export default App;
