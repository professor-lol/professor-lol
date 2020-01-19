import 'alertifyjs/build/alertify.min.js'
import 'alertifyjs/build/css/alertify.min.css'
import 'alertifyjs/build/css/themes/default.min.css'
import alertify from "alertifyjs";

const alertTitle = "시스템 알림";

function useHandler(error) {
    return !error.config.hasOwnProperty('handleError') || error.config.handleError;
}

async function onFailGlobal(error) {
    if (error === undefined) {
        alertify.alert(alertTitle, "서버 응답이 없습니다.").set('closable', false);
        return;
    }

    switch (error.status) {
        case 401:
            alertify.alert(alertTitle, "세션이 만료되었습니다.", () => {
                window.location.reload();
            }).set('closable', true);
            break;
        case 404:
            alertify.alert(alertTitle, "잘못된 요청입니다.").set('closable', false);
            break;
        default:
            alertify.alert(alertTitle, "오류가 발생하였습니다.").set('closable', false);
            break;
    }
}

function errorResponseHandler(error) {
    if (useHandler(error)) {
        onFailGlobal(error.response);
    }
    return Promise.reject(error.response)
}

export default errorResponseHandler;
