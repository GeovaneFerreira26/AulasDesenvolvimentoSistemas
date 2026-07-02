import axios from "axios";
// Import the axios library for making HTTP requests

// Create an instance of axios with a specified base URL and timeout
const api = axios.create({
    baseURL: "http://localhost:8080", // Base URL for the API
    timeout: 5000, // Timeout for requests in milliseconds
});

// Export the axios instance for use in other parts of the application
export default api;