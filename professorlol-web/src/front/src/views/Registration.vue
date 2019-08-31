<!--<template>-->
<!--<div>-->
<!--<label>ID</label><input name="id" placeholder="lol 계정 id" type="text" v-model="lolId">-->
<!--<input type="button" v-on:click="formSubmit" value="회원가입">-->
<!--</div>-->

<template>
  <v-container
    fill-height
    fluid
  >
    <v-row justify="center">
      <v-col
        cols="12"
        md="8"
      >
        <material-card>
          <h2>Register</h2>
          <p>Register Your LoL ID For Analyzing</p>
          <br/>
          <v-form>
            <v-container class="py-0">
              <v-row justify="center">
                <v-col
                  cols="12"
                  md="10">
                  <v-text-field
                    class="purple-input"
                    name="id"
                    outlined
                    label="LoL 계정 ID"></v-text-field>
                </v-col>
              </v-row>
              <v-row>
                <v-col
                  cols="12"
                  class="text-right"
                >
                  <v-btn
                    v-on:click="formSubmit"
                    color="success"
                  >
                    Professor LoL Sign Up
                  </v-btn>
                </v-col>
              </v-row>
            </v-container>
          </v-form>
        </material-card>
      </v-col>
    </v-row>
  </v-container>
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
