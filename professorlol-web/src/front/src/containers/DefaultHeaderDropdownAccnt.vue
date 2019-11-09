<template>
  <AppHeaderDropdown no-caret right>
    <template slot="header">
      <img
        alt="admin@bootstrapmaster.com"
        class="img-avatar"
        src="img/avatars/6.jpg"/>
    </template>
    \
    <template slot="dropdown">

      <b-dropdown-header
        class="text-center"
        tag="div">
        <strong>Settings</strong>
      </b-dropdown-header>
      <b-dropdown-item><i class="fa fa-user"/> Profile</b-dropdown-item>
      <b-dropdown-item><i class="fa fa-wrench"/> Settings</b-dropdown-item>
      <b-dropdown-divider/>
      <!--<b-dropdown-item><i class="fa fa-shield"/> Lock Account</b-dropdown-item>-->
      <b-dropdown-item><i class="fa fa-lock"/> Logout</b-dropdown-item>
    </template>
  </AppHeaderDropdown>
</template>

<script>
  import {HeaderDropdown as AppHeaderDropdown} from '@coreui/vue'

  export default {
    name: 'DefaultHeaderDropdownAccnt',
    components: {
      AppHeaderDropdown
    },
    data: () => {
      return {itemsCount: 42}
    }
  }
</script>
