import axios from "axios";

const API_BASE_URL = "http://localhost:8080/todo"; // Backend URL

const centralizedApis = {
    getAllTodoItems: () => axios.get(`${API_BASE_URL}/all/items`),
    getAllRoles: () => axios.get(`${API_BASE_URL}/all/roles`),
    getAllStatus: () => axios.get(`${API_BASE_URL}/all/status`),
    getAllUsers: () => axios.get(`${API_BASE_URL}/all/users`),
    getAllTags: () => axios.get(`${API_BASE_URL}/all/tags`),
    // createOrder: (orderData) => axios.post(`${API_BASE_URL}/orders`, orderData),
};

export default CentralizedApiService;
