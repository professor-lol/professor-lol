<template>
  <AppHeader fixed>
    <SidebarToggler class="d-lg-none" display="md" mobile/>
    <b-link class="navbar-brand" to="#">
      <img alt="CoreUI Logo" class="navbar-brand-full" height="25" src="img/brand/logo.svg" width="89">
      <img alt="CoreUI Logo" class="navbar-brand-minimized" height="30" src="img/brand/sygnet.svg" width="30">
    </b-link>
    <SidebarToggler :defaultOpen=true class="d-md-down-none" display="lg"/>
    <b-navbar-nav class="d-md-down-none">
      <b-nav-item class="px-3" to="/dashboard">Dashboard</b-nav-item>
      <b-nav-item class="px-3" exact to="/users">Users</b-nav-item>
      <b-nav-item class="px-3">Settings</b-nav-item>
    </b-navbar-nav>
    <b-navbar-nav class="ml-auto">
      <b-nav-item class="d-md-down-none">
        <i class="icon-bell"></i>
        <b-badge pill variant="danger">5</b-badge>
      </b-nav-item>
      <b-nav-item class="d-md-down-none">
        <i class="icon-list"></i>
      </b-nav-item>
      <b-nav-item class="d-md-down-none">
        <i class="icon-location-pin"></i>
      </b-nav-item>
      <DefaultHeaderDropdownAccnt/>
    </b-navbar-nav>
    <AsideToggler class="d-none d-lg-block"/>
    <!--<AsideToggler class="d-lg-none" mobile />-->
  </AppHeader>
</template>
<script>
  import {AsideToggler, Header as AppHeader, SidebarToggler} from '@coreui/vue'
  import DefaultHeaderDropdownAccnt from './DefaultHeaderDropdownAccnt'

  export default {
    name: 'DefaultHeader',
    components: {
      AsideToggler,
      AppHeader,
      DefaultHeaderDropdownAccnt,
      SidebarToggler
    }
  }
</script>
