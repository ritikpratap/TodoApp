import Button from 'react-bootstrap/Button';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faPlus } from "@fortawesome/free-solid-svg-icons";

function AddTask() {
  return (
    <>
      <Button size='lg'>Add Task
        <FontAwesomeIcon icon={faPlus} />
      </Button>
    </>
  );
}

export default AddTask;