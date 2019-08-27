import React from 'react';
import '../App.css';
import AppBar from '@material-ui/core/AppBar';
import TextField from '@material-ui/core/TextField';
import {BrowserRouter as Router, Link, Route} from 'react-router-dom'

export default class HomePage extends React.Component {
  render() {
    return(
      <div className="body-center">
        <div className="title">
          Puzzle and Dungeons
        </div>
        <TextField className="search-field" hintText="Hint Text" />

      </div>
    );
  }
  
}

