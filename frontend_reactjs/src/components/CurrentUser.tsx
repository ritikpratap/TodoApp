import { Container, Row, Col, Dropdown, Image } from "react-bootstrap";
import user from "../image/profile_user_dummy.jpg"
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBell } from "@fortawesome/free-solid-svg-icons";

function CurrentUser()  {
    return(
    <Container> 
        <Row>
            <Col md={8}></Col>
            <Col md={2}>
                <Dropdown>
                    <Dropdown.Toggle variant="light" bsPrefix="toggle">
                        <FontAwesomeIcon icon={faBell} width="30" height="30" />
                    </Dropdown.Toggle>

                    <Dropdown.Menu>
                        <Dropdown.Item href="#/action-1">dummy1</Dropdown.Item>
                        <Dropdown.Item href="#/action-2">dummy2</Dropdown.Item>
                    </Dropdown.Menu>
                </Dropdown>
            </Col>
            <Col md={2}>
                <Dropdown>
                    <Dropdown.Toggle variant="light" bsPrefix="toggle">
                        <Image src={user} alt="Dropdown Icon" width="30" height="30" roundedCircle />
                    </Dropdown.Toggle>

                    <Dropdown.Menu>
                        <Dropdown.Item href="#/action-1">Details</Dropdown.Item>
                        <Dropdown.Item href="#/action-2">Log Out</Dropdown.Item>
                    </Dropdown.Menu>
                </Dropdown>
            </Col>
        </Row>  

    </Container> 

    );
}

export default CurrentUser;