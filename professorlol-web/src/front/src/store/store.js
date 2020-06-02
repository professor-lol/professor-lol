// store.js
import Vue from "vue";
import Vuex from "vuex";
import {getAllLolInfo, getPatchNoteByChampionId} from "../api/lol-request";


Vue.use(Vuex);

export const store = new Vuex.Store({
    state: {
        patch: null,
        lol_info: null,
    },
    mutations: {
        viewPatchNote(state, payload) {
            getPatchNoteByChampionId(payload).then(
                res => {
                    console.log("patchNote api call");
                    state.patch = res.data();
                });
        },
        viewLolInfo(state) {
            getAllLolInfo().then(
                res => {
                    console.log("lolinfo api call");
                    console.log(res);
                    state.lol_info = res.data;
                });
        },
    }
});

