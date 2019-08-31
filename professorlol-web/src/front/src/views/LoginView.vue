<template>
  <v-container
    fill-height
    fluid
  >
    <v-row justify="center">
      <v-col
        cols="12"
        md="4"
      >
        <h1>Login</h1>
        <br/>
        <v-form>
          <v-container class="py-0">
            <v-row justify="center">
              <v-text-field
                class="purple-input"
                outlined
                label="User Name"></v-text-field>
            </v-row>
            <v-row justify="center">
              <v-text-field
                class="purple-input"
                outlined
                type="password"
                label="password"></v-text-field>
            </v-row>
            <v-row justify="center">
              <v-btn color="success">
                Login
              </v-btn>
            </v-row>
            <br/>
            <br/>
            <v-row>
              <a class="google-btn" href="/oauth2/authorization/google">
                <img src="../assets/loginButton/google_signin_normal.png"/>
              </a>
            </v-row>
          </v-container>
        </v-form>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>

</script>

<style scoped>

  .google-btn {
    margin: 0px auto;
    display: block;
  }

  .google-btn img {
    height: 50px;

  }
</style>
