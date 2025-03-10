import { Form, Button, InputGroup } from 'react-bootstrap'
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSearch } from "@fortawesome/free-solid-svg-icons";

function SearchBar() {
  return (
    <InputGroup className="mb-3">
      <Form.Control type="text" placeholder="Find your task..." />
      <Button size='sm' variant="primary">
        <FontAwesomeIcon icon={faSearch} />
      </Button>
    </InputGroup>
  );
}

export default SearchBar;