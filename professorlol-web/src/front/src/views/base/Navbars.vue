<template>
  <div class="wrapper">
    <div class="animated fadeIn">
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i><strong> Bootstrap Navbar </strong>
          <div class="card-header-actions">
            <a class="card-header-action" href="https://bootstrap-vue.js.org/docs/components/navbar"
               rel="noreferrer noopener" target="_blank">
              <small class="text-muted">docs</small>
            </a>
          </div>
        </div>
        <b-navbar toggleable="md" type="dark" variant="info">

          <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

          <b-navbar-brand href="#">NavBar</b-navbar-brand>

          <b-collapse id="nav_collapse" is-nav>

            <b-navbar-nav>
              <b-nav-item href="#">Link</b-nav-item>
              <b-nav-item disabled href="#">Disabled</b-nav-item>
            </b-navbar-nav>

            <!-- Right aligned nav items -->
            <b-navbar-nav class="ml-auto">

              <b-nav-form>
                <b-form-input class="mr-sm-2" placeholder="Search" size="sm" type="text"/>
                <b-button class="my-2 my-sm-0" size="sm" type="submit">Search</b-button>
              </b-nav-form>

              <b-nav-item-dropdown right text="Lang">
                <b-dropdown-item href="#">EN</b-dropdown-item>
                <b-dropdown-item href="#">ES</b-dropdown-item>
                <b-dropdown-item href="#">RU</b-dropdown-item>
                <b-dropdown-item href="#">FA</b-dropdown-item>
              </b-nav-item-dropdown>

              <b-nav-item-dropdown right>
                <!-- Using button-content slot -->
                <template slot="button-content">
                  <em>User</em>
                </template>
                <b-dropdown-item href="#">Profile</b-dropdown-item>
                <b-dropdown-item href="#">Signout</b-dropdown-item>
              </b-nav-item-dropdown>
            </b-navbar-nav>

          </b-collapse>
        </b-navbar>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i> <strong> Navbar </strong>
          <small>brand</small>
        </div>
        <div>
          <!-- Image and text -->
          <b-navbar type="light" variant="faded">
            <b-navbar-brand href="#" tag="h1">
              <img alt="BV" class="d-inline-block align-top" src="https://placekitten.com/g/30/30">
              BootstrapVue
            </b-navbar-brand>
          </b-navbar>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i> <strong> Navbar </strong>
          <small>text</small>
        </div>
        <div>
          <b-navbar toggleable type="light" variant="light">
            <b-navbar-toggle target="nav_text_collapse"></b-navbar-toggle>
            <b-navbar-brand>BootstrapVue</b-navbar-brand>
            <b-collapse id="nav_text_collapse" is-nav>
              <b-navbar-nav>
                <b-nav-text>Navbar text</b-nav-text>
              </b-navbar-nav>
            </b-collapse>
          </b-navbar>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i> <strong> Navbar </strong>
          <small>dropdown</small>
        </div>
        <div>
          <b-navbar toggleable type="dark" variant="primary">
            <b-navbar-toggle target="nav_dropdown_collapse"></b-navbar-toggle>
            <b-collapse id="nav_dropdown_collapse" is-nav>
              <b-navbar-nav>
                <b-nav-item href="#">Home</b-nav-item>
                <b-nav-item href="#">Link</b-nav-item>
                <!-- Navbar dropdowns -->
                <b-nav-item-dropdown right text="Lang">
                  <b-dropdown-item href="#">EN</b-dropdown-item>
                  <b-dropdown-item href="#">ES</b-dropdown-item>
                  <b-dropdown-item href="#">RU</b-dropdown-item>
                  <b-dropdown-item href="#">FA</b-dropdown-item>
                </b-nav-item-dropdown>
                <b-nav-item-dropdown right text="User">
                  <b-dropdown-item href="#">Account</b-dropdown-item>
                  <b-dropdown-item href="#">Settings</b-dropdown-item>
                </b-nav-item-dropdown>
              </b-navbar-nav>
            </b-collapse>
          </b-navbar>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i> <strong> Navbar </strong>
          <small>form</small>
        </div>
        <div>
          <b-navbar type="light" variant="light">
            <b-nav-form>
              <b-form-input class="mr-sm-2" placeholder="Search" type="text"></b-form-input>
              <b-button class="my-2 my-sm-0" type="submit" variant="outline-success">Search</b-button>
            </b-nav-form>
          </b-navbar>
        </div>
      </b-card>
      <b-card
        footer-tag="footer"
        header-tag="header">
        <div slot="header">
          <i class="fa fa-align-justify"></i> <strong> Navbar </strong>
          <small>input group</small>
        </div>
        <div>
          <b-navbar type="light" variant="light">
            <b-nav-form>
              <b-input-group left="@">
                <b-form-input class="mr-sm-2" placeholder="Username" type="text"></b-form-input>
              </b-input-group>
            </b-nav-form>
          </b-navbar>
        </div>
      </b-card>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'navbars'
  }
</script>

