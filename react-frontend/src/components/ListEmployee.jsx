import React, { useState, useEffect } from 'react'
import axios from 'axios';


export default function ListEmployee() {


    const [employees, setEmployees] = useState([]);

    

    useEffect(() => {
        axios.get('http://localhost:8080/api/employees')
        .then(res => {
            console.log(res)
            setEmployees(res.data)
        })
        .catch(err => {
            console.log(err)
        })
    });


    return (
    <div>

                <h1 className='text-center'>Employees List</h1>

                

                <div className='row'> 
                
                <table className='table table-striped table-bordered table-hover'>

                    <thead className='table-dark'>
                        <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th>Salary</th>
                            <th>Department ID</th>
                        </tr>
                    </thead>

                    <tbody className='table-light'>

                        {
                            employees?.map(employee => (
                                <tr key={employee.id}>
                                    <td>{employee.firstName}</td>
                                    <td>{employee.lastName} </td>
                                    <td>{employee.email}</td>
                                    <td>{employee.salary}</td>
                                    <td>{employee.department}</td>
                                </tr>
                            ))
                        }

                    </tbody>

                </table>

                </div>
                
            </div>
  )
}

/*
                        {
                            this.state.employees.map(
                                employee => 
                                <tr key={employee.id}>
                                    <td>{employee.first_name}</td>
                                    <td>{employee.last_name} </td>
                                    <td>{employee.email_id}</td>
                                    <td>{employee.salary}</td>
                                </tr>
                            )
                        }

*/

/*

class ListEmployeeComponent extends Component {
    constructor(props){
        super(props)
        this.state = {
            employees : []
        }
    }
    

    componentDidMount(){
        EmployeeService.getEmployees().then((response) => {
            this.setState({ employees : response.data })
        })
    }
    render() {
        return (
            
        );
    }
}

export default ListEmployeeComponent;

*/