import { Form, Button, InputGroup } from 'react-bootstrap'
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSearch } from "@fortawesome/free-solid-svg-icons";

function AddNotes() {
  return (
    <InputGroup className="mb-3">
      <Form.Control type="text" placeholder="Add Notes..." />
      <Button size='sm' variant="primary">
        Add
      </Button>
    </InputGroup>
  );
}

export default AddNotes;