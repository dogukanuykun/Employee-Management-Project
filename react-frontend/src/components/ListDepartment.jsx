import React, { useState, useEffect } from 'react'
import axios from 'axios';


export default function ListDepartment() {


    const [departments, setDepartments] = useState([]);

    

    useEffect(() => {
        axios.get('http://localhost:8080/api/departments')
        .then(res => {
            console.log(res)
            setDepartments(res.data)
        })
        .catch(err => {
            console.log(err)
        })
    });


    return (
    <div>

                <h1 className='text-center'>Departments List</h1>

                

                <div className='row'> 
                
                <table className='table table-striped table-bordered table-hover'>

                    <thead className='table-dark'>
                        <tr>
                            <th>Department ID</th>
                            <th>Department Name</th>
                        </tr>
                    </thead>

                    <tbody className='table-light'>

                        {
                            
                            departments?.map(department => (
                                <tr key={department.id}>
                                    <td>{department.id}</td>
                                    <td>{department.departmentName}</td>
                                </tr>
                            ))
                            
                        }

                    </tbody>

                </table>

                </div>
                
            </div>
  )
}
