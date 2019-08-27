import React from 'react';
import '../App.css';
import Divider from '@material-ui/core/Divider';
import {BrowserRouter as Router, Link, Route} from 'react-router-dom'
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';

export default class DungeonInfo extends React.Component {

  constructor(props) {
    super(props);

    const pathname = window.location.pathname;
    const paths = pathname.split('/');
    const dungeonId = paths[2];

    this.titleize = this.titleize.bind(this);

    const dungeonName = this.titleize(dungeonId.replace('-', ' '));
    this.state = {
      dungeonName: dungeonName
    }

  }

  // temporary hack
  titleize(sentence) {
    if(!sentence.split) return sentence;
    var _titleizeWord = function(string) {
            return string.charAt(0).toUpperCase() + string.slice(1).toLowerCase();
        },
        result = [];
    sentence.split(" ").forEach(function(w) {
        result.push(_titleizeWord(w));
    });
    return result.join(" ");
  }


  render() {
    return(
      <div className="body-dungeon">
        <div className="title">
          {this.state.dungeonName}
        </div>
        <Divider style={{"background-color":"#8a8a8a"}} />
        <div className="sub-info">
          <h4> General Info </h4>
          Parent Dungeon: Ultimate Arena
          <br/>
          Stamina: 99
          <br/>
          Floors: 21
          <h4> Dungeon Mechanics </h4>
          Poison Skyfall, Damage Absorb, etc.
        </div>
        <div className="floors">
          <div className="floor">
            <div className="title-cont"><div className="floor-title"><h4> Floor 1 </h4></div><div className="floor-sub-title">- &nbsp;4 appear</div></div>
            <Table>
              <TableHead>
                <TableRow>
                  <TableCell style={{"border-bottom":"0"}}>Enemy</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Typing</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Turn Timer</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Attack</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Defense</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>HP</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Moveset</TableCell>
                </TableRow>
              </TableHead>
              <TableBody style={{"border-bottom":"0"}}>
                <TableRow>
                  <TableCell style={{"border-bottom":"0"}}>Red Evolution Mask</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Evo Material</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>1</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>22000</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>500000000</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>6</TableCell>
                  <TableCell style={{"border-bottom":"0"}}></TableCell>
                </TableRow>
              </TableBody>
            </Table>
          </div>
          <Divider style={{"background-color":"#8a8a8a"}} />
          <div className="floor">
            <div className="title-cont"><div className="floor-title"><h4> Floor 2 </h4></div><div className="floor-sub-title">- &nbsp;4 appear</div></div>
            <Table>
              <TableHead>
                <TableRow>
                  <TableCell style={{"border-bottom":"0"}}>Enemy</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Typing</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Turn Timer</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Attack</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Defense</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>HP</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Moveset</TableCell>
                </TableRow>
              </TableHead>
              <TableBody style={{"border-bottom":"0"}}>
                <TableRow>
                  <TableCell style={{"border-bottom":"0"}}>Blue Evolution Mask</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>Evo Material</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>1</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>22000</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>500000000</TableCell>
                  <TableCell style={{"border-bottom":"0"}}>6</TableCell>
                  <TableCell style={{"border-bottom":"0"}}></TableCell>
                </TableRow>
              </TableBody>
            </Table>
          </div>
        </div>
        
      </div>
    );
  }
  
}

