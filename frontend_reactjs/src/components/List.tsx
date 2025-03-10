import ListGroup from 'react-bootstrap/ListGroup';
import '../App.css';
import React, { useEffect, useState } from 'react';
import axios from "axios";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBriefcase, faLaptop, faUserGroup, faQuestionCircle } from "@fortawesome/free-solid-svg-icons";

function List() {

  interface Task {
    category_id: string;
    category_code: string;
    category_name: string;
  }

  

  const [tasks, setTasks] = useState<Task[]>([]); 
  

    useEffect(() => {
        axios.get('http://127.0.0.1:5000/api/data')
          .then(response => {
          setTasks(response.data.todo_category);
        })
    }, []);

    return(
    <ListGroup>
      { Array.isArray(tasks) && tasks.map((item, index) =>
      {
        // Set icon based on category_name
        let icon = faQuestionCircle; // Default icon to avoid "undefined" error
        if (item.category_name === "Work") {
          icon = faBriefcase;
        } else if (item.category_name === "Personal") {
          icon = faLaptop;
        } else if (item.category_name === "Social") {
          icon = faUserGroup;
        } 
      return (
      <ListGroup.Item className='listItem' action href="#" key={index}>
      <FontAwesomeIcon icon={icon} className='iconStyle' />
      {item.category_name}
      </ListGroup.Item>
      );
      })}
    </ListGroup>
    );
  }

export default List;