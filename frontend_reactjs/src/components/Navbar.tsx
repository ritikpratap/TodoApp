import Tab from 'react-bootstrap/Tab';
import Tabs from 'react-bootstrap/Tabs';
import "../App.css"
import List from './List';

function NavBar() {
  return (
    <Tabs
      defaultActiveKey="list"
    >
      <Tab eventKey="list" title="List">
        <List />
      </Tab>
      <Tab eventKey="tag" title="Tag">
        <List />
      </Tab>
      <Tab eventKey="custom" title="Custom">
        <List />
      </Tab>
    </Tabs>
  );
}

export default NavBar;