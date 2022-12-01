import axios from "axios";

const EMPLOYEE_API_BASE_URL = "localhost:8080/api/employees/getAll";

class EmployeeService {
    
    getEmployees(){
        return axios.get(EMPLOYEE_API_BASE_URL);
    }

}

export default new EmployeeService()