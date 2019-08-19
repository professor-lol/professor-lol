<template>
    <div>
        <label>ID</label><input name="id" placeholder="lol 계정 id" type="text" v-model="lolId">
        <input type="button" v-on:click="formSubmit" value="회원가입">
    </div>
</template>

<script>
    import axios from 'axios';

    export default {
        name: "RegistrationForm",
        methods: {
            formSubmit() {
                axios.post('/api/v1/user', {
                        lolId: this.lolId,
                    },
                ).then(function (response) {
                    window.location = "/";
                }).catch(function (e) {
                    window.location = "/error"
                })
            },
        }
    }
</script>

<style scoped>

</style>