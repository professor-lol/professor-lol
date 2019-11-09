<template>
  <div class="app">
    <DefaultHeader/>
    <div class="app-body">
      <AppSidebar fixed>
        <SidebarHeader/>
        <SidebarForm/>
        <SidebarNav :navItems="nav"></SidebarNav>
      </AppSidebar>
      <main class="main">
        <!--<Breadcrumb :list="list"/>-->
        <div class="container-fluid">
          <router-view></router-view>
        </div>
      </main>
    </div>
    <DefaultFooter/>
  </div>
</template>

<script>
  import nav from '@/_nav'
  import {
    Sidebar as AppSidebar,
    SidebarFooter,
    SidebarForm,
    SidebarHeader,
    SidebarMinimizer,
    SidebarNav
  } from '@coreui/vue'
  // import DefaultAside from './DefaultAside'
  import DefaultHeaderDropdownAccnt from './DefaultHeaderDropdownAccnt'
  import DefaultHeader from './DefaultHeader'

  export default {
    name: 'DefaultContainer',
    components: {
      AppSidebar,
      // AppAside,
      // DefaultAside,
      DefaultHeaderDropdownAccnt,
      SidebarForm,
      SidebarFooter,
      SidebarHeader,
      SidebarNav,
      SidebarMinimizer,
      DefaultHeader
    },
    data() {
      return {
        nav: nav.items
      }
    },
    computed: {
      name() {
        return this.$route.name
      },
      list() {
        return this.$route.matched.filter((route) => route.name || route.meta.label)
      }
    }
  }
</script>
