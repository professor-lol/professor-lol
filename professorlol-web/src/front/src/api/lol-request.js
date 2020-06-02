import getAxios from "./request";

export function getPatchNoteByChampionId(championId) {
    return getAxios().get('api/v1/static/champion/' + championId);
}

export function getAllChampionInfoWithSimple() {
    return getAxios().get('/api/v1/champion/list');
}

// 사용하지 말기
export function saveMostChampion() {
    return getAxios().post('api/v1/most-champion');
}

export function getAllLolInfo() {
    return getAxios().get('api/v1/static/version');
}