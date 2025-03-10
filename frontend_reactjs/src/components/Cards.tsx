import React, { useEffect, useState } from 'react';
import axios from "axios";
import Card from 'react-bootstrap/Card';
import Badge from 'react-bootstrap/Badge';
import centralizedApis from 'CentralizedApiService'

function Cards() {

  interface Task {
    task_id: string;
    task_title: string;
    task_desc: string;
    status_id: string;
  }

  interface Status{
    status_id: string;
    status_code: string; 
    status_name: string;
  }


  
  
  const [tasks, setTasks] = useState<Task[]>([]); 
  const [statuses, setStatuses] = useState<Status[]>([]); 

    useEffect(() => {
      centralizedApis.getAllTodoItems
          .then(response => {
          
          const taskMap = response.data.todolist
          const statusMap = response.data.todo_status
          console.log(taskMap)
          console.log(statusMap)
          setTasks(taskMap);
          setStatuses(statusMap);
    })

  }, []);

  return (
    <div>
      { Array.isArray(tasks) && tasks.map((item, index) => {
        const status = statuses.find(status => status.status_id === item.status_id);
        let badgeClass = "secondary";
        if (status) {
          if (status.status_code === "CT") {
            badgeClass = "warning";
          } else if (status.status_code === "AT") {
            badgeClass = "success";
          } else if (status.status_code === "UT") {
            badgeClass = "primary"; 
          }
        }
        return(
          <Card key={index}>
            <Card.Body>
              <div className="d-flex justify-content-end">
                <Badge bg={badgeClass}>
                {status ? status.status_name : "Unknown Status"}
                </Badge>
              </div>
              <div>
              <Card.Title>{item.task_title}</Card.Title>
              <Card.Text className='cardTextDesc'>{item.task_desc}</Card.Text>
              </div>
            </Card.Body>
          </Card>
      );
      })}
      <br/>
    </div>    
  );
}

export default Cards;