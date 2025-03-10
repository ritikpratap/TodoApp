import ListGroup from 'react-bootstrap/ListGroup';
import '../App.css';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faCalendarDays, faCheck, faCircleExclamation, faCubesStacked, faMedal } from "@fortawesome/free-solid-svg-icons";

function FilterList() {
    return(
    <ListGroup>
        <h6 className='mainHeader'>Filters</h6>
      <ListGroup.Item action href="#work" className='filterListItem'>
      <FontAwesomeIcon icon={faCubesStacked} className='iconStyle' />
        Active Task
      </ListGroup.Item>
      <ListGroup.Item action href="#personal" className='filterListItem'>
      <FontAwesomeIcon icon={faMedal} className='iconStyle' />
        Assigned To Me
      </ListGroup.Item>
      <ListGroup.Item action href="#social" className='filterListItem'>
      <FontAwesomeIcon icon={faCalendarDays} className='iconStyle' />
        Upcoming
      </ListGroup.Item>
      <ListGroup.Item action href="#social" className='filterListItem'>
      <FontAwesomeIcon icon={faCircleExclamation} className='iconStyle' />
        Overdue
      </ListGroup.Item>
      <ListGroup.Item action href="#social" className='filterListItem'>
      <FontAwesomeIcon icon={faCheck} className='iconStyle' />
        Completed
      </ListGroup.Item>
    </ListGroup>
    );
}

export default FilterList;