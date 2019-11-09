<template>
  <div class="app flex-row align-items-center">
    <div class="container">
      <b-row class="justify-content-center">
        <b-col md="8">
          <b-card-group>
            <b-card class="p-4" no-body>
              <b-card-body>
                <b-form>
                  <h1>Login</h1>
                  <p class="text-muted">Sign In to your account</p>
                  <b-input-group class="mb-3">
                    <b-input-group-prepend>
                      <b-input-group-text><i class="icon-user"></i></b-input-group-text>
                    </b-input-group-prepend>
                    <b-form-input autocomplete="username email" class="form-control" placeholder="Username"
                                  type="text"/>
                  </b-input-group>
                  <b-input-group class="mb-4">
                    <b-input-group-prepend>
                      <b-input-group-text><i class="icon-lock"></i></b-input-group-text>
                    </b-input-group-prepend>
                    <b-form-input autocomplete="current-password" class="form-control" placeholder="Password"
                                  type="password"/>
                  </b-input-group>
                  <b-row>
                    <b-col cols="6">
                      <b-button class="px-4" variant="primary">Login</b-button>
                    </b-col>
                    <b-col class="text-right" cols="6">
                      <b-button class="px-0" variant="link">Forgot password?</b-button>
                    </b-col>


                  </b-row>
                  <b-row>
                    <b-col cols="6">
                      <a class="google-btn" href="/oauth2/authorization/google">
                        <img src="@/assets/loginButton/google_signin_normal.png"/>
                      </a>
                    </b-col>
                  </b-row>
                </b-form>
              </b-card-body>
            </b-card>
            <b-card class="text-white bg-primary py-5 d-md-down-none" no-body style="width:44%">
              <b-card-body class="text-center">
                <div>
                  <h2>Sign up</h2>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                    labore et dolore magna aliqua.</p>
                  <b-button class="active mt-3" variant="primary">Register Now!</b-button>
                </div>
              </b-card-body>
            </b-card>
          </b-card-group>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Login'
  }
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
