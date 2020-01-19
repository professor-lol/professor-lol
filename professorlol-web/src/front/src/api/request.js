import axios from 'axios';
import errorHandler from './error-handler'

function createAxios(timeout) {
    return axios.create({
        timeout: timeout ? timeout : 5000,
        validateStatus: (status) => {
            return status >= 200 && status < 400;
        },
    });
}

function setInterceptors(axiosInstance) {
    axiosInstance.interceptors.response.use(
        response => response,
        errorHandler,
    );
}

function getAxios(timeout) {
    const axiosInstance = createAxios(timeout);
    setInterceptors(axiosInstance);
    return axiosInstance;
}

export default getAxios;